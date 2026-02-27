package Inan;
import java.util.Scanner;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] rps = {"가위", "바위", "보"};

        int winCount = 0;

        System.out.println("===================================");
        System.out.println("   가위바위보 경품 게임  ");
        System.out.println("===================================");
        System.out.println("총 5판을 진행하여 승리 횟수에 따라 경품을 드립니다!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\n[" + i + "번째 판]");
            System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");

            String playerInput = scanner.next();

            // 2. 잘못된 입력 처리
            if (!playerInput.equals("가위") && !playerInput.equals("바위") && !playerInput.equals("보")) {
                System.out.println("잘못된 입력입니다! '가위', '바위', '보' 중 하나만 입력해주세요.");
                i--; // 기회 보호!
                continue;
            }

            // 3. 컴퓨터의 무작위 선택
            int randomIndex = random.nextInt(3);
            String computerChoice = rps[randomIndex];

            System.out.println("나의 선택: " + playerInput);
            System.out.println("컴퓨터의 선택: " + computerChoice);

            // 4. 승패 판정 로직
            if (playerInput.equals(computerChoice)) {
                System.out.println("결과: 무승부입니다! ");
            } else if (
                    (playerInput.equals("가위") && computerChoice.equals("보")) ||
                            (playerInput.equals("바위") && computerChoice.equals("가위")) ||
                            (playerInput.equals("보") && computerChoice.equals("바위"))
            ) {
                System.out.println("결과: 플레이어 승리! ");
                winCount++;
            } else {
                System.out.println("결과: 컴퓨터 승리! (플레이어 패배) ");
            }
        }

        // 5. 게임 종료 및 경품 지급
        System.out.println("\n===================================");
        System.out.println("모든 게임이 종료되었습니다.");
        System.out.println("총 승리 횟수: " + winCount + "번");
        System.out.print(" 획득하신 경품: ");

        switch (winCount) {
            case 5:
                System.out.println("최신형 스마트폰!!! (전승 쾌거!)");
                break;
            case 4:
                System.out.println("고급 스마트워치!!");
                break;
            case 3:
                System.out.println("치킨 기프티콘!");
                break;
            case 2:
                System.out.println("아이스 아메리카노 한 잔");
                break;
            case 1:
                System.out.println("막대사탕 하나...");
                break;
            case 0:
            default:
                System.out.println("꽝! 다음 기회에 도전하세요. ㅠㅠ");
                break;
        }
        System.out.println("===================================");
    }
}