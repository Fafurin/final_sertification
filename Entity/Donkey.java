package Entity;

public class Donkey extends PackAnimal implements DonkeyInterface {

    public Donkey(String name, String color, int age) {
        super(name, color, age);
    }

    public String stubborn() {
        return "Also " + this.name + " can be stubborn.";
    }

    @Override
    public String toString() {
        return super.toString() + this.stubborn();
    }

}
