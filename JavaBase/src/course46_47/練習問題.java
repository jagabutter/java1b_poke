package course46_47;

public class 練習問題 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		///////////////////重要/////////////////////////////////////////////////
		//これ以降エラーする内容は同じ→０で除算（割り算）するとエラーが起こる
		////////////////////////////////////////////////////////////////////////
		int number = 1;
		if (10 / number == 2) {
			System.out.println("numberは5です。");
		}
		///catchに↓を追加すると上級者感でる。
//		e.printStackTrace();*/
		int number2 = 5;
		if (100 / number2 == 20) {
			System.out.println("numberは5です。");
		}
		int result = divideNumbers(10, 3);
		System.out.println(result);

	}

	public static int divideNumbers(int a, int b) {
		return a / b;
	}

}
