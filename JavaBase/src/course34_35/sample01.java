package course34_35;

public class sample01 {

	public static void main(String[] args) {
		//二つのcalcメソッドを呼び出し
		calc();
		calc(50, 100);
		calc("§");
		calc(90);
	}

	static void calc() {
		System.out.println("計算をしたいときは、引数を二つ渡して");
	}

	//戻り値がないからvoidにする
	static void calc(int a, int b) {
		System.out.println("計算結果は" + (a + b));
	}

	static void calc(String w) {
		System.out.println("渡された文字は" + w + "です");
	}

	static void calc(int i) {
		System.out.println("受け取った値は" + i + "です");
	}

}
