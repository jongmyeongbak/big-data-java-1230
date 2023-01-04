package 변수의생존범위;

public class ScopeData {
    public static void main(String[] args) {
        int localValue = 20;

        if (localValue > 10) {
            int m = 30;
            m = m + (localValue - 10);
        }

        int m = 0;
        System.out.println(m);
    }
}
