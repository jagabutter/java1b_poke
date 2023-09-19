package course20;

public class 練習問題２ {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for (int o = 0; o < arr.length; o++) {
			if (arr[o] > 29) {
				System.out.println(o + "番目の要素は30以上です");
			}

		}

	}

}
