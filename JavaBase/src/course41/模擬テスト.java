package course41;

import java.util.Scanner;

public class 模擬テスト {

	public static void main(String[] args) {
		String moji = "模擬テスト。１００店取ります。";
		System.out.println(moji);

		int x = 50;
		int y = 100;
		int z = x * y;
		boolean isRaining = true;
		System.out.println(z);
		Scanner stdIn = new Scanner(System.in);
		int s = stdIn.nextInt();
		System.out.println(s);
		for (int f = 0; f < 5; f++) {
			System.out.println(f + "回目のループです");
		}
		int s1 = stdIn.nextInt();
		if (s1 >= 50) {
			System.out.println("50以上です。");
		} else {
			System.out.println("49以下です。");
		}
		if (isRaining == true) {
			System.out.println("傘もってけーーー");
		} else {
			System.out.println("良い1日を！");
		}

		int[] numArr = { 10, 20, 30, 40, 50 };
		for (int num : numArr) {
			System.out.println(num);
		}

		int max = 0;
		for (int num : numArr) {
			if (max < num) {
				max = num;
			}
		}
		numArr[4] = max;

		int x1 = stdIn.nextInt();
		int[] variable = new int[x1];

		int[] numExArr = { 10, 50, 30, 20, 40 };
		int hi0 = numExArr[0];
		int hi1 = numExArr[1];
		int hi2 = numExArr[2];
		int hi3 = numExArr[3];
		int hi4 = numExArr[4];

		numExArr[0] = hi1;
		numExArr[1] = hi2;
		numExArr[2] = hi3;
		numExArr[3] = hi4;
		numExArr[4] = hi0;

		mogi();
		calc(10,11);
		String x3=mojicon("今のところ全問正解でしょ？");

	}

	static void mogi() {
		System.out.println("メソッド問題");
	}
	static void calc(int a,int b) {
		System.out.println(a+b);
	}
	static String mojicon(String moji) {
		String concated=moji+"を受け取りました";
		return concated;
	}

}
