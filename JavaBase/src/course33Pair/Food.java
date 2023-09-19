package course33Pair;

public class Food {
	String name;
	int price;
	
	void display() {
		System.out.println(name);
		System.out.println(price);
		
	}
	//インスタンスをつくる時にjavaが勝手に処理をするもの
	//パッシブのイメージ
	//インスタンスの名前とコンストラクタの名前を一致させないと実行されない
	Food(){
		name="初期";
		price=0;
		
	}

}
