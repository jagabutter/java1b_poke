package course11;

public class ペア {

	public static void main(String[] args) {
		int w = 1;
		while (w <= 4) {
			System.out.println("*".repeat(w));
			w++;
			while(w==5) {
				System.out.println("*"+"*"+"*");
				w++;
			}while(w==6) {
				System.out.println("*"+"*");
				w++;
			}while(w==7) {
				System.out.println("*");
				w++;
			}
		}
	}

}
