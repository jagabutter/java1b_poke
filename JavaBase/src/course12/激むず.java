package course12;

import java.util.Scanner;

public class 激むず {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("縦の値を入力してね。");
		int tate=stdIn.nextInt();
		System.out.println("横の値を入力してね。");
		int yoko=stdIn.nextInt();
		for(int y=1;y<=tate;y++) {
			for(int x=1;x<=yoko;x++) {
				if(y*x<yoko)
					System.out.print("  ");
				else
					System.out.print(" ");
				System.out.print(y*x);
			}
			System.out.println();
		}
		
		

	}
}