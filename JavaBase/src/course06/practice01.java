package course06;

import java.util.Scanner;

public class practice01 {
	public static void main(String[] args) {
		int x =3;
		
		if(x>3){
			System.out.println("大きい");
		} else {
			System.out.println("小さい");
		}
		int s=10;
		int y=100;
		
		if(s!=y) {
			System.out.println("違うよ");
			
		}else {
			System.out.println("同じだよ");
		}
		
		int h=4;
		
		if(h>=3);{
		System.out.println("3以上だよ");
		}
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力");

		int t = stdIn.nextInt();
		if(t>=10) {
			System.out.println("10以上");
		}else {
			System.out.println("小さい");
			
		}
		String a="あいうえお";
		String b="かきくけこ";
		
		if(a.equals(b)) {
			System.out.println("文字は一緒です");
		}else {
			System.out.println("違うよ！");
		}
	}

}
