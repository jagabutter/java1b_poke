package 総合演習sub;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		int count = 0;
		Trainer t1 = new Trainer();
		System.out.println("名前を入力してください");
		Scanner stdIn = new Scanner(System.in);
		t1.name = stdIn.next();

		menu: while (true) {
			System.out.println("名前は" + t1.name + "です");
			System.out.println("メニューを選択してください");
			System.out.println("１・・・捕獲");
			System.out.println("２・・・図鑑を見る");
			System.out.println("３・・・バトル");
			System.out.println("９９・・・終了");

			int menu = stdIn.nextInt();
			if (menu == 1) {
				System.out.println("ポケトンの名前を入力してください");
				String pokename = stdIn.next();
				String type;

				taipu: while (true) {
					System.out.println("タイプ入力(火、水、地面、草)");
					String type2 = stdIn.next();
					if (type2.equals("火") || type2.equals("水") || type2.equals("地面") || type2.equals("草")) {
						type = type2;
						break;

					} else {
						System.out.println("書いてある四つのタイプを入力してください。");
						continue taipu;
					}
				}
				System.out.println("戦闘力を入力してください");
				int power = stdIn.nextInt();

				System.out.println("捕獲難易度を入力してください");
				int muzu = stdIn.nextInt();

				Pocketon poke = new Pocketon(pokename, type, power, muzu);
				t1.capture(poke);
				t1.display();
				continue menu;

			} else if (menu == 2) {

				t1.display();
				continue menu;

			} else if (menu == 3) {
				System.out.println("1体目のポケトンの名前を入力してください");
				String poke1 = stdIn.next();
				System.out.println("2体目のポケトンの名前を入力してください");
				String poke2 = stdIn.next();

				int hozon = 0;
				int hozon2 = 0;
				for (int i = 0; i < t1.myPockes.length; i++) {
					if (t1.myPockes[i] != null) {

						if (poke1.equals(t1.myPockes[i].name)) {
							hozon = i;
						} else if (poke2.equals(t1.myPockes[i].name)) {
							hozon2 = i;
						}
					}

				}
				Battle vs = new Battle();
				String x = vs.doBattle(t1.myPockes[hozon], t1.myPockes[hozon2]);
				System.out.println("バトルの結果は・・" + x + "です");
				continue menu;

			} else if (menu == 99) {
				System.out.println("終了しました。");
				System.out.println("Thank you for playing!!!!!");
				count = count + 10000;
				break menu;

			} else {
				System.out.println("menuにない数字を入力しています。再度入力してください。ばか");
				continue menu;
			}
		}

	}

}
