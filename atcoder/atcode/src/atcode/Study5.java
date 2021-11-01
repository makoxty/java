package atcode;

import java.util.Scanner;

public class Study5 {

//	1以上 N以下の整数のうち、10進法での各桁の和が A以上 B以下であるものの総和を求めてください。
//	入力例
//	N
//	A
//	B
	public static void main(String[] args) {
		System.out.println("数字を入力して下さい");
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = 0;
        for (int i=1; i<=N; i++) {
            int n = i;
            int digSum = 0;
            while (n > 0) {
                digSum += n % 10;
                n /= 10;
            }
            if (digSum >= A && digSum <= B)
                sum += i;
        }
        System.out.println(sum);
	}

}
