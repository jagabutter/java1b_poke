package course10;

import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String w = stdIn.next();
		switch (w) {
		case "月曜":
		case "水曜":
		case "木曜":
		case "土曜":
			System.out.println("予約できます");
			break;
		case "日曜":
		case "火曜":
		case "金曜":
			System.out.println("予約できません");
			break;
		default:
			System.out.println("曜日を入力してください");
		}

	}

}
