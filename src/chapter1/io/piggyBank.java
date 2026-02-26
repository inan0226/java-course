import java.util.Scanner;

public class piggyBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("오늘 상태를 입력하세요 (기쁨/지출많음/여유있음/피곤): ");
        String state = sc.nextLine();

        // 유효성 검사
        if (!state.equals("기쁨") &&
                !state.equals("지출많음") &&
                !state.equals("여유있음") &&
                !state.equals("피곤")) {
            System.out.println(" 상태는 (기쁨/지출많음/여유있음/피곤) 중 하나여야 합니다.");
            return;
        }

        // 그룹 매핑
        int group;
        if ("지출많음".equals(state)) group = 0;
        else if ("피곤".equals(state)) group = 1;
        else if ("기쁨".equals(state)) group = 2;
        else group = 3; // 여유있음

        // 스위치
        switch (group) {
            case 0:
                System.out.println("💸 오늘은 100원만 저금해요.");
                break;
            case 1:
                System.out.println("😪 300원만 가볍게 저금!");
                break;
            case 2:
                System.out.println("😊 1000원! 기분 좋을 때 팍 저금~");
                break;
            case 3:
                System.out.println("🤑 2000원 저금 GO!");
                break;
        }
    }
}
