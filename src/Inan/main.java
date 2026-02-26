package Inan;

public class main {

    public static class NicknameCreator{

        public String  createNickname() {
            // 리스트 3개를 분류
            String[] list1 = {"기절초풍", "멋있는", "재미있는"};
            String[] list2 = {"도전적인", "노란색의", "바보같은"};
            String[] list3 = {"돌고래", "개발자", "오랑우탄"};

            // 결과값을 담을 result 변수 생성

            String result = "";

            // 랜덤한 리스트 값을 가져와서 result 대입을하는 과정
            // int 으로 변환을 해서 ramdomlistint = (int) (Math.random()

            int ramdomlistint = (int) (Math.random() * 2); // 0~1 사이의 실수를 가지고 와서 2랑 같거나 크지 않다
            result = list1[ramdomlistint] + " "; // 결과값

            ramdomlistint = (int) (Math.random() * 2);
            result += list2[ramdomlistint] + " "; // += 연달아서 더해주는 결과값을 대입

            ramdomlistint = (int) (Math.random() * 2);
            result += list3[ramdomlistint];        // += 연달아서 더해주는 결과값을 대입

            // 결과값을 반환
            return result;
        }
    }




   public static void main(String[] args) {

       // 왼쪽은 변수 생성 오른쪽은 생성자 호출
        NicknameCreator nicknameCreator = new NicknameCreator();
            System.out.println(nicknameCreator.createNickname()); // 호출한 결과값을 낸다

    }
}
