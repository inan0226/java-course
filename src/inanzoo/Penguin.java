package inanzoo;

public class Penguin extends Bird implements Swimmable {

    // void를 빼서 완벽한 '생성자'로 만들었습니다!
    public Penguin(String name, int age){
        super(name, age);
        this.favoriteFood = food.FISH;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " 왁왁~!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + "이(가) 파닥파닥 수영을 해요!");
        this.happiness += 20;
    }
}