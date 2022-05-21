package a07_반복;
/*
 * 중첩반복  별찍기
 */

import java.util.Scanner;

public class For문02 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("반복 횟수 입력:");
		n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			for(int j = 0;j < (i+1); j++) {
			System.out.print(("*"));
			}
			System.out.println();
		}
		 
		for(int i =0;i < n; i++) { //전체반복 n줄
			for( int j =0; j<(n-i+1); j++) { //스페이스바 반복
				System.out.print(" ");
			}
			for(int j = 0;j<(i+1);j++) {//별 반복
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
