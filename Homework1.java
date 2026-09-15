// 2장 개념 확인 과제
import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int num=0; num<5; num++) {
            System.out.printf("정수를 입력하세요: ");
            int adder = sc.nextInt();
            sum +=adder;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);
        }


    }
}
