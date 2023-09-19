package course22_23;

import java.util.Scanner;

public class groupwork {

	public static void main(String[] args) {
		String save = "";
		int c = 0;
		int c1 = 0;
		String[][] arr = { { "★", "■", "★" }, { "■", "★", "▲" }, { "▲", "■", "▲" } };
		System.out.println("リコどら！！");
		Scanner stdIn = new Scanner(System.in);

		do {

			System.out.println("現在のパネル↓");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}

			System.out.println("入れ替え位置入力");
			int tate = stdIn.nextInt();
			System.out.println("入れ替え位置入力");
			int yoko = stdIn.nextInt();
			System.out.println("入れ替え先位置入力");
			int tate2 = stdIn.nextInt();
			System.out.println("入れ替え先位置入力");
			int yoko2 = stdIn.nextInt();

			save = arr[tate][yoko];
			arr[tate][yoko] = arr[tate2][yoko2];
			arr[tate2][yoko2] = save;
			c1 = c1 + 1;

			if (arr[0][0].equals(arr[0][1]) && arr[0][0].equals(arr[0][2])) {
				arr[0][0] = "G";
				arr[0][1] = "G";
				arr[0][2] = "G";
				c = c + 1;

			}
			if (arr[0][0].equals(arr[1][0]) && arr[0][0].equals(arr[2][0])) {
				arr[0][0] = "G";
				arr[1][0] = "G";
				arr[2][0] = "G";
				c = c + 1;

			}
			if (arr[1][0].equals(arr[1][1]) && arr[1][0].equals(arr[1][2])) {
				arr[1][0] = "G";
				arr[1][1] = "G";
				arr[1][2] = "G";
				c = c + 1;

			}
			if (arr[2][0].equals(arr[2][1]) && arr[2][0].equals(arr[2][2])) {
				arr[2][0] = "G";
				arr[2][1] = "G";
				arr[2][2] = "G";
				c = c + 1;

			}
			if (arr[0][1].equals(arr[1][1]) && arr[0][1].equals(arr[2][1])) {
				arr[0][1] = "G";
				arr[1][1] = "G";
				arr[2][1] = "G";
				c = c + 1;

			}
			if (arr[0][2].equals(arr[1][2]) && arr[0][2].equals(arr[2][2])) {
				arr[0][2] = "G";
				arr[1][2] = "G";
				arr[2][2] = "G";
				c = c + 1;

			}

		} while (c < 3);
		System.out.println("クリア");
		System.out.println("手数は" + c1 + "回です");

	}

}
