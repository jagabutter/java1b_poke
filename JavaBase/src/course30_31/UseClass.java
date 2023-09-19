package course30_31;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Drink g = new Drink(100, "初期データ");
		g.display();

		g.price = 150;
		g.name = "午後の紅茶";

		g.display();
		Scanner stdIn = new Scanner(System.in);
		System.out.println("個数を入力");
		g.suryo = stdIn.nextInt();
		int sum = g.calcSum(g.price, g.suryo);
		System.out.println("合計は" + sum);
		//これでもよい
		//System.out.println(g.calcSum(g.price,g.suryo));

	}

}
