package inanzoo;

public abstract class Mammal extends Animal {

    // 생성자 : 이름과 나이를 받아서 부모의 생성자에게 전달
    public Mammal(String name, int age) {
        super(name, age); // 부크 클래스의 생성자 호출
    }
}
