package course28;

public class sample01 {

	public static void main(String[] args) {

		//インスタンス
		//「hu1」はHumanのインスタンス（実態）
		//インスタンスに対してパラメーターを設定する。
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";

		hu1.hp = 50;
		hu1.neru();

		System.out.println(hu1.name);

		//Chrクラスのインタンス「numata」を生成。
		//attack def spd love mp hpに好きなパラメータを設定してみよう。
		chr numata = new chr();
		numata.attack = 300;
		numata.def = 0;
		numata.spd = 50;
		numata.love = 0;
		numata.mp = 100;
		numata.hp = 50;

		//chrクラスのインスタンス「kajima」を生成
		//パラメーターを設定してみよう
		chr kajima = new chr();
		kajima.attack = 400;
		kajima.def = 150;
		kajima.spd = 150;
		kajima.love = 0;
		kajima.mp = 0;
		kajima.hp = 300;

		kajima.naguru(kajima.attack, numata.def);

	}

}
