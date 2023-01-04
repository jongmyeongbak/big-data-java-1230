package 비트연산자;

// 비트연산자 : 비트 단위로 연산을 수행 (1/0)
// & ampersand (비트 AND) : 두 개의 비트가 모두 1일 때만 1
// | vertical bar (비트 OR) : 둘 중 비트가 하나라도 1이면 1
// ^ carrot (XOR) : 비트 값이 다를 때만 1
// ~ (비트 값 반전) : 비트가 0이면 1, 1이면 0으로 변경
// << (Shift 연산자) : 지정된 수만큼 왼쪽으로 비트를 이동시킴
// >> (Shift 연산자) :; 지정된 수만큼 오른쪽으로 비트를 이동시킴
public class BitOperator {
    public static void main(String[] args) {
        int num1 = 10; // 0b1010
        int num2 = 12; // 0b1100
        System.out.println(num1 & num2); // 0b1000 = 8
        System.out.println(num1 | num2); // 0b1110 = 14
        System.out.println(num1 ^ num2); // 0b0110 = 6
        System.out.println(~num1); // -11
        System.out.println(num1 << 1); // 20
        System.out.println(num1 >> 1); // 5
    }
}
