package course09;

import java.util.Scanner;

public class 練習問題 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("何派ですか");
		String like = stdIn.next();
		switch (like) {
		case "野菜","薬":
			System.out.println("健康的ですね");
			break;
		case "肉":
			System.out.println("肉派ですね");
			break;
		case"魚":
			System.out.println("魚派ですね");
			break;
		default:
			System.out.println("何食べて生きてるん");
		}
	}

}
