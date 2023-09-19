package course12;

public class do文sample01 {

	public static void main(String[] args) {
		//鉄板文法
		int i=0;
		do {
			System.out.println("ここに実行したいことをかくよー");
			i++;
		}while(i<3);
		
		//変則系（ifとの組み合わせ）
		int x=0;
		do {
			if(x<3) {
				System.out.println("ifとの組み合わせだよ");
			}else if(x==2) {
				break;
				
			}
			x++;
		}while(x<3);

	}

}
