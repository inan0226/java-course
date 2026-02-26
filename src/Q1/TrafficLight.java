package Q1;
import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
        String light = scanner.nextLine(); // 사용자의 입력을 받음

        // TODO if-else if-else 문을 사용하여 신호등 로직을 구현하세요.
        if (light.equals("초록불")){
            System.out.println("건너세요!");

        } else if (light.equals("노란불")) {
            System.out.println("주의하세요!");

        } else if (light.equals("빨간불")) {
            System.out.println("멈추세요!");

        }else {
            System.out.println("잘못된 입력입니다.");
        }

    }
}
