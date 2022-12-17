abstract class Animal {
    public String name;
    private int age;

    public int getAge() {
        return age;
    }

    public abstract Animal clone();

    public abstract void voice();

    @Override
    public String toString() {
        return name + ", age: " + getAge();
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
