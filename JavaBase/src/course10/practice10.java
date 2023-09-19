package course10;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("予約時間と曜日を入力してください");
		String w = stdIn.next();
		switch (w) {
		case "午前月曜":
		case "午前水曜":
		case "午前木曜":
		case "午前土曜":
			System.out.println("予約できます");
			break;
		case "午前日曜":
		case "午前火曜":
		case "午前金曜":
			System.out.println("予約できません");
			break;
		case "午後月曜":
		case "午後水曜":
		case "午後木曜":
		case "午後火曜":
		case"午後金曜":
			System.out.println("予約できます");
			break;
		case "午後日曜":
		case "午後土曜":
			System.out.println("予約できません");
			break;
		case "夜間月曜":
		case "夜間火曜":
		case "夜間木曜":
		case "夜間金曜":
			System.out.println("予約できます");
			break;
		case "夜間日曜":
		case "夜間水曜":
		case "夜間土曜":
			System.out.println("予約できません");
			break;
		
		default:
			System.out.println("曜日と時間を入力してください。例：午前木曜");
		}

	}

}
