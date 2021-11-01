package atcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sample {

	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String s = bufferedReader.readLine();
		String s = "DULL";

		int result = Result.getMaxDeletions(s);
		System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

	}

}

class Result {

	public static int getMaxDeletions(String s) {
		ArrayList<String> res = new ArrayList<String>();
		int num = s.length();
		for (int i = 0; i < num; i++) {
			res.add(s.substring(i, i + 1));
		}

		ArrayList<Integer> delNum = new ArrayList<Integer>();
		for (int i = 0; i < res.size(); i++) {
			if (res.get(i).equals("U")) {
				if (i < res.size() - 1) {
					if (res.get(i + 1).equals("D")) {
						delNum.add(i);
						delNum.add(i + 1);
					}
				}
			}
			
			if (res.get(i).equals("D")) {
				if (i < res.size() - 1) {
					if (res.get(i + 1).equals("U")) {
						delNum.add(i);
						delNum.add(i + 1);
					}
				}
			}

			if (res.get(i).equals("R")) {
				if (i < res.size() - 1) {
					if (res.get(i + 1).equals("L")) {
						delNum.add(i);
						delNum.add(i + 1);
					}
				}
			}
			
			if (res.get(i).equals("L")) {
				if (i < res.size() - 1) {
					if (res.get(i + 1).equals("R")) {
						delNum.add(i);
						delNum.add(i + 1);
					}
				}
			}
		}
		return delNum.size();
	}

}