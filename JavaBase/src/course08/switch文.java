package course08;
import java.util.Scanner;

public class switch文 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Scanner stdIn=new Scanner(System.in);
	System.out.println("肉派？魚派？野菜派？");
	String like=stdIn.next();
		
		
		//switch文鉄板構文
		switch(like) {
		case"魚":
			System.out.println("魚が好きです。");
			//以降の判定を全スキップ
			break;
		case"肉":
			System.out.println("肉が好きです。");
			break;
		case"野菜":
				System.out.println("野菜が好きです。");
				break;
				//どれにも該当しない場合
		default:
			System.out.println("野菜派です。");
			
		}

	}

}
