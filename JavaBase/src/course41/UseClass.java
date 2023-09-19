package course41;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Product pro1=new Product();
		pro1.no="A001";
		pro1.name="Item1";
		pro1.price=200;
		pro1.quantity=10;
		
		pro1.display();
		
		Food food=new Food();
		food.display();
		
		food.name="パン";
		food.price=100;
		food.display();
		

		Food []menu=new Food[4];
		Scanner stdIn=new Scanner(System.in);
		
		Food food1=new Food();
		Food food2=new Food();
		Food food3=new Food();
		Food food4=new Food();
		
		food1.name=stdIn.next();
		food1.price=stdIn.nextInt();
		menu[0]=food1;
		
		food2.name=stdIn.next();
		food2.price=stdIn.nextInt();
		menu[1]=food2;
		
		food3.name=stdIn.next();
		food3.price=stdIn.nextInt();
		menu[2]=food3;
		
		food4.name=stdIn.next();
		food4.price=stdIn.nextInt();
		menu[3]=food4;
		
		for(int c=0;c<menu.length;c++) {
			menu[c].display();
		}
		
		int save=0;
		for (int a = 4; a >= 0; a--) {
			for (int w = 0; w < a; w++) {
				if (menu[w].price < menu[w+1].price ) {
					save = menu[w+1].price;
					menu[w+1].price = menu[w].price;
					menu[w].price = save;
				}
			}
		}
		for(int c=0;c<menu.length;c++) {
			menu[c].display();
		}
		
	}

}
