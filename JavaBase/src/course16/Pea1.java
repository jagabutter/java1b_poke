package course16;

import java.util.Random;
import java.util.Scanner;

public class Pea1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		int shozi = 10000;
		do {

			System.out.println("今の所持金は" + shozi + "です");
			System.out.println("掛け金を入力してください");
			int kake = stdIn.nextInt();
			int shozi2 = shozi - kake;
			int sai1 = rnd.nextInt(7) + 1;
			System.out.print(sai1);
			int sai2 = rnd.nextInt(7) + 1;
			System.out.print(sai2);
			int sai3 = rnd.nextInt(7) + 1;
			System.out.println(sai3);
			if (sai1 == 1 && sai2 == 1 && sai3 == 1) {
				//5倍ピンゾロ
				shozi = shozi2 + (kake * 5);
			}

			if (sai1 == sai2 && sai2 == sai3) {
				//ゾロ目3倍
				shozi = shozi2 + (kake * 3);

			}
			if (sai1 == sai2 || sai2 == sai3 || sai1 == sai3) {
				//通常の目
				shozi = shozi2 + kake;
				if (sai1 == 7 && sai2 == 7 || sai1 == 7 && sai3 == 7 || sai2 == 7 && sai3 == 7) {
					//しょんべん
					shozi = shozi2 - kake;

				}
			}
			if ((sai1 >= 4 && sai1 < 7) && (sai2 >= 4 && sai2 < 7) && (sai3 >= 4 && sai3 < 7)) {
				//しごろ
				shozi = shozi2 + (kake * 2);
			} else {
				shozi = shozi2 - kake;
			}
			if ((sai1 >= 1 && sai1 < 4) && (sai2 >= 1 && sai2 < 4 && sai2 != sai1)
					&& (sai3 >= 1 && sai3 < 4 && sai3 != sai1 && sai3 != sai2)) {
				//ひふみ
				shozi = shozi2 - (kake * 2);
			} else {
				shozi = shozi2 - kake;
			}
			if (sai1 != sai2 && sai2 != sai3 && sai1 != sai3) {
				//やくなし
				shozi = shozi2 - kake;
			}

		} while (shozi >= 1);
		if (shozi <= 0) {
			System.out.println("１０５０年地下行き");
		}
	}

}
