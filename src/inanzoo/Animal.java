package inanzoo;
public class Animal {
    private String name;
    private int age;
    private int hunger;
    private int happiness;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.hunger = 50;
        this.happiness = 50;
    }

    public void feed() {
        hunger += 10;
        System.out.println(name + "에게 먹이를 주었습니다. (포만감: " + hunger + ")");
    }

    public void play() {
        happiness += 10;
        System.out.println(name + "와(과) 신나게 놀았습니다! (행복도: " + happiness + ")");
    }

    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }

    public void printStatus() {
        System.out.println("[" + name + " / " + age + "살] 포만감: " + hunger + ", 행복도: " + happiness);
    }

    public String getName() {
        return name;
    }
}