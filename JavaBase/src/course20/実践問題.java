package course20;

public class 実践問題 {

	public static void main(String[] args) {
		String []arr= {"x","y","x","y","x"};
		int kazu=0;
		for(String num:arr) {
			if("x".equals(num)) {
				kazu=kazu+1;
			}
		}
		System.out.println(kazu);


	}

}
