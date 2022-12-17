import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 2);
        Cat cat = new Cat("Мурзик", 5);
        List<Animal> prototypes = new ArrayList<>();
        prototypes.add(dog);
        prototypes.add(cat);
        Random random = new Random();
        List<Animal> clones = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < 10; i++) {
            index = Math.abs(random.nextInt() % 2 == 0 ? 0 : 1);
            clones.add(prototypes.get(index).clone());
        }
        System.out.println(clones.toString());
    }
}