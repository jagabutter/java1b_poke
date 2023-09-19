package course30_31;

public class Books {
	String name;
	int page;
	String author;

	Books(String n, int page1, String a) {
		name=n;
		page = page1;
		author=a;
	}

	void display() {
		System.out.println("名前は"+name);
		System.out.println("ページは"+page);
		System.out.println("著者は"+author);
	}

}
