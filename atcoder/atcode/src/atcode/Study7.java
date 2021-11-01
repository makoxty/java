package atcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Study7 {

//	X段重ねの鏡餅 (X≥1)とは、X枚の円形の餅を縦に積み重ねたものであって、どの餅もその真下の餅より直径が小さい（一番下の餅を除く）もののことです。
//	例えば、直径 10、8、6センチメートルの餅をこの順に下から積み重ねると 3段重ねの鏡餅になり、餅を一枚だけ置くと 1段重ねの鏡餅になります。
//	ダックスフンドのルンルンは N枚の円形の餅を持っていて、そのうち i枚目の餅の直径は diセンチメートルです。これらの餅のうち一部または全部を使って鏡餅を作るとき、最大で何段重ねの鏡餅を作ることができるでしょうか。
	public static void main(String[] args) {
		System.out.println("数字を入力して下さい");
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> num = new HashSet<>();
        for (int i=0; i<N; i++) {
            int di = sc.nextInt();
            num.add(di);
        }
        System.out.println(num.size());
	}

}
