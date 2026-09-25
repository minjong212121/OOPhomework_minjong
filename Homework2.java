// 3장 개념 확인 과제
import java.util.Scanner;

class Student {
    int id; // 학번
    String name; // 이름
    String major; // 전공
    long phone; // 전화번호 (앞의 0 빠진 숫자)

    int getId() { return id; }
    void setId(int id) { this.id = id; }
    String getName() { return name; }
    void setName(String name) { this.name = name; }
    String getMajor() { return major; }
    void setMajor(String major) { this.major = major; }
    long getPhone() { return phone; }
    void setPhone(long phone) { this.phone = phone; }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i=0; i<3; i++) {
            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            students[i] = new Student();
            String idStr = sc.next();
            students[i].setId(Integer.parseInt(idStr));
            students[i].setName(sc.next());
            students[i].setMajor(sc.next());
            String phoneStr = sc.next();
            students[i].setPhone(Long.parseLong(phoneStr));
        }

        System.out.printf("\n입력된 학생들의 정보는 다음과 같습니다.\n");
        for (int i=0; i<3; i++) {
            // 전화번호 앞에 0 붙이고 010-xxxx-xxxx 로 바꾸기
            String p = "0" + Long.toString(students[i].getPhone());
            String phone = p.substring(0,3) + "-" + p.substring(3,7) + "-" + p.substring(7);
            System.out.printf("%d번째 학생: %d %s %s %s\n", i+1, students[i].getId(), students[i].getName(), students[i].getMajor(), phone);
        }

    }
}
