package inanzoo;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
        this.favoriteFood = food.MEAT;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": 멍멍! ");
    }
}