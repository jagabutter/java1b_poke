package course18_19;

public class sample2 {

	public static void main(String[] args) {
		/**
		 * yesかnoかを扱うboolean型もある
		 * yesをtrue、noをfalseと言い表す
		 */
		boolean x=true;
		boolean y=false;
		
		//if文は括弧の中がtrueかどうかを判断する
		if(x) {
			System.out.println("trueだよ");
		}else {
			System.out.println("falseだよ");
		}
		
		//今までやってきた比較も最終的にはtrueかfalseでしかない
		int i=30;
		boolean z=i>15;
		if(z) {
			System.out.println("iは15よりも大きいです");
		}else {
			System.out.println("iは15以下です。");
		}

	}

}
