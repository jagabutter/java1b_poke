package course54_55;

public class BookControll {

	public static void main(String[] args) {

		int[] arr = { 10, 11, 12, 13, 14 };
		System.out.println(arr[3]);

		Book book1 = new Book("明解Java", 1500);
		System.out.println(book1.getPrice());

		Book book2 = new Book("ITパスポート試験　問題集", 2500);
		Book book3 = new Book("30時間でマスターVisual Bassic", 1200);
		Book book4 = new Book("確かな力が身につく", 2800);

		Book[] hondana = { book1, book2, book3, book4 };
	}

}