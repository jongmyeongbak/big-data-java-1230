package 주사위게임;

// 주사위 2개 던져서 합 12면 탈출하는 게임
public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;
        while (true) {
            cnt++;
            rand1 = (int) (Math.random() * 6) + 1; // 랜덤 함수는 0.0 이상 1.0 미만
            rand2 = (int) (Math.random() * 6) + 1;
            if (rand1 + rand2 == 12) {
                System.out.printf("무인도를 %d번만에 탈출합니다.", cnt);
                break;
            }
            System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
        }
    }
}
