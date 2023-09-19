package 総合演習sub;

import java.util.Random;
import java.util.Scanner;

public class Trainer {
	String name;
	Pocketon[] myPockes;

	Trainer() {
		name = "初期";
		myPockes = new Pocketon[6];
	}

	void display() {
		System.out.println("現在の手持ちは以下の通りです");
		for (int i = 0; i < myPockes.length; i++) {
			if (myPockes[i] == null) {
				System.out.println("ポケトンなし");
			} else {
				System.out.println(myPockes[i].name);
			}
		}
	}

	void capture(Pocketon pocke) {
		Random rnd = new Random();
		int count = 0;
		Scanner stdIn = new Scanner(System.in);
		int random = rnd.nextInt(10) + 1;
		if (pocke.difficult > random) {
			System.out.println("捕獲失敗");
		} else {
			System.out.println("捕獲成功");
			for (int i = 0; i < 6; i++) {
				if (myPockes[i] == null) {
					myPockes[i] = pocke;
					i = i + 100;
				} else {
					count++;
				}
				if (count == 6) {
					System.out.println("手持ちが埋まってます。何番目と交換しますか");
					int koukan = stdIn.nextInt();
					myPockes[koukan - 1] = pocke;
					System.out.println(koukan + "番目に" + pocke.name + "が入りました");
				}
			}
		}

	}
}
