package Q1;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 구구단 단수를 입력하세요 (2~9): ");
        int dan = scanner.nextInt();

        // 2~9 사이의 숫자인지 확인
        if (dan < 2 || dan > 9){
            System.out.println("2에서 9 사이의 숫자를 입력하세요!");
        } else {
            System.out.println("==== " + dan + "단 ====");
            for (int i = 1; i <= 9; i++){
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        }
    }
}
