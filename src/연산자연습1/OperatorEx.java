package 연산자연습1;

import java.util.Scanner;

// - 이항연산자와 삼항연산자
// 산술연산자 : +, -, *, /, %
// 대입연산자 : 값을 변수에 대입할 때 사용, 대입은 항상 뒤에서 앞으로 일어남
// 복합대입연산자 : 연산 후 대입
// - 증감연산자(단항연산자) : 값을 1 증가 또는 감소시키는 연산자
// 후위와 전위에 따라 상황이 달라짐
// 비교연산자 : 값의 크기를 비교하는 연산자
// 논리연산자 : 참과 거짓을 판단하는 것? AND(&&) OR(||) NOT(!)
// - 삼항연산자 : 항이 3개인 연산자 (이건 참과 거짓이 있는 조건문과 같음)
// 문자열 결합 연산자 : 문자열을 이어주는 연산자
public class OperatorEx {
    public static void main(String[] args) {
        int num1 = 10, num2 = 7, num3 = 0;
        System.out.println("+ 연산자 : " + (num1 + num2));
        System.out.println("- 연산자 : " + (num1 - num2));
        System.out.println("* 연산자 : " + (num1 * num2));
        System.out.println("/ 연산자 : " + ((double) num1 / num3));
        System.out.println("% 연산자 : " + ((double) num1 % num3));

        try {
            System.out.println(num1 / num3);
        } catch (ArithmeticException e) {
            System.out.println("값을 0으로 나누면 안됩니다.");
        }

        try {
            System.out.println(num1 % num3);
        } catch (ArithmeticException e) {
            System.out.println("값을 0으로 나누면 안됩니다.");
        }

        System.out.println(num1 += 2);
        System.out.println(num1 -= 2);
        System.out.println(num1 *= 2);
        System.out.println(num1 /= 2);
        System.out.println(num1 %= 2);

        int x = 10, y = 20;
        System.out.println(x > y); // false
        System.out.println(x < y); // true
        System.out.println(x == y); // 같다
        System.out.println(x >= y);
        System.out.println(x <= y);

        System.out.println("======");
        boolean rst1, rst2, rst3;
        rst1 = x > y && x > 5; // 거짓
        rst2 = x > y || x > 5; // 참
        rst3 = !(x > y || x > 5); // 거짓
        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);

        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요. : ");
        int age = sc.nextInt();
        boolean isAdult = (age > 18) ? true : false;

        System.out.println(isAdult);

        System.out.println("Java" + 11.03 + 12);

    }
}
