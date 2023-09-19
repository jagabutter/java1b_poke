package course16;

import java.util.Random;
import java.util.Scanner;

public class Pea2チンチロ完成 {

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

			//			int sai1 = 1;
			//			System.out.print(sai1);
			//			int sai2 = 1;
			//			System.out.print(sai2);
			//			int sai3 = 1;
			//			System.out.println(sai3);

			if (shozi >= 50000) {
				System.out.println("所持金が５万を超えたためクリア");
				break;
			}
			///////////////////2ALL////////////////////////////
			if (sai1 == sai2 || sai2 == sai3 || sai1 == sai3) {
				//通常の目

				shozi = shozi2 + kake;

				if (sai1 == 7 && sai2 == 7 || sai1 == 7 && sai3 == 7 || sai2 == 7 && sai3 == 7) {
					//しょんべん
					shozi = shozi2;

				}
			}

			///////////////////////////////////////////////////

			//ピンゾロとゾロ目//////////////////
			if (sai1 == sai2 && sai1 == sai3) {
				if (sai1 == 1 && sai2 == 1 && sai3 == 1) {
					//5倍ピンゾロ
					shozi = shozi2 + (kake * 5);
				}
				if (sai1 >= 2 && sai1 <= 6 && sai1 == sai2 && sai1 == sai3) {
					shozi = shozi2 + (kake * 5);
				}
			}
			////////////////////3ALL//////////

			if (sai1 != sai2 && sai2 != sai3 && sai1 != sai3) {
				//やくなし
				shozi = shozi2;
			}
			/////////////456?////////////////////////////////
			if ((sai1 >= 4 && sai1 < 7) && (sai2 >= 4 && sai2 < 7 && sai2 != sai1) &&
					(sai3 >= 4 && sai3 < 7 && sai3 != sai1 && sai3 != sai2)) {
				//しごろ
				shozi = shozi2 + (kake * 2);
			}
			/////////////////////////////////////////////////
			//////////////////123?//////////////////////////
			if ((sai1 >= 1 && sai1 < 4) && (sai2 >= 1 && sai2 < 4 && sai2 != sai1)
					&& (sai3 >= 1 && sai3 < 4 && sai3 != sai1 && sai3 != sai2)) {
				//ひふみ
				shozi = shozi2 - (kake * 2);
			}
			///////////////////////////////////////////////
			if (shozi >= 50000) {
				System.out.println("所持金が５万を超えたためクリア");
				break;
			}

		} while (shozi >= 1);
		if (shozi <= 0) {
			System.out.println("１０５０年地下行き");
		}
	}

}
