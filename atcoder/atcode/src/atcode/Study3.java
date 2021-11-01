package atcode;

import java.util.Scanner;

public class Study3 {
	
//	黒板に 
//	N個の正の整数 A1,...,ANが書かれています．
//	すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます．
//	黒板に書かれている整数すべてを，2で割ったものに置き換える．
//	すぬけ君は最大で何回操作を行うことができるかを求めてください．
//	入力例
//	3
//	10
//	10
//	10
//	→1

	public static void main(String[] args) {
		System.out.println("数字を入力して下さい");
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int bit = 0;
        int j = 0;
        int k = 0;
        for (int i=0; i<N; i++) {
            bit = sc.nextInt();
            if (bit % 2 == 0) {
            	j = j + 1;
            }
            if (j == 3) {
            	k = k + 1;
            	j = 0;
            }
        }
        System.out.println(k);
	}

}
