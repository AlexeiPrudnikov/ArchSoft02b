import java.util.Random;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public Animal clone() {
        Random random = new Random();

        return new Dog(this.name + random.nextInt(1000), getAge());
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }
}
