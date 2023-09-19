package course30_31;

public class sample02 {

	public static void main(String[] args) {
		Books book1 = new Books("ITワールド", 100, "サーティファイ");
		Books book2 = new Books("明解Java", 400, "柴田望洋");

		Books arr[] = { book1, book2 };
		//配列にしまったインスタンス呼び出す場合以下のように書く
		//配列にしまった段階でbook2の名前を書かなくてよい
		System.out.println(arr[1].name);
	}

}
