package if조건문;

import java.util.Scanner;

public class ConditiionIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = sc.nextInt();
        if (number > 100) { // number 값이 0과 같거나 크면 참
            System.out.println(number + "은(는) 100보다 커요.");
        } else if (number < 100) {
            System.out.println(number + "은(는) 100보다 작아요.");
        } else {
            System.out.println(number + "은 100이에요.");
        }

        System.out.println("프로그램의 끝입니다.");
    }
}
