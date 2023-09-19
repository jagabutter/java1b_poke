package coursemob;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("総合演習問題一問目");
		
		System.out.println("数値を入力してください");
		int a=stdIn.nextInt();
		String z="あなたが入力したのは"+a+"です";
		System.out.println(z);
		
		System.out.println("総合演習問題2問目");
		

		
		System.out.println("0か1を入力してください");
		int w=stdIn.nextInt();
	     if(w==0){
	     System.out.println("00000");
	     }else {
	    	 System.out.println("11111");
	    
	     }
	     
	     System.out.println("数値を入力してください");
	     int b=stdIn.nextInt();
	     int c=b%3;
	     int y=b%5;
	     if(c==0) {
	    	 System.out.println("Fizz");
	    	 
	    
	     }
	     
	     if(c==0) {
	    	 System.out.println("Buzz");
	    	 
	     }
	    
	
	

	}

}
