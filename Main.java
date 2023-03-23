import Command.CommandHandler;
import DB.*;
import Entity.*;
import Factory.AnimalFactory;
import Handler.StringHandler;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        System.out.println("Введите перез пробел пользователья MySQL и пароль");

        // создаем сканер
        Scanner scan = new Scanner(System.in);

        // получаем строку от пользователя
        String userData = scan.nextLine();

        // записываем пользователя и пароль в массив
        String[] words = userData.split(" ");

        // подключаемся к бд используя полученные данные от пользователя
        MySqlConnector connector = new MySqlConnector(words[0], words[1]);

        // объект миграции бд
        Migration migration = new Migration(connector);

        // объект для манипуляции с данными бд
        CommandHandler commandHandler = new CommandHandler(connector);

        // объект для создания животных
        AnimalFactory factory = new AnimalFactory();

        // раскомментируйте нижнюю строку для создания таблиц в бд
         migration.up();

        // раскомментируйте нижнюю строку для удаления таблиц из бд
        // migration.down();

        System.out.println("Питомник. Ver. 0.1");
        System.out.println("Для добавления животного в базу питомника наберите ");
        System.out.println("название животного на английском языке ");
        System.out.println("(домашние: dog, cat, hamster или вьючные: horse, camel, donkey), ");
        System.out.println("кличку, цвет и возраст животного");
        System.out.println("Пример: dog Дружок черный 12");
        System.out.println("----------------------------------------------------------------");

        // получаем строку из сканера
        String data = scan.nextLine();

        // объект для валидации данных
        StringHandler stringhandler = new StringHandler(data);

        // валидируем полученные данные
        data = stringhandler.handle();

        // создаем объект по переданным данным из командной строки
        Animal animal = factory.createAnimal(data);

        // записываем объект в бд
        commandHandler.create(animal.getTableName(), animal.getName(), animal.getColor(), animal.getAge());
        // выводим на экран результат
        System.out.println(animal);
    }
}



