package course40;

public class pra2 {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };
		int[] numbers1 = { 11, 20, 31, 40, 51 };
		for (int num : numbers) {
			System.out.println(num);
		}
		String[] cities = { "東京", "大阪", "千葉", "神奈川", "埼玉" };
		for (String num : cities) {
			System.out.println(num);
		}
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		System.out.println("合計値は" + sum);
		int sum1 = 0;
		for (int num = 0; num < numbers.length; num++) {
			if (sum1 < numbers[num]) {
				sum1 = numbers[num];
			}
		}
		System.out.println(sum1);
		for (int num = 0; num < numbers1.length; num++) {
			if (numbers1[num] % 2 == 1) {
				System.out.println(numbers1[num]);
				
			} 
		}

	}

}
