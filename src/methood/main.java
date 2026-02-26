package methood;

public class main {
    public static void main(String[] args) {
        // 1. 객체를 객체화 (소환)
        Calculator calculator = new Calculator();
        // [정수형] 상자 = 정수

        // 1. 메서드 함수를 호출
       int result = calculator.sum(1, 2);
       System.out.println("result = " + result);
    }
}
