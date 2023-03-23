package Entity;

public class Animal implements AnimalInterface {

    private static int count = 0;

    protected String name;

    protected String color;

    protected int age;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String eat() {
        return "It can eat, ";
    }

    public String sleep() {
        return "sleep ";
    }

    public String play() {
        return "and play. ";
    }

    public String toString() {
        return this.getClassName() + this.eat() + this.sleep() + this.play();
    }

    public String getClassName() {
        return this.name + " is a " + this.getClass().getSimpleName() + "! ";
    }
    public String getTableName() {
        return this.getClass().getSimpleName().toLowerCase() + 's';
    }

}
