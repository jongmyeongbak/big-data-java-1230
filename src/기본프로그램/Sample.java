package 기본프로그램; // 접근제한자(캡슐화)와 연관성이 있음
/*
- 저자 : 정경수
- Data : 2023.01.02 오전 10:15
- 목적 : 자바 연습용 프로그램
 */

public class Sample {
    // main 메서드는 프로그램의 시작 위치를 의미하며 JVM이 호출함
    // void는 메소드 실행 이후의 반환 타입 중 하나
    // {} 중괄호 : 클래스, 메서드 등의 범위를 결정
    // () 소괄호 : 메서드의 매개변수를 넣는 곳
    // [] 대괗로 : 배열 등을 정의할 때 사용
    public static void main(String[] args) {
        System.out.println("Hello, Java !!!!");
        System.out.printf("Hello, Java !!!!");
    }
}

/*
class test {
    public void test() {
        System.out.println("Test");
    }
}*/
