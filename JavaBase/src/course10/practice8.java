package course10;

import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		if (A > B && A > C) {
			System.out.println(A + "が一番大きい数値です");
			if (A > B || A > C) {
				System.out.println(A + "は二番目に大きい数値です");
			} else {
				System.out.println(A + "は三番目に大きい数値です");
			}
			if (B > A && B > C) {
				System.out.println(A + "が一番大きい数値です");
				if (B > A || B > C) {
					System.out.println(B + "は二番目に大きい数値です");
				} else {
					System.out.println(B + "は三番目に大きい数値です");
				}
				if (C > B && C > A) {
					System.out.println(A + "が一番大きい数値です");
					if (C > B || C > A) {
						System.out.println(C + "は二番目に大きい数値です");
					} else {
						System.out.println(C + "は三番目に大きい数値です");
					}
				}

			}

		}
	}
}
