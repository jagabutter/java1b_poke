package course10;

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		int y=stdIn.nextInt();
		if(x>y) {
			System.out.println("xがでかい");
			if(x<y) {
				System.out.println("yがでかい");
			}
		}else {
			System.out.println("おなじー");
		}
		
	}

}
