package 변수와데이터;

public class DataType {
    public static void main(String[] args) {
        byte num1 = 127; // byte형의 크기는 1byte이며 -128 ~ 127
        byte num2 = -128;

        num1++;
        num2--;

        System.out.println(num1);
        System.out.println(num2);

        int num3 = 2147483647;
        int num4 = - 2147483648;

        num3++;
        num4--;

        System.out.println(num3);
        System.out.println(num4);

        double num5 = 0.1;
        for (int i = 0; i < 1000; i++) {
            num5 += 0.1;
        }
        System.out.println(num5);

        float num6 = 0.1f;
        for (int i = 0; i < 1000; i++) {
            num6 += 0.1f;
        }
        System.out.println(num6);
    }
}
