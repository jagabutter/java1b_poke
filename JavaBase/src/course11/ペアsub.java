package course11;

public class ペアsub {

	public static void main(String[] args) {
		int suzi = 1;
		while (suzi <= 7) {
			switch (suzi) {
			case 1, 7:
				System.out.println("*");
				break;
			case 2, 6:
				System.out.println("**");
				break;
			case 3, 5:
				System.out.println("***");
				break;
			case 4:
				System.out.println("****");
				break;

			}
			suzi++;
		}

	}

}
