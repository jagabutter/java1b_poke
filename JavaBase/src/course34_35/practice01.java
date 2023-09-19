package course34_35;

import java.util.Scanner;

public class practice01 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("変数を一つ入力");
		int x=stdIn.nextInt();
		if(x>=50) {
			System.out.println("もう一つの変数入力");
			int y=stdIn.nextInt();
			calc(x,y);
		}else {
			calc(x);
		}

	}
	static void calc(int x,int y) {
		System.out.println("合計は"+(x+y)+"です");
		
	}
	static void calc(int x) {
		System.out.println("値の10倍は"+(x*10)+"です");
		
	}
}
