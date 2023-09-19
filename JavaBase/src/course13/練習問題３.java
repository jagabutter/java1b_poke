package course13;

public class 練習問題３ {

	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			int y = i % 2;
			if (y == 0 && i > 1) {
				System.out.println("偶数です↓");
			}
			System.out.println(i);

		}

	}
}
