package atcode;

import java.util.Scanner;

public class Study9 {

//	英小文字からなる文字列 Sが与えられます。 
//	Tが空文字列である状態から始め、以下の操作を好きな回数繰り返すことで S=Tとすることができるか判定してください。
//	Tの末尾に dream dreamer erase eraser のいずれかを追加する。

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();

        S = S.replaceAll("eraser",  "-");
        S = S.replaceAll("erase",   "-");
        S = S.replaceAll("dreamer", "-");
        S = S.replaceAll("dream",   "-");
        S = S.replaceAll("-", "");
        if (S.length() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
