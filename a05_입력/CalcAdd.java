package a05_입력;

import java.util.Scanner;

/**
 * 
 *첫번쨰 수 입력: ?
 *두번째 수 입력: ?
 *세번째 수 입력: ?
 *
 *세 수의 합은 ? 입니다.
 *
 */

public class CalcAdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("첫번째 수를 입력: ");
//		int num4 = scanner.nextInt();
//		System.out.print("두번째 수를 입력: ");
//		int num5 = scanner.nextInt();
//		System.out.print("세번째 수를 입력: ");
//		int num6 = scanner.nextInt();
		
//		int result1 =(num4+num5+num6); 
//		System.out.println("세 수의 합은 (result) 입니다.");
		
		//정답
		/*
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		*/
		int result = 0;
		
		System.out.print("첫번째 수 입력: ");
	//	num1=scanner.nextInt();
		result += scanner. nextInt();  //단순히 입력이다.
		System.out.print("두번째 수 입력: ");
	//	num2=scanner.nextInt();
		result += scanner. nextInt();
		System.out.print("세번째 수 입력: ");
	//	num3=scanner.nextInt();
		result += scanner. nextInt();
	//	result = num1 + num2 + num3;
		System.out.println("세 수의 합은 [ " + result + " ]입니다.");
	}

}
