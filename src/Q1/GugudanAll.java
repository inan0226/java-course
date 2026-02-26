package Q1;

public class GugudanAll {

    public static void main(String[] args) {

        for (int dan = 2; dan <= 9; dan++){ // 2단부터 9단까지 반복
            System.out.println("==== " + dan + "단 ====");

            for (int i = 1; i <= 9; i++) { // 1~9까지 곱하기
                System.out.println(dan + " x " + i + " = " + (dan * i ));
            }
            System.out.println(); // 단 간격을 띄우기
    }
}
}