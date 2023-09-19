package course48;

import java.util.Random;

public class sample {

	public static void main(String[] args) {
		int[][] sa = new int[6][6];
		int count = 0;
		int count2 = 0;

		Random rnd = new Random();
		//重複ありの席ぶち込み
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				sa[i][j] = rnd.nextInt(36) + 1;
			}
		}

		//重複があるかどうかの判定
		while (count < 36) {

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					int a = rnd.nextInt(36) + 1;
					if (sa[i][j] != a) {
						sa[i][j] = a;
						count++;
					} else {
						break;
					}
				}
			}
		}

		//全表示プログラム
		for (int tate = 0; tate < 6; tate++) {
			for (int yoko = 0; yoko < 6; yoko++) {
				System.out.print(sa[tate][yoko]);
				System.out.print(" ");
			}
			System.out.println("");
		}

		//	static int hikaku(int x) {
		//		Random rnd = new Random();
		//		int a = rnd.nextInt(36) + 1;
		//		if (x != a) {
		//			return a;
		//		} else {
		//			return x;
		//		}
		//	}
	}
}
