package 조건문연습문제1;

import java.util.Scanner;

// 성적을 입력받음
// 입력받은 값이 0 ~ 100 범위에 없으면 "잘못 입력하였습니다" 출력
// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 나머지는 F
public class ScoreGrade {
    public static void main(String[] args) {
        char grade;
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 정수로 입력하세요. : ");
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("잘못 입력하였습니다.");
            return;
        }
        switch (score / 10) {
            case 10: case 9: grade = 'A';
                break;
            case 8: grade = 'B';
                break;
            case 7: grade = 'C';
                break;
            case 6: grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.printf("학점은 %c입니다", grade);
    }
}
