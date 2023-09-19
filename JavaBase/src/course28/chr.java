package course28;

public class chr {
	int attack;
	static int def;
	int spd;
	int love;
	int mp;
	int hp;

	static void naguru(int naguruattack, int naguraredef) {
		System.out.println((naguruattack - naguraredef) + "のダメージを与えた");
	}

	static void mamoru() {
		System.out.println("守りを固めて防御が" + (def * 2) + "になった");
	}

}
