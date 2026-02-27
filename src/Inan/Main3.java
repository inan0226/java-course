package Inan;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        // 1. 배열을 만들고 원하는 단어 추가
        String[] wordList = {
                "AIRPLANE", "APPLE", "ARM", "BAKERY", "BANANA", "BANK", "BEAN", "BELT",
                "BICYCLE", "BIOGRAPHY", "BLACKBOARD", "BOAT", "BOWL", "BROCCOLI", "BUS",
                "CAR", "CARROT", "CHAIR", "CHERRY", "CINEMA", "CLASS", "CLASSROOM",
                "CLOUD", "COAT", "CUCUMBER", "DESK", "DICTIONARY", "DRESS", "EAR",
                "EYE", "FOG", "FOOT", "FORK", "FRUITS", "HAIL", "HAND", "HEAD",
                "HELICOPTER", "HOSPITAL", "ICE", "JACKET", "KETTLE", "KNIFE", "LEG",
                "LETTUCE", "LIBRARY", "MAGAZINE", "MANGO", "MELON", "MOTORCYCLE",
                "MOUTH", "NEWSPAPER", "NOSE", "NOTEBOOK", "NOVEL", "ONION", "ORANGE",
                "PEACH", "PHARMACY", "PINEAPPLE", "PLATE", "POT", "POTATO", "RAIN",
                "SHIRT", "SHOE", "SHOP", "SINK", "SKATEBOARD", "SKI", "SKIRT", "SKY",
                "SNOW", "SOCK", "SPINACH", "SPOON", "STATIONARY", "STOMACH", "STRAWBERRY",
                "STUDENT", "SUN", "SUPERMARKET", "SWEATER", "TEACHER", "THUNDERSTORM",
                "TOMATO", "TROUSERS", "TRUCK", "VEGETABLES", "VEHICLES", "WATERMELON", "WIND"
        };
        // 2. Random 객체 생성
        Random random = new Random();

        // 3. 0부터 (단어장의 개수 - 1 ) 사이의 랜덤한 숫자 뽑기
        int randomIndex = random.nextInt(wordList.length);

        // 4. 뽑힌 랜덤 숫자 인덱스 사용해서 단어 하나 선냍ㄱ
        String answer = wordList[randomIndex];

        int chances = 9;

        char[] hiddenWord = new char[answer.length()];
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '_';
        }

        String guessedLetters = "";
        Scanner scanner = new Scanner(System.in);

        while (chances > 0) {
            System.out.println(Arrays.toString(hiddenWord));
            System.out.println("현재 남은기회 : " + chances);
            System.out.print("A-Z 중 하나를 입력해주세요 (대/소문자 모두 가능): ");

            /* * [데이터 통일] 입력값을 무조건 대문자로 변환
             * 왜?: 정답이 대문자 기준이므로, 소문자 입력 시 오답 처리되는 것을 방지하고
             * 비교 로직을 단순하게 유지하기 위함.
             */
            String input = scanner.next().toUpperCase();

            if (input.length() != 1) {
                System.out.println("입력값이 한 글자가 아닙니다. 다시 입력해주세요.\n");
                continue;
            }

            char guess = input.charAt(0);

            if (guess < 'A' || guess > 'Z') {
                System.out.println("알파벳이 아닙니다. 다시 입력해주세요.\n");
                continue;
            }

            if (guessedLetters.contains("" + guess)) {
                System.out.println("이미 입력했던 알파벳입니다. 다시 입력해주세요.\n");
                continue;
            }
            guessedLetters += guess;

            boolean isCorrect = false;
            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == guess) {
                    hiddenWord[i] = guess;
                    isCorrect = true;
                }
            }

            if (!isCorrect) {
                chances--;
                System.out.println("정답에 포함된 알파벳이 아닙니다. 기회가 1 차감됩니다.\n");
            } else {
                System.out.println();
            }

            boolean isWin = true;
            for (int i = 0; i < hiddenWord.length; i++) {
                if (hiddenWord[i] == '_') {
                    isWin = false;
                    break;
                }
            }

            if (isWin) {
                System.out.println("정답입니다! " + Arrays.toString(hiddenWord));
                break;
            }
        }

        if (chances == 0) {
            System.out.println("게임 오버! 정답은 " + answer + " 였습니다.");
        }
    }
}
