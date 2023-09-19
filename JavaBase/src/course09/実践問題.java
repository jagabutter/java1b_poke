package course09;

import java.util.Scanner;

public class 実践問題 {

	public static void main(String[] args) {
		System.out.println("誕生日月を入力してね。");
		Scanner stdIn = new Scanner(System.in);
		int month = stdIn.nextInt();
		switch (month) {
		case 1,2,3:
			System.out.println("大吉");
			break;
		case 4,5,6:
			System.out.println("中吉");
			break;
		case 7,8,9:
			System.out.println("小吉");
			break;
		case 10,11,12:
			System.out.println("大凶");
			break;
		default:
			System.out.println("1～12でうてや");

		}

	}

}
