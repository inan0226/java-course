package Inan;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> history = new ArrayList<>(); // 계산 기록 바구니

        System.out.println("=== Java 계산기 시스템 ===");

        while (true) {
            try {
                // 1. 메뉴 출력
                System.out.println("\n=== [계산기 메뉴] ===");
                System.out.println("1. 계산하기 / 2. 이력 보기 / 3. 이력 지우기 / 0. 종료");
                System.out.print("선택: ");
                int menuChoice = scanner.nextInt();

                // 2. 메뉴 선택 처리
                if (menuChoice == 0) {
                    System.out.println("계산기를 종료합니다. 이용해 주셔서 감사합니다!");
                    break;
                }

                switch (menuChoice) {
                    case 1: // 계산하기
                        System.out.print("첫 번째 숫자를 입력하세요: ");
                        double num1 = scanner.nextDouble();

                        System.out.print("연산자를 입력하세요 (+, -, *, /, %, ^, sqrt): ");
                        String operator = scanner.next();

                        double num2 = 0;
                        double result = 0;

                        // sqrt가 아닐 때만 두 번째 숫자 입력받기
                        if (!operator.equals("sqrt")) {
                            System.out.print("두 번째 숫자를 입력하세요: ");
                            num2 = scanner.nextDouble();
                        }

                        // 연산 로직 수행
                        if (operator.equals("+")) {
                            result = num1 + num2;
                        } else if (operator.equals("-")) {
                            result = num1 - num2;
                        } else if (operator.equals("*")) {
                            result = num1 * num2;
                        } else if (operator.equals("/")) {
                            if (num2 == 0) {
                                System.out.println("⚠ 오류: 0으로 나눌 수 없습니다.");
                                continue;
                            }
                            result = num1 / num2;
                        } else if (operator.equals("%")) {
                            result = num1 % num2;
                        } else if (operator.equals("^")) {
                            result = Math.pow(num1, num2);
                        } else if (operator.equals("sqrt")) {
                            result = Math.sqrt(num1);
                        } else {
                            System.out.println("️ 오류: 잘못된 연산자입니다.");
                            continue;
                        }

                        // 결과 출력 및 저장
                        if (operator.equals("sqrt")) {
                            System.out.println("결과: sqrt(" + num1 + ") = " + result);
                        } else {
                            System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);
                        }
                        history.add(result); // 이력에 추가
                        break;

                    case 2: // 이력 보기
                        System.out.println("\n--- [계산 이력] ---");
                        if (history.isEmpty()) {
                            System.out.println("기록이 없습니다.");
                        } else {
                            for (Double h : history) {
                                System.out.println("계산 결과: " + h);
                            }
                        }
                        break;

                    case 3: // 이력 지우기
                        history.clear();
                        System.out.println("모든 이력이 삭제되었습니다.");
                        break;

                    default:
                        System.out.println("잘못된 메뉴 번호입니다. 다시 선택해주세요.");
                }

            } catch (InputMismatchException e) {
                System.out.println("️오류: 숫자를 정확히 입력해주세요.");
                scanner.nextLine(); // 잘못된 입력 비우기
            }
        }
        scanner.close();
    }
}