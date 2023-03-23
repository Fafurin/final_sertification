package Entity;

public class Pet extends Animal {

    public Pet(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "It is a pet. ";
    }
}
