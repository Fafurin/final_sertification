package Entity;

public class Hamster extends Pet implements HamsterInterface {

    public Hamster(String name, String color, int age) {
        super(name, color, age);
    }

    public String spin() {
        return "Also " + this.name + " can spin the wheel.";
    }

    @Override
    public String toString() {
        return super.toString() + this.spin();
    }

}
