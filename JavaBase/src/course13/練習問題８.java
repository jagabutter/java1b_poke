package course13;

public class 練習問題８ {

	public static void main(String[] args) {
		System.out.println("数値を入力してね");

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			switch (i) {
			case 11, 22, 33, 44, 55, 66, 77, 88, 99:
				System.out.println("ゾロ目だよ↑");
				break;
			}

		}
	}
}
