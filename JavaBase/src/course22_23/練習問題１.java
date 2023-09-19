package course22_23;

import java.util.Arrays;

public class 練習問題１ {

	public static void main(String[] args) {
		String[][] ox= {{"o","x","o"},{"x","o","x"},{"o","o","o"}};
		System.out.println(ox[2][1]);
		//配列の要素をすべて表示するコマンドみたいなもの↓
		
		System.out.println(Arrays.deepToString(ox));
		
		int c=0;
		for(int tate=0;tate<3;tate++) {
			for(int yoko=0;yoko<3;yoko++) {
				System.out.println("現在の要素は"+ox[tate][yoko]);
				if(ox[tate][yoko].equals("o")) {
					c=c+1;
				}
			}
			System.out.println();
		}
		System.out.println("oの数は"+c+"回です");
	}

}
