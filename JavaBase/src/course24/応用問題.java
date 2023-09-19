package course24;

import java.util.Scanner;

public class 応用問題 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1、足し算。2、引き算。3、掛け算。4、割り算");
		int a = stdIn.nextInt();
		System.out.println("計算する値を入力");
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		if (a == 1) {
			plus(b, c);
		}
		if (a == 2) {
			minus(b, c);
		}
		if (a == 3) {
			kake(b, c);
		}
		if (a == 4) {
			wari(b, c);
		}
	}

	static void plus(int x, int y) {
		System.out.println(x + y);
	}

	static void minus(int xx, int yy) {
		System.out.println(xx - yy);
	}

	static void kake(int xxx, int yyy) {
		System.out.println(xxx * yyy);
	}

	static void wari(int xxxx, int yyyy) {
		System.out.println(xxxx / yyyy);
	}

}
