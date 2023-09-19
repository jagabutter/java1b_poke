package course22_23;

import java.util.Arrays;

public class sample01 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;

		System.out.println(arr[1][0]);
		//ちなみにこの書き方でもOK
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };

		//サンプル問題１
		int[][] sam = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		System.out.println(sam[1][2]);

		//サンプル問題２
		if (sam[2][0] > 50) {
			System.out.println("大きいです");
		}

		//サンプル問題３
		int sum = 0;

		sum = sam[1][1] + sam[2][2];

		System.out.println(sum);
		
		//サンプル問題４
		System.out.println(Arrays.deepToString(sam));

	}

}
