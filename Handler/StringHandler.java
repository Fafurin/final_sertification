package Handler;

import Exception.*;

public class StringHandler implements StringHandlerInterface {

    private final String string;

    public StringHandler(String string) {
        this.string = string;
    }

    // Убираем лишние пробелы
    private String removeSpaces(String string) {
        return string.trim().replaceAll("\\s{2,}", " ");
    }

    // Проверяем количество введенных слов
    private boolean isRequiredWordNumber(String[] words) throws NoRequiredDataAmountException {
        if (words.length == 4) {
            return true;
        } else throw new NoRequiredDataAmountException("Введено некорректное количество данных");
    }

    // Проверяем первое слово на соответсвие животным (dog, cat ...)
    private boolean isAnimal(String string) throws NoRequiredAnimalException {
        if (string.toLowerCase().matches("(dog|cat|hamster|horse|camel|donkey{1})")) {
            return true;
        } else throw new NoRequiredAnimalException("Введено некорректное животное");
    }

    // Проверяем кличку и окрас на отсутствие некорректных символов
    private boolean isLetter(String string) throws NoRequiredTextDataException {
        if (string.chars().allMatch(Character::isLetter)) {
            return true;
        } else throw new NoRequiredTextDataException("Введены некорректные строки");
    }

    // Проверяем возраст на соответствие цифрам
    private boolean isNumeric(String string) throws NoRequiredNumericDataException {
        if (string.chars().allMatch(Character::isDigit)) {
            return true;
        } else throw new NoRequiredNumericDataException("Введен некорректный возраст");
    }


    // Обрабатываем введенные данные
    public String handle() {
        String string = this.removeSpaces(this.string);
        String[] words = string.split(" ");

        try {
            this.isRequiredWordNumber(words);
        } catch (NoRequiredDataAmountException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        try {
            this.isAnimal(words[0]);
        } catch (NoRequiredAnimalException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        try {
            for (int i = 1; i < 3; i++) {
                this.isLetter(words[i]);
            }
        } catch (NoRequiredTextDataException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        try {
            this.isNumeric(words[3]);
        } catch (NoRequiredNumericDataException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        return string;
    }

}