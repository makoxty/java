package atcode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;


public class Study6 {

//	 N枚のカードがあります. i枚目のカードには, aiという数が書かれています.
//	 Alice と Bob は, これらのカードを使ってゲームを行います. ゲームでは, Alice と Bob が交互に 1 枚ずつカードを取っていきます. 
//	 Alice が先にカードを取ります.2 人がすべてのカードを取ったときゲームは終了し, 取ったカードの数の合計がその人の得点になります. 
//	 2 人とも自分の得点を最大化するように最適な戦略を取った時, Alice は Bob より何点多く取るか求めてください.
//	入力例
//	2
//	3 1
//	⇨2
	public static void main(String[] args) {
		System.out.println("数字を入力して下さい");
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer list[] = new Integer[N];
        
        for (int i = 0; i < N; i++) {
        	list[i] = sc.nextInt();
        }
        Arrays.sort(list, Collections.reverseOrder());
        
        int Alice = 0;
        int Bob = 0;
        
        for (int i = 0;i < N; i+=2) {
        	Alice += list[i];
        }
        
        for (int i = 1; i < N; i += 2) {
        	Bob += list[i];
        }
        System.out.println(Alice - Bob);
	}

}
