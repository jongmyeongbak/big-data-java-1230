package 변수와데이터;

public class Datatype3 {
    public static void main(String[] args) {
        int num1, num2;
        double num3 = 3.14;
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시 " + minute + "분");

        NameCard nameCard = new NameCard();
        nameCard.name = "곰돌이464";
        nameCard.age = 30;
        nameCard.address = "경기도 수원시";
        nameCard.eMail = "jks2024@gmail.com";
        nameCard.phoneNumber = "010-5006-4146";
        System.out.println(nameCard);
    }
}

// 사용자 정의 자료형
class NameCard {
    String name;
    int age;
    String address;
    String eMail;
    String phoneNumber;

    @Override
    public String toString() {
        return this.name;
    }
}
