package atcode;

import java.util.Scanner;

public class Study8 {
	
//	日本でよく使われる紙幣は、10000円札、5000円札、1000円札です。以下、「お札」とはこれらのみを指します。
//	青橋くんが言うには、彼が祖父から受け取ったお年玉袋にはお札が N枚入っていて、合計で Y円だったそうですが、嘘かもしれません。
//	このような状況がありうるか判定し、ありうる場合はお年玉袋の中身の候補を一つ見つけてください。なお、彼の祖父は十分裕福であり、お年玉袋は十分大きかったものとします。

	public static void main(String[] args) {
		System.out.println("数字を入力して下さい");
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        
        int yukichi = 0;
        for (int i = 0; i <= N; i++) {
        	if (10000 <= Y) {
        		yukichi += 1;
        		Y = Y - 10000;
        	}
        }
        
        int ichiyou = 0;
        for (int i =0; i <= N; i++) {
        	if (5000 <= Y) {
        		ichiyou += 1;
        		Y = Y - 5000;
        	}
        }
        
        int noguchi = 0;
        for (int i =0; i <= N; i++) {
        	if (1000 <= Y) {
        		noguchi += 1;
        		Y = Y - 1000;
        	}
        }
        
        if (Y == 0) {
        	System.out.println(yukichi + "" + ichiyou + "" + noguchi);
        } else {
        	System.out.println("嘘つきでした。");
        }

	}

}
