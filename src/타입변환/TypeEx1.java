package 타입변환;
// 묵시적 형변환(Auto)
// 명시적 형변환
// 메서드를 이용한 형변환
// Integer.parseInt() 문자열을 정수 타입으로 변경
// Double.parseDouble() 문자열을 실수 타입으로 변경
public class TypeEx1 {
    public static void main(String[] args) {
        /*int num1 = 1, num2 = 4;
        double rst1 = num1 / num2;
        double rst2 = (double) num1 / num2;
        double rst3 = 100 + 100.1;
        System.out.println(rst1);
        System.out.println(rst2);

        String phoneNumber = "01050064146";
        String name = "곰돌이464";
        String PILetter = "3.141592653589793238462643383279";
        int phoneInt = Integer.parseInt(phoneNumber);
        double phoneDouble = Double.parseDouble(phoneNumber);
        System.out.println(phoneInt);
        System.out.println(phoneDouble);

        double PINumber = Double.parseDouble(PILetter);
        System.out.println(PINumber);*/

        int var1 = 0b1010; // 2진수 = 10
        int var2 = 0267; // 8진수 = 183
        int var3 = 399; // 10진수
        int var4 = 0xabcdef;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}
