package Entity;

public class Cat extends Pet implements CatInterface {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String meow() {
        return "Also " + this.name + " can meow.";
    }

    @Override
    public String toString() {
        return super.toString() + this.meow();
    }
}
