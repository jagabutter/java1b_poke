package course33;

public class Kaden {
	//privateってついてると他クラスからのアクセスができなくなる
	private String name;
	private int price;
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		if(category.equals("大型")) {
			this.category = category;
		}else {
			this.category="設定NG";
		}
		
	}

	public String getName() {
		return name;
	}

	//セットするためのメソッド
	public void setName(String name) {
		if (name.equals("マウス")) {
			this.name = "設定NG";

		} else {
			this.name = name;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
