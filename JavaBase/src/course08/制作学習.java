package course08;

import java.util.Scanner;

public class 制作学習 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("何月？");
		int tuki = stdIn.nextInt();

		switch (tuki) {
		case 1,3,5,7,8,10,12:
			System.out.println("31日まであります");
			break;
		case 2:
			System.out.println("28日まであります");
			break;
		case 4,6,9,11:
			System.out.println("30日まであります");
			break;
		}

	}

}
