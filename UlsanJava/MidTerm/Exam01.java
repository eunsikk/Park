class Creature {
    private int age;
    protected String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    final public static int LIVE = 1;

    public void breathe() {}


    public Creature(int age, String name) {}
}


class Animal extends Creature {
    protected int toe;

    public Animal(int age2, String name2) {
        super(age2, name2);
    }

    public Animal() {
        super(10, "Lion");
    }
}


public class Exam01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal(15, "Park");
    }
}
