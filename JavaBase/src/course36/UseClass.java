package course36;

public class UseClass {

	public static void main(String[] args) {
		Student st = new Student();

		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		st.display();

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		st2.setSchool("船橋情報専門学校");

		st.display();
		st2.display();

		Kaden k = new Kaden();
		k.name = "炊飯器";
		k.price = 10000;
		k.display();

		Kaden k1 = new Kaden();
		k1.name = "冷蔵庫";
		k1.display();
	}
}