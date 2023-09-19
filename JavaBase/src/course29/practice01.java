package course29;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Character me =new Character();
		me.name="鹿嶋柊弥";
		me.hp=100;
		me.str=20;
		me.dex=80;
		me.agi=40;
		me.def=10;
		me.viewStatus();
		
		Character tonari =new Character();
		tonari.name="溝口しんや";
		tonari.hp=100;
		tonari.str=15;
		tonari.dex=10;
		tonari.agi=50;
		tonari.def=10;
		tonari.viewStatus();
		
		me.battle(me,tonari);
		System.out.println();
		
		Scanner stdIn=new Scanner(System.in);
		Character s=new Character();
		System.out.println("名前は");
		s.name=stdIn.next();
		System.out.println("HP,攻撃力,命中率,回避率,防御力を入力");
		s.hp=stdIn.nextInt();
		s.str=stdIn.nextInt();
		s.dex=stdIn.nextInt();
		s.agi=stdIn.nextInt();
		s.def=stdIn.nextInt();
		
		s.viewStatus();
	
		

	}

}
