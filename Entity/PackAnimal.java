package Entity;

abstract public class PackAnimal extends Animal implements PackAnimalInterface {
    public PackAnimal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String carryLoads() {
        return "Also " + this.name + " can carry loads. ";
    }

    @Override
    public String toString() {
        return super.toString() + this.carryLoads();
    }

}
