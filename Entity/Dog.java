package Entity;

public class Dog extends Pet implements DogInterface {

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public String bark() {
        return "Also " + this.name + " can bark.";
    }

    @Override
    public String toString() {
        return super.toString() + this.bark();
    }

}
