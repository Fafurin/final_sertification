package Factory;

import Entity.*;

public class AnimalFactory implements AnimalFactoryInterface {
    private Animal animal;
    private String animalType;
    private String name;
    private String color;
    private int age;

    public Animal createAnimal(String data) {
        this.handle(data);

        switch (this.animalType) {
            case "dog" -> this.animal = new Dog(this.name, this.color, this.age);
            case "cat" -> this.animal = new Cat(this.name, this.color, this.age);
            case "hamster" -> this.animal = new Hamster(this.name, this.color, this.age);
            case "horse" -> this.animal = new Horse(this.name, this.color, this.age);
            case "camel" -> this.animal = new Camel(this.name, this.color, this.age);
            case "donkey" -> this.animal = new Donkey(this.name, this.color, this.age);
        }
        return this.animal;
    }

    private void handle(String data) {
        String[] words = data.split(" ");
        this.animalType = words[0].toLowerCase();
        this.name = this.capitalize(words[1]);
        this.color = this.capitalize(words[2]);
        this.age = Integer.parseInt(words[3]);
    }

    private String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

}
