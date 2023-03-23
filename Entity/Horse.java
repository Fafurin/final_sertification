package Entity;

public class Horse extends PackAnimal implements HorseInterface {

    public Horse(String name, String color, int age) {
        super(name, color, age);
    }

    public String racing() {
        return "Also " + this.name + " can participate in racing.";
    }

    @Override
    public String toString() {
        return super.toString() + this.racing();
    }
}
