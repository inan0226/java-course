package operator;

public class Main {

    public static void main() {

        int a =10;
        int b= 3;

        // 기본적인 사착연산
        int sum = a+b;
        System.out.println("sum = " + sum);

        int sub = a- b;
        System.out.println("sub = " + sub);

        int mul = a*b;
        System.out.println("mul = " + mul);

        // 나눗셈
        // 10 / 3
        int div = a / b;
        System.out.println("div = " + div);

        double div2 = a / 3.0;
        System.out.println("div2 = " + div2);

        // 모둘러 연산자(나머지 연산) - %
        int mod = 10 % 3;
        System.out.println("mod = " + mod);

        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2);

        int mod3 = 20 % 7;
        System.out.println("mod3 = " + mod3);

        // 시간 연산
       int mod4 =  (10 + 5) % 12;
        System.out.println("mod4 = " + mod4);

        // 짝수 홀수 연산
        int mod5 = 6 % 2;
        System.out.println("mod5 = " + mod5);

        int mod6 = 7 % 2;
        System.out.println("mod6 = " + mod6);

        // 대입 연산자
        int num = 5;
        // 복합 대입 연산자
        num += 3; // num = num + 3;
        System.out.println("num = " + num);

        num -= 2; // num = mum - 2;
        System.out.println("num = " + num);

        num *= 2; // num = num * 2
        System.out.println("num = " + num);

        num /= 3; // num = num / 3
        System.out.println("num = " + num);

        num %= 3; // num = num % 3
        System.out.println("num = " + num);

        // 증감 연산자
        num = 1;
        num++; // + 1
        num++; // + 1
        num--; // - 1
        num--; // - 1
        System.out.println("num = " + num);

        // 전위 연산(++i) - 연산 후 값이 활용 됩니다.
        int intBox = 5;
        System.out.println("(++intBox) = " + (++intBox));

        // 후위 연산
        int intBox2 =5;
        System.out.println("(++intBox2) = " + (intBox2++));
        System.out.println("intBox2 = " + intBox2);

        // 비교 연산자
        // 같음 연산자 (=) 같으면 true, 다르면 false
        System.out.println("10 == 10: " + (10 ==10));

        // 다름 연산자(!=)
        System.out.println("10 != 5: " + (10 !=5 ));

        // 크기비교 연산자
        System.out.println("10 < 5: " + (10 <5)); // false
        System.out.println("10 >= 10: " + (10 >= 10)); // true
        System.out.println("10 <= 5: " + (10 <= 5));  // false

        // 논리 연산자
        // AND 연산자(&&) - 두 조건이 모두 참일때 true 반환합니다.
        System.out.println("true && true: " + (true && true)); // true
        int age = 20;
        boolean isStudent = true;
        System.out.println(":::" + ((age> 18) && isStudent));


        // OR 연산(||) - 두 조건중 하나라도 참이라면 true 를 반환합니다.
        System.out.println("false || true: " + (false || true)); // true

        // NOT 연산자 (!) true -> false , false -> true.
        System.out.println("!true: " + (!true));

        // 연산자 우선순위
        boolean flag = (10 + 5) > 12 && true;
        System.out.println(flag);
        // 실행 순서: (10 + 5) > 12 && true : 산술
        // → 15 > 12 && true : 비교
        // → true && true : 논리
        // → flag = true 대입

        // 논리 연산자 우선순위
        boolean result = true || false && false;
        System.out.println("result = " + result);

        boolean result2 = true || false && (!false);
        System.out.println("result2 = " + result2);

        System.out.println(10 / 2 + 3 * 2 > 10 || false);
        // 실행 순서: ((10 / 2) + (3 * 2)) > 10 || false
        // → (5 + 6) > 10 || false
        // → 11 > 10 || false
        // → true || false
        // → true

        System.out.println(5 + 3 > 2 * 4 && 10 % 3 == 1);
        // 실행 순서: (5 + 3) > (2 * 4) && (10 % 3) == 1
        // → 8 > 8 && 1 == 1
        // → false && true
        // → false

        String text1 = "Hello";
        String text2 = "Hello";
        boolean isEqual = text1.equals(text2);
        System.out.println("text1과 text2가 같은가? " + isEqual);
        // 출력결과:
        // text1과 text2가 같은가? true

    }
}
