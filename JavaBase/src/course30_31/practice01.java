package course30_31;

public class practice01 {

	public static void main(String[] args) {
		Books books =new Books("初期ネーム",100,"初期太郎");
		books.display();
		
		books.name="ITワールド";
		books.page=500000;
		books.author="サーティファイ";
		
		books.display();
	}

}
