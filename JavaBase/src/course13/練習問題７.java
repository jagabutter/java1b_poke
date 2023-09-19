package course13;

import java.util.Scanner;

public class 練習問題７ {

	public static void main(String[] args) {
		System.out.println("数値を入力してね");
		Scanner stdIn = new Scanner(System.in);

		int yy = stdIn.nextInt();
		for (int i = 0; i < yy; i++) {
			System.out.println(i);
			int o = i % 2;
			if (o == 0) {
				System.out.println("偶数だよ");
			} else {
				System.out.println("奇数だよ");
			}
			if (i > 100) {
				System.out.println("どれだけ回すの");
			}
			if (i > 150) {
				System.out.println("もうええて");
			}

		}
	}
}
