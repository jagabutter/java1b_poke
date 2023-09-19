package course20;

public class むず {

	public static void main(String[] args) {
		String []arr= {"y","x","x","y","x","x","x","y"};
		int kazu=0;
		for(String num:arr) {
			if("x".equals(num)) {
				kazu=kazu+1;
			}
		}
		System.out.println(kazu);


	}

}
