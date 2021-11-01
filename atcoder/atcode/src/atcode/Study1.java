package atcode;

import java.util.Scanner;

public class Study1 {
	
//	シカのAtCoDeerくんは二つの正整数 a,bを見つけました。 
//	 aとbの積が偶数か奇数か判定してください。
//	積が奇数なら Odd と、 偶数なら Even と出力せよ。
//	入力例
//	3
//	4
//	Even
	public static void main(String[] args) {
		System.out.println("数字を入力して下さい");
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a * b) % 2 == 0) {
        	System.out.println("Even");
        } else {
        	System.out.println("Odd");
        }

	}

}
