package course30_31;

public class Drink {
	int price;
	int suryo;
	String name;
	
	void display() {
		System.out.println("値段は"+price);
		System.out.println("名前は"+name);
	}
	int calcSum(int price,int suryo) {
		int sum=price*suryo;
		return sum;
	}
	Drink(int p,String n){
		price=p;
		name=n;
	}

}
