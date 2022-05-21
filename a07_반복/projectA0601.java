package a07_반복;

import java.util.Scanner;

public class projectA0601 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a =0;
		int b =0;
		
		System.out.print("두수를 입력하시오. ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(int i=a; i<=b; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.print("8의 배수: ");
		for(int i=a; i<=b; i++) {
			if(i%8==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.print("짝수는? ");
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int sum=0;
		System.out.print("두수사이의 합: ");
		for(int i=a;i<=b;i++) {
			sum +=i;
			}System.out.println(sum);
		
		System.out.println();
		sum =0;
		System.out.print("두수사이의 홀수 합: ");
		for(int i =a;i<=b;i++) {
			if(i%2!=0) {
				sum +=i;
			}
		}System.out.println(sum);
		
		System.out.println();
		sum=0;
		System.out.print("두수사이의 짝수 합: ");
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				sum +=i;
			}
		}System.out.println(sum);
		
		System.out.println();
		System.out.print("두수사이의4의배수출력및합: ");
		sum=0;
		for(int i=a;i<=b;i++) {
			if(i%4==0) {
				System.out.print(i+" ");
				sum +=i;
			}
		}System.out.println(sum);
		
		System.out.println();
		System.out.print("연속되는 수 출력: ");
		for(int i=a;i<=b;i++) {
			if(i%11==0) {
				System.out.print(i+" ");
			}
		}
		
		

	}

}
