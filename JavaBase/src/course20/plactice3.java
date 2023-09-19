package course20;

public class plactice3 {

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};
		int goukei=0;
		int hiki=0;
		for(int i = 0; i < arr.length; i++) {
			if(i==0||i==4) {
				goukei=goukei+arr[i];
			}
			if(i==3||i==1) {
				hiki=arr[i]-hiki;
			}
		}
		System.out.println(goukei);
		System.out.println(hiki);

		

	}

}
