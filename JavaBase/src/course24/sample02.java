package course24;

public class sample02 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//int型A,Bをメソッドに渡して呼び出す
		plus(a,b);
		
		System.out.println("呼び出し終わったよ");
	}
	
	//呼び出される側
	//int　Aの値がint　Xに、int Bの値がint　Yに格納される
	//XとYはなんでもよい（変数は）
	static void plus(int a,int b) {
		System.out.println(a+b);
	}
}
