// 5장 개념 확인 과제
import java.util.Scanner;

class GcdLoop {
    // 반복문으로 바꾼 gcd
    int gcd(int m, int n) {
        while (n != 0) {
            int small;
            int big;
            if (m < n) {
                small = m;
                big = n;
            } else {
                small = n;
                big = m;
            }
            m = small;
            n = big % small;
        }
        return m;
    }
}

public class Homework4 {
    // 재귀호출 gcd
    int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        if (m < n) {
            return gcd(m, n % m);
        } else {
            return gcd(n, m % n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Homework4 hw = new Homework4();
        GcdLoop gl = new GcdLoop();
        int r1 = hw.gcd(a, b); // 재귀
        int r2 = gl.gcd(a, b); // 반복문

        System.out.printf("두 수의 최대공약수는 %d입니다.\n", r1);
        System.out.printf("(반복문) 두 수의 최대공약수는 %d입니다.\n", r2);

    }
}
