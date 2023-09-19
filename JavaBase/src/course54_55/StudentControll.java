package course54_55;

public class StudentControll {

	public static void main(String[] args) {

		Student tonari = new Student(3, "猪　琉希");
		Student me = new Student(9, "鹿嶋　柊弥");

		Student[] mymen = { tonari, me };
		
		System.out.println(mymen[1].getName());
		
		mymen[0].setName("藤倉一樹");
		//System.out.println(mymen[0].getName());

	}

}