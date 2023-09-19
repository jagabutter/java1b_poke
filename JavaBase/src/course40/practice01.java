package course40;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		int number= 15;
		int age=20;
		int score=85;
		boolean isRaining =true;
		
		if(number>10) {
			System.out.println("でか！！！");
		}
		if(age>=18) {
			System.out.println("大人っすね");
		}else {
			System.out.println("キッズだね^^");
		}
		if(score>=90) {
			System.out.println("Excellent");
		}
		if(score>=80&&score<90) {
			System.out.println("Good");
		}else {
			System.out.println("勉強しましょう");
		}
		if(isRaining) {
			System.out.println("傘持ってけーー");
		}else {
			System.out.println("よい一日を");
		}
		Scanner stdIn=new Scanner(System.in);
		int num=stdIn.nextInt();
		if(num%2==0) {
			System.out.println("偶数でっせ");
		}else {
			System.out.println("奇数だよ");
		}
		for(int c=1;c<11;c++) {
			System.out.println(c);
		}
		for(int f=1;f<101;f++) {
			if(f%2==0) {
				System.out.println("現在"+f+"回目のループです。偶数です");
			}
		}
		for(int a=10;a>0;a--) {
			System.out.println(a);
		}
		int sum=0;
		for(int q=1;q<101;q++) {
			
			sum=sum+q;
		}
		System.out.println(sum);
	}

}
