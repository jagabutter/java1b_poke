package course18_19;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		//慣れよう問題１
		String[] mygroup = new String[3];
		mygroup[0] = "臼井";
		mygroup[1] = "ゆうたろう";
		mygroup[2] = "つっちー";

		for (int i = 0; i < 3; i++) {
			System.out.println(mygroup[i]);
		}

		//慣れよう問題２
		int[] mygroupNum = new int[3];
		mygroupNum[0] = 4;
		mygroupNum[1] = 4;
		mygroupNum[2] = 18;

		for (int q = 0; q < 3; q++) {
			System.out.println("出席番号は" + mygroupNum[q]);
		}
		
		//慣れよう問題３
		int[] myNum=new int[3];
		myNum[0]=10;
		myNum[1]=50;
		myNum[2]=myNum[0]+myNum[1];
		//int count=myNum[0]+myNum[1];
		//myNum[2]=count;
		for (int q = 0; q < 3; q++) {
			System.out.println("出席番号は" + myNum[q]);
		}
		
		
		
		int[] myNumScan=new int[3];
		myNumScan[0]=10;
		myNumScan[1]=stdIn.nextInt();
		myNumScan[2]=myNumScan[0]+myNumScan[1];
		
		for (int q = 0; q < 3; q++) {
			System.out.println("出席番号は" + myNumScan[q]);
		}

	}

}
