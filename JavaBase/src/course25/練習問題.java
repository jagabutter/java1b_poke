package course25;

public class 練習問題 {

	public static void main(String[] args) {
		int y = modoriOne(134);
		String moji = modoriTwo("文字！");
		int z = modoPraThree(333, 555);

		System.out.println(y);
		System.out.println(moji);
		System.out.println(z);
	}

	static int modoriOne(int x) {
		int z = x + 100;
		return z;
	}

	static String modoriTwo(String m) {
		String moji1 = m + "を受け取りました";
		return moji1;
	}

	static int modoPraThree(int x, int y) {
		int sum = x + y;
		return sum;
	}

}
