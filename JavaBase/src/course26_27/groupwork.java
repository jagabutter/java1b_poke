package course26_27;

public class groupwork {

	public static void main(String[] args) {
		int gamecount = 0;
		int wincount = 0;
		int losecount = 0;

		int syoritu = syoritu1(gamecount,wincount);
		dispResult(gamecount, wincount, losecount);
	}

	//勝率メソッド
	static int syoritu1(int game, int win) {
		int syoritu2 = win / game;
		int syoritu3 = syoritu2 * 100;
		return syoritu3;
	}

	static void dispResult(int game, int win, int lose) {
		System.out.println("ゲーム数は" + game + "です");
		System.out.println("勝利数は" + win + "です");
		System.out.println("敗北数は" + lose + "です");
	}

}
