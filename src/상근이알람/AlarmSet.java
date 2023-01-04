package 상근이알람;

import java.util.Scanner;

// 상근이라는 친구는 매일 학교를 지각합니다.
// 장영이라는 친구는 상근이에게 지각하지 않는 방법을 알려줍니다.
// 시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 함.
// 24시간제
public class AlarmSet {
    public static void main(String[] args) {
        // 시간을 입력받기 위해 스캐너 객체 생성
        // 생성된 객체로 시간과 분을 입력받음 (24시간제)
        // 변수를 만들어서 입력된 시간과 분을 모두 분으로 환산
        // 고려사항 : 환산한 시간이 45분보다 작으면 별도의 계산이 필요
        // 창영이가 알려준 방법대로 시간을 45분 이전으로 돌림
        // 계산 결과를 시간과 분으로 출력하기 위해 다시 변환 후 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("알람할 시각을 24시간제로 입력하세요. (예:0시 0분, 2시 1분, 23시 46분) : ");
        String textInput = sc.nextLine();
        int index1 = textInput.indexOf('시');
        int index2 = textInput.indexOf('분');
        int hasSpace = (textInput.charAt(index1 + 1) == ' ') ? 1 : 0;

        int hour = Integer.parseInt(textInput.substring(0, index1));
        int minute = Integer.parseInt(textInput.substring(index1 + 1 + hasSpace, index2));

//        System.out.print("알람할 시각은 몇 시인가요? : ");
//        int hour = sc.nextInt();
//        System.out.print("몇 분인가요? : ");
//        int minute = sc.nextInt();

        int alarmTime = hour * 60 + minute - 45;
        if (alarmTime < 0) {
            alarmTime += 60 * 24;
        }
        hour = alarmTime / 60;
        minute = alarmTime % 60;
        System.out.printf("%d시 %d분에 알람이 울립니다.", hour, minute);
    }
}
