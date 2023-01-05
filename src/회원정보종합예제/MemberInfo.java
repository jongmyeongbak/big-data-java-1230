package 회원정보종합예제;

import java.util.Scanner;

// 이름, 나이, 성별, 직업 받아서 출력하기
public class MemberInfo {
    // 필드 추가하기 : 필드란? 클래스 내부에서 사용하는 변수를 의미 (객체 생성 시 객체 개수만큼 생성됨)
    String name; // 인스턴스 변수
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.print("이름을 입력하세요. : ");
        name = sc.next(); // 꼭 지역 변수 같지?
    }

    public void setAge() {
        while (true) {
            System.out.print("나이를 입력하세요. : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) {
                return;
            }
        }
    }

    public void setGender() {
        System.out.print("성별을 입력하세요.(M/F) : ");
        while (true) {
            gender = sc.next().charAt(0); // 문자열에서 첫 번째 문자를 입력받음
            switch (gender) {
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    break; // continue 지우고, break 대신 return을 쓰는 것이 낫다.
                default:
                    System.out.print("성별을 다시 입력하세요. : ");
                    continue; // 학습을 위해 continue로 구현.
            }
            break;
        }
    }

    public void setJobs() {
        while (true) {
            System.out.print("직업을 숫자로 입력하세요.(1.학생, 2.회사원, 3.주부, 4.무직) : ");
            jobs = sc.nextInt();

            if (jobs > 0 && jobs < 5) {
                return;
            }

            System.out.println("직업을 잘못 입력하셨습니다.");
        }
    }

    public int getGenderType() {
        switch (gender) {
            case 'M':
            case 'm':
                return 1;
            default:
                return 2;
        }
    }

    public void viewInfo() {
        String[] genderStr = {"", "남성", "여성"}; // 지역 변수
        String[] jobsStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("======= 회원 정보 출력 =======");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobsStr[jobs]);
    }
}
