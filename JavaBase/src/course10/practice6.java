package course10;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		int y=stdIn.nextInt();
		if(x>y) {
			System.out.println("xがでかい！なぜならｘは"+x+"でyは"+y+"だから");
		}else {
			System.out.println("yがでかい！なぜならｙは"+y+"でｘは"+x+"だから");
		}
		
	}

}
