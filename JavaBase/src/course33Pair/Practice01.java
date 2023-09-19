package course33Pair;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		offoff();
		String moji = prapra("うんち");
		System.out.println(moji);

	}

	static void offoff() {
		System.out.println("呼び出されました");
	}

	static String prapra(String x) {
		String z = x + "を受け取りました";
		return z;
	}

}
