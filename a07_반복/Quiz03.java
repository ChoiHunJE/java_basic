package a07_반복;
/*
 * 기찍기
 */

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int i =0;
		int count=0;  //카운트는 입력값이므로 변화 안시키는 쪽이 좋음.
		
		System.out.print("처음 시작 숫자는? ");
		count =sc.nextInt();
		
		while(i < count) {
			System.out.println(count-i);
			i++;
		}
		
		
		
		
		
	}

}
