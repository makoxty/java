package atcode;

import java.util.Scanner;

public class Study4 {

//	あなたは、500円玉を A枚、100円玉を B枚、50円玉を C枚持っています。 これらの硬貨の中から何枚かを選び、合計金額をちょうど X円にする方法は何通りありますか。
//	同じ種類の硬貨どうしは区別できません。2 通りの硬貨の選び方は、ある種類の硬貨についてその硬貨を選ぶ枚数が異なるとき区別されます。
//	入力例
//	A  2
//	B  2
//	C  2
//	X  100
//	⇨2
	public static void main(String[] args) {
		System.out.println("数字を入力して下さい");
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();

        int res = 0;
        for (int a=0; a<=A; a++) {
            for (int b=0; b<=B; b++) {
                int c = (X - (a * 500) - (b * 100)) / 50;
                if (c >= 0 && c <= C)
                    res++;
            }
        }

        System.out.println(res);

	}

}
