
package course20;

public class Sample02for拡張構文 {

	public static void main(String[] args) {
		int[] numArray = { 10, 20, 30, 40, 50 };
		//左側に取り出したときの変数
		//右側に取り出したもとの配列
		for (int num : numArray) {
			System.out.println(num);
		}

	}

}

