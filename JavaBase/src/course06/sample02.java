package course06;

import java.util.Scanner;

public class sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String a="あいうえお";
		String b="かきくけこ";
		
		if(a.equals(b)) {
			System.out.println("文字は一緒です");
		}else {
			System.out.println("違うよ！");
		}
		
		if(a.equals("さしすせそ")) {
			System.out.println("文字は一緒です");
			
		}else {
			System.out.println("違うよ！");
		}
		Scanner stdIn =new Scanner(System.in);
		
		System.out.println("文字を入力してね");
		String moji=stdIn.next();
		
		if(moji.equals("国際理工")) {
			System.out.println("あなたが打ったのは「国際理工」だ！");
		}else {
			System.out.println("国際理工じゃないなんて・・・。");
		}

		
	}

}
