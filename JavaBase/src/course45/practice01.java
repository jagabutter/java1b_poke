package course45;

public class practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numExArr = { 10, 50, 30, 20, 40 };
		int s = 0;
		s = numExArr[4];
		numExArr[4] = numExArr[0];
		numExArr[0] = s;
		
		s = numExArr[3];
		numExArr[3] = numExArr[1];
		numExArr[1] = s;
		
		System.out.println(numExArr[0]);
		System.out.println(numExArr[4]);

		System.out.println(numExArr[1]);
		System.out.println(numExArr[3]);

		//		numExArr[4]= numExArr[0];
		//		System.out.println(numExArr[4]);
	}
}
