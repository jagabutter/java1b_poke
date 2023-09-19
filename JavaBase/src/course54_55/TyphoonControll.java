package course54_55;

import java.util.Scanner;

public class TyphoonControll {

	public static void main(String[] args) {

		Typhoon ty1 = new Typhoon(1, "2022年4月8日", "マラカス");
		Typhoon ty2 = new Typhoon(2, "2022年4月10日", "メーギー");
		Typhoon ty3 = new Typhoon(3, "2022年6月30日", "チャバ");
		Typhoon ty4 = new Typhoon(4, "2022年7月1日", "アイレー");
		Typhoon ty5 = new Typhoon(5, "2022年7月28日", "ソングダー");
		Typhoon ty6 = new Typhoon(6, "2022年7月31日", "トローセス");
		Typhoon ty7 = new Typhoon(7, "2022年8月9日", "ムーラン");
		Typhoon ty8 = new Typhoon(8, "2022年8月12日", "メアリー");
		Typhoon ty9 = new Typhoon(9, "2022年8月22日", "マーゴン");
		Typhoon ty10 = new Typhoon(0, null, null);
		Typhoon ty11 = new Typhoon(0, null, null);
		Typhoon ty12 = new Typhoon(0, null,null );
		Typhoon ty13 = new Typhoon(0, null, null);
		Typhoon ty14 = new Typhoon(0, null, null);
		Typhoon ty15 = new Typhoon(0, null, null);

		Typhoon[] typhoonList = { ty1, ty2, ty3, ty4, ty5, ty6, ty7, ty8, ty9 };
		//		List<Typhoon> list  = new ArrayList<>();
		//		list.add(ty1);
		//		list.add(ty2);
		//		list.add(ty3);
		//		list.add(ty4);
		//		list.add(ty5);
		//		list.add(ty6);
		//		list.add(ty7);
		//		list.add(ty8);
		//		list.add(ty9);		

		point: while (true) {

			//			for(int i = 0; i < list.size(); i++) {
			//				System.out.println(i + 1 + "リスト号目の名前は" + list.get(i).getAsiaName());
			//			}

			for (int i = 0; i < typhoonList.length; i++) {
				System.out.println(i + 1 + "号目の名前は" + typhoonList[i].getAsiaName());
			}

			Scanner stdIn = new Scanner(System.in);

			try {
				System.out.println("台風情報を表示なら「０」、編集なら「９９」、新規追加なら「５５」を入力してください。");
				int se = stdIn.nextInt();

				if (se == 0) {
					System.out.println("何番目の情報を表示しますか(1～9)");
					int ban = stdIn.nextInt();
					System.out.println("「"+ban + "号目の名前は" + typhoonList[ban - 1].getAsiaName() + "です。」");
					continue point;

				} else if (se == 99) {
					System.out.println("何号目の台風名を編集しますか");
					int ban1 = stdIn.nextInt();
					System.out
							.println(ban1 + "号目の現在の名前は" + typhoonList[ban1 - 1].getAsiaName() + "です。変更する名前を入力してください。");
					String hen = stdIn.next();
					typhoonList[ban1 - 1].setAsiaName(hen);
					System.out.println(ban1 + "号目の名前が" + hen + "に変わりました。変更後の名前を全て表示します");
					continue point;

				} else if (se == 55) {
					System.out.println("台風番号を入力してください。");
					int bango = stdIn.nextInt();
					System.out.println("台風の発生日を入力してください。");
					String hassei = stdIn.next();
					System.out.println("台風名をを入力してください。");
					String name = stdIn.next();

					Typhoon newList = new Typhoon(bango, hassei, name);

					//list.add(newList);

				} else {

					System.out.println("０、９９、55のどれかを入力してください。");
					continue point;
				}
			} catch (Exception e) {
				System.out.println("何かしらのエラーが起きました。");
				System.out.println(e);
			}

		}

	}

}