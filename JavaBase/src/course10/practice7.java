package course10;

import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int e=stdIn.nextInt();
		int ee=(e%2);
		if(ee==0) {
			System.out.println("偶数だよ");
		}else {
			System.out.println("奇数だよ");
		}
	}

}
