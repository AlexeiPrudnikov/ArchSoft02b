import java.util.Random;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public Animal clone() {
        Random random = new Random();
        return new Cat(this.name + (random.nextInt(1000) + 1000), getAge());
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}
