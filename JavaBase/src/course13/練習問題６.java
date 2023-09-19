package course13;

import java.util.Scanner;

public class 練習問題６ {

	public static void main(String[] args) {
		System.out.println("数値を入力してね");
		Scanner stdIn=new Scanner(System.in);
		
		
		int yy=stdIn.nextInt();
		for(int i=0;i<yy; i++) {
			System.out.println("現在"+i+"回目のループです");
		}
		
	}
}
