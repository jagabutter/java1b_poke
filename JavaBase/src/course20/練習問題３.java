package course20;

public class 練習問題３ {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		int sum = 0;
		for (int o = 0; o < arr.length; o++) {
			sum = sum + arr[o];

		}
		System.out.println(sum);

	}

}
