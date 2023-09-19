package course11;

public class while鉄板 {

	public static void main(String[] args) {
		//while文鉄板構文
		int i=1;
		while(i<10) {
			System.out.println(i);
			if(i==5) {
				break;
			}
			i++;
			
		}
		System.out.println("抜けたよ");

	}

}
