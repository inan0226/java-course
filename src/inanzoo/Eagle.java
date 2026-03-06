package inanzoo;

public class Eagle extends Bird implements Flyable{

    //생성자
    public Eagle(String name, int age){
        super(name,age);
        this.favoriteFood = food.MEAT;
    }

    // 1. Animal (Bird) 에게 물려받은 숙제 : 동물의 울음소리 완성하기
    @Override
    public void makeSound() {
        System.out.println(getName() + ": 캬악~ 캬악!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "이(가) 큰 날개를 펴고 하늘 높이 날아오릅니다 !");
        this.happiness += 20;
    }
}
