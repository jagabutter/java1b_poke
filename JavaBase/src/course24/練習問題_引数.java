package course24;

public class 練習問題_引数 {

	public static void main(String[] args) {
		int suzi = 30;
		String m = "引数だよー";
		int suzi1 = 50;
		int suzi2 = 40;

		bai(suzi);
		moji(m);
		niko(suzi1, suzi2);
	}

	static void bai(int bai1) {
		System.out.println(bai1 * 2);
	}

	static void moji(String mo) {
		System.out.println(mo);
	}

	static void niko(int x, int y) {
		System.out.println(x + y);
	}

}
