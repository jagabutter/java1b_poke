package course44;

public class Human extends Creatures {
	//extendsを使うことで他のクラスの変数やメソッドを取り込むことができる
	
	
	private String name;
	private String hobby;
	
	void disp() {
		System.out.println("私の名前は"+this.name+"です");
		System.out.println("私の名前は"+this.hobby+"です");
	}
	
	//取り込んだものを取り出すときにsuperを使う
	void dispWeight() {
		System.out.println("体重は"+super.getWeight()+"ｇです");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
