package atcode;

import java.util.Scanner;

public class Study_2 {

//	すぬけ君は 1,2,3の番号がついた3つのマスからなるマス目を持っています。
//	 各マスには 0 か 1 が書かれており、マスiにはsiが書かれています。
//	すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。
//	入力例
//	101
//	→2
	public static void main(String[] args) {
		System.out.println("数字を入力して下さい");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a = a.replace("0", "");
		System.out.println(a.length());

	}

}
