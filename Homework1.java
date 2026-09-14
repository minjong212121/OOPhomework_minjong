// 2장 개념 확인 과제
// 문제: 사용자로부터 정수 5개를 입력받으면서, 매 입력 후 그때까지 입력된 정수의 합을 출력
// 요구사항: 정수 외 값은 입력되지 않는다고 가정 / 반복문 사용 여부는 자유
// 출력 예:
//   정수를 입력하세요: 3
//   현재까지 입력된 정수의 합은 3입니다.
//   정수를 입력하세요: 5
//   현재까지 입력된 정수의 합은 8입니다.
//   ...
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
