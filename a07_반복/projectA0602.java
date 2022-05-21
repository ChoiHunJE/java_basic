package a07_반복;

import java.util.Scanner;

public class projectA0602 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int score=0;
		char grade=0;
		char opt=0;
		
		System.out.print("점수를 입력하시오. ");
		score =sc.nextInt();
		
		if(score>=90) {
			if(score>=98) {
				opt='+';
			}else if(score<94) {
				opt='-';
			}
			grade='A';
		}else if(score>=80) {
			if(score>=88) {
				opt='+';
			}else if(score<84) {
				opt='-';
			}
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else if(score>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("학점은: " +grade+opt);
		
		
		
		
		
	}

}
