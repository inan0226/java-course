package inanzoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== 동물원 관리 시스템 ===");
            System.out.println("1. 동물 등록");
            System.out.println("2. 동물 목록 보기");
            System.out.println("3. 동물과 놀기");
            System.out.println("4. 먹이주기");
            System.out.println("5. 동물 상태 확인");
            System.out.println("6. 울음소리 듣기");
            System.out.println("7. 종료");
            System.out.print("메뉴를 선택하세요: ");

            try {
                // 요구사항의 '예외 처리'를 완벽하게 해내셨습니다!
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("동물 이름을 입력하세요: ");
                        String name = scanner.nextLine();
                        System.out.print("동물 나이를 입력하세요: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("동물 종류를 선택하세요 (1.강아지 2.고양이 3.독수리 4. 펭귄): ");
                        int type = Integer.parseInt(scanner.nextLine());

                        if (type == 1) {
                            zoo.addAnimal(new Dog(name, age));
                        }else if (type == 2) {
                            zoo.addAnimal(new Cat(name, age));
                        }else if (type == 3) {
                            zoo.addAnimal(new Eagle(name, age));
                        }
                        else if (type == 4) {
                            zoo.addAnimal(new Penguin(name, age));
                        }
                        else {
                            System.out.println("잘못된 종류입니다.");
                        }
                        break;

                    case 2:
                        zoo.showAllAnimals();
                        break;

                    case 3:
                        zoo.showAllAnimals();
                        System.out.print("놀아줄 동물의 번호를 선택하세요: ");
                        int playIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        zoo.playWithAnimal(playIndex);
                        break;

                    case 4:
                        zoo.showAllAnimals();
                        System.out.print("먹이를 줄 동물의 번호를 선택하세요: ");
                        int feedIndex = Integer.parseInt(scanner.nextLine()) - 1;

                        // 💡 추가된 부분: 어떤 먹이를 줄지 물어봅니다!
                        System.out.println("어떤 먹이를 주시겠습니까?");
                        System.out.print("1. 고기(MEAT)  2. 생선(FISH)  3. 풀(PLANT): ");
                        int foodChoice = Integer.parseInt(scanner.nextLine());

                        // 선택한 번호에 따라 알맞은 먹이를 쥐어줍니다.
                        if (foodChoice == 1) {
                            zoo.feedAnimal(feedIndex, food.MEAT);
                        } else if (foodChoice == 2) {
                            zoo.feedAnimal(feedIndex, food.FISH);
                        } else if (foodChoice == 3) {
                            zoo.feedAnimal(feedIndex, food.PLANT);
                        } else {
                            System.out.println("잘못된 먹이 선택입니다.");
                        }
                        break;

                    case 5:
                        zoo.showAllAnimals();
                        System.out.print("상태를 확인할 동물의 번호를 선택하세요: ");
                        int statusIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        zoo.showAnimalStatus(statusIndex);
                        break;

                    case 6:
                        zoo.showAllAnimals();
                        System.out.print("울음소리를 들을 동물의 번호를 선택하세요: ");
                        int soundIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        zoo.makeAnimalSound(soundIndex);
                        break;

                    case 7:
                        System.out.println("시스템을 종료합니다.");
                        isRunning = false;
                        break;

                    default:
                        System.out.println("1~7 사이의 숫자를 입력해주세요.");
                }
            } catch (Exception e) {
                // 숫자가 아닌 문자를 치거나, 없는 동물 번호를 치면 이쪽으로 와서 튕기지 않게 지켜줍니다.
                System.out.println("잘못된 입력입니다. 올바른 숫자로 다시 입력해주세요!");
            }
        }
        scanner.close();
    }
}