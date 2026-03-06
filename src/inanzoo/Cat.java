package inanzoo;

public class Cat extends Mammal {
    public Cat(String name, int age) {
        super(name, age);
        this.favoriteFood = food.FISH;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": 야옹~");
    }
}