package 스위치문기본;

import java.util.Scanner;

// 스위치문은 조건문이며 조건식이 올 수 없고 조건이 되는 변수만 올 수 있음
// 변수는 정수, 문자, 문자열(JDK 1.7부터) 사용 가능
// 각 case를 끝내기 위해서는 반드시 break문이 필요
// 해당하는 case가 없는 경우를 위해 default문이 필요
public class SwitchSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요. : ");
        String season = sc.next(); // 공백 앞까지 문자열을 입력받음
        switch (season) {
            case "spring":
            case "SPRING":
                System.out.println("꽃이 피는 봄이 왔어요^^");
                break;
            case "summer":
            case "SUMMER":
                System.out.println("무더운 여름입니다.");
                break;
            case "fall":
            case "FALL":
            case "autumn":
            case "AUTUMN":
                System.out.println("쓸쓸한 가을입니다.");
                break;
            case "winter":
            case "WINTER":
                System.out.println("아직 추운 겨울입니다.ㅠㅠㅠㅠㅠ");
                break;
            default:
                System.out.println("계절을 잘못 입력하셨어요.");
        }
    }
}
