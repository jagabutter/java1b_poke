package course24;

public class 練習問題 {
	//呼び出す側
	public static void main(String[] args) {
		mondai01();
		rikou();
		keisan();
		hensu();

	}
	//呼び出される側
	static void mondai01() {
		System.out.println("呼び出されたよ");
	}
	static void rikou() {
		System.out.println("卍国際理工最強卍");
	}
	static void keisan() {
		System.out.println(1 + 1);
	}
	static void hensu() {
		int a = 100;
		System.out.println(a);
	}
}
