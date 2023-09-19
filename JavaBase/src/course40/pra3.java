package course40;

public class pra3 {

	public static void main(String[] args) {
		printHello();
		int a1=10;
		int a2=20;
		multiply(a1,a2);
		int sum=multiplymodori(a1,a2);
		System.out.println(sum);
		boolean tf=isEven(a1);
		System.out.println(tf);
		String name1="かじま";
		String moji=getGreeting(name1);
		System.out.println(moji);

	}
	static void printHello() {
		System.out.println("Hello,World!");
	}
	static void multiply(int a,int b) {
		System.out.println(a*b);
	}
	static int multiplymodori(int a,int b) {
		int c=a*b;
		return c;
	}
	static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}
	static String getGreeting(String name) {
		String o="こんにちは"+name;
		return o;
		
	}


}

