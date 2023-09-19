package 総合演習sub;

public class Battle {
	String winner;

	String doBattle(Pocketon poke1, Pocketon poke2) {
		System.out.println("計算前poke1:" + poke1.power + "poke2:" + poke2.power);
		//最初に相性（タイプ判定）
		//poke1が火で、poke2が草だった場合
		if (poke1.type.equals("火") && poke2.type.equals("草")) {

			//poke1のpowerを二倍にする
			poke1.power = poke1.power * 2;

		} else if (poke2.type.equals("火") && poke1.type.equals("草")) {

			//逆にpoke2が火で、poke1が草だった場合
			//poke2のpowerを二倍にする
			poke2.power = poke2.power * 2;

		}

		//poke1が草で、poke2が地面だった場合
		if (poke1.type.equals("草") && poke2.type.equals("地面")) {

			//poke1のpowerを二倍にする
			poke1.power = poke1.power * 2;

		} else if (poke2.type.equals("草") && poke1.type.equals("地面")) {

			//逆にpoke2が草で、poke1が地面だった場合
			//poke2のpowerを二倍にする
			poke2.power = poke2.power * 2;

		}

		//poke1が地面で、poke2が水だった場合
		if (poke1.type.equals("地面") && poke2.type.equals("水")) {

			//poke1のpowerを二倍にする
			poke1.power = poke1.power * 2;

		} else if (poke2.type.equals("地面") && poke1.type.equals("水")) {

			//逆にpoke2が地面で、poke1が水だった場合
			//poke2のpowerを二倍にする
			poke2.power = poke2.power * 2;

		}

		//poke1が水で、poke2が火だった場合
		if (poke1.type.equals("水") && poke2.type.equals("火")) {

			//poke1のpowerを二倍にする
			poke1.power = poke1.power * 2;

		} else if (poke2.type.equals("水") && poke1.type.equals("火")) {

			//逆にpoke2が水で、poke1が火だった場合
			//poke2のpowerを二倍にする
			poke2.power = poke2.power * 2;

		} else {

		}

		//勝敗判定
		//poke1のpowerが高かったら
		System.out.println("計算後poke1:" + poke1.power + "poke2:" + poke2.power);
		if (poke1.power > poke2.power) {

			//poke1の名前をwinnerにいれて返す
			winner = poke1.name + "の勝ち";
			return winner;

		} else if (poke1.power < poke2.power) {

			//poke2のpowerが高かったら
			//poke2の名前をwinnerにいれて返す
			winner = poke2.name + "の勝ち";
			return winner;

		} else {
			winner = "引き分け";
			return winner;
		}

	}

}
