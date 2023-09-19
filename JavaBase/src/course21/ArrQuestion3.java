package course21;

import java.util.Scanner;

public class ArrQuestion3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int typhoonAll = 0;
		int quakeAll = 0;
		int rainAll = 0;
		int tuki = 0;
		int save = 0;
		int savetuki = 0;

		int[] tuk = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] typhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		int[] quake = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
		int[] rain = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };

		for (int typhoon1 : typhoon) {
			typhoonAll = typhoonAll + typhoon1;
		}
		for (int quake1 : quake) {
			quakeAll = quakeAll + quake1;
		}
		for (int rain1 : rain) {
			rainAll = rainAll + rain1;
		}

		System.out.println("見たい情報を選んでください");
		System.out.println("1.台風件数　2.地震件数　3.降水量　4.全て");
		int jouhou = stdIn.nextInt();
		if (jouhou == 1 || jouhou == 2 || jouhou == 3) {
			System.out.println("年別か月別か選んでください");
			System.out.println("1.年別　2.月別　3.年別（大きい順）");
			int nenn = stdIn.nextInt();

			//台風の大きい順
			if (nenn == 3 && jouhou == 1) {
				for (int a = 11; a >= 0; a--) {
					for (int w = 0; w < a; w++) {
						if (typhoon[w] < typhoon[w + 1]) {
							save = typhoon[w + 1];
							typhoon[w + 1] = typhoon[w];
							typhoon[w] = save;
							savetuki = tuk[w + 1];
							tuk[w + 1] = tuk[w];
							tuk[w] = savetuki;
						}
					}
				}
				for (int r = 0; r < 12; r++) {
					System.out.println(tuk[r] + "月の台風は" + typhoon[r] + "件です");
				}
			}
			//地震の大きい順
			if (nenn == 3 && jouhou == 2) {
				for (int a = 11; a >= 0; a--) {
					for (int w = 0; w < a; w++) {
						if (quake[w] < quake[w + 1]) {
							save = quake[w + 1];
							quake[w + 1] = quake[w];
							quake[w] = save;
							savetuki = tuk[w + 1];
							tuk[w + 1] = tuk[w];
							tuk[w] = savetuki;
						}
					}
				}
				for (int r1 = 0; r1 < 12; r1++) {
					System.out.println(tuk[r1] + "月の地震は" + quake[r1] + "件です");
				}
			}
			//降水量の大きい順
			if (nenn == 3 && jouhou == 3) {
				for (int a = 11; a >= 0; a--) {
					for (int w = 0; w < a; w++) {
						if (rain[w] < rain[w + 1]) {
							save = rain[w + 1];
							rain[w + 1] = rain[w];
							rain[w] = save;
							savetuki = tuk[w + 1];
							tuk[w + 1] = tuk[w];
							tuk[w] = savetuki;
						}
					}
				}
				for (int r2 = 0; r2 < 12; r2++) {
					System.out.println(tuk[r2] + "月の降水量は" + rain[r2] + "mmです");
				}
			}
			//月別を選んだときの月入力
			if (nenn == 2) {
				System.out.println("見たい月を入力してください(1～12)or9999は編集");
				int tuki1 = stdIn.nextInt();
				tuki = tuki1;
				//月別表示
				//月別台風件数
				if (jouhou == 1) {
					System.out.println(tuki + "月の台風件数は" + typhoon[tuki - 1] + "件です");
				}
				//月別地震件数
				if (jouhou == 2) {
					System.out.println(tuki + "月の地震件数は" + quake[tuki - 1] + "件です");
				}
				//月別降水量
				if (jouhou == 3) {
					System.out.println(tuki + "月の降水量は" + rain[tuki - 1] + "mmです");
				}

			}
			//年間の表示
			//年間の台風
			if (nenn == 1 && jouhou == 1) {
				System.out.println("1年間に起こった台風の総件数は" + typhoonAll + "件です");
			}
			//年間の地震
			if (nenn == 1 && jouhou == 2) {
				System.out.println("1年間に起こった地震の総件数は" + quakeAll + "件です");
			}
			//年間の降水量
			if (nenn == 1 && jouhou == 3) {
				System.out.println("1年間に起こった降水量の総量は" + rainAll + "mmです");
			}

		}
		//全て
		if (jouhou == 4) {
			for (int num = 0; num < 12; num++) {
				System.out.println(
						num + 1 + "月の台風件数,地震件数,降水量[mm]は" + typhoon[num] + "," + quake[num] + "," + rain[num] + "です");
			}
		}

	}

}
