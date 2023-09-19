package course38_39;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Pocketon poke1 = new Pocketon();
		poke1.name = "銭カメ";
		poke1.power = 100;
		poke1.difficult = 1;
		
		Pocketon poke2 = new Pocketon();
		poke2.name="不思議リーフ";
		poke2.power=200;
		poke2.difficult=3;
		
		
		Pocketon poke3=new Pocketon();
		Scanner stdIn=new Scanner(System.in);
		System.out.println("名前入力");
		poke3.name=stdIn.next();
		System.out.println("強さ入力");
		poke3.power=stdIn.nextInt();
		System.out.println("難しさ入力");
		poke3.difficult=stdIn.nextInt();

		String[] arr2 = { "あ", "か", "さ" };
		
		Pocketon[] myPockes = new Pocketon[3];
		myPockes[0]=poke1;
		myPockes[1]=poke2;
		myPockes[2]=poke3;
		
		System.out.println(myPockes[0].name);
		System.out.println(myPockes[1].difficult);
		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].power);
		System.out.println(myPockes[2].difficult);
		
		for(int x=0;x<3;x++) {
			System.out.println(myPockes[x].name);
		}
		
		myPockes[1].display();
		
		Student st =new Student();
		st.name="鹿嶋柊弥";
		st.no=9;
		
		Student st2 =new Student();
		st2.name="溝口しんや";
		st2.no=25;
		
		Student[] myfriend= {st,st2};
		for(int i=0;i<2;i++) {
			System.out.println(myfriend[i].name);
		}
	}

}
