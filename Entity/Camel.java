package Entity;

public class Camel extends PackAnimal implements CamelInterface {

    public Camel(String name, String color, int age) {
        super(name, color, age);
    }

    public String spit() {
        return "Also " + this.name + " can spit.";
    }

    @Override
    public String toString() {
        return super.toString() + this.spit();
    }
}
