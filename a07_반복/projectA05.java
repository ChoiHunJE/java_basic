package a07_반복;

import java.util.Scanner;

public class projectA05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("두수를 입력하시오. ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int i=num1;
		
		System.out.println();
		
		System.out.println("두 수 사잇수:");
		
		while((i>=num1)&&(i<=num2)) {
		System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		int sum=0;
		i=num1;
		System.out.println("두 수 사이 홀수 합:");
		while(i>=num1&&i<=num2) {
			if(i%2!=0)
			sum +=i;
			i++;
		}System.out.println(sum);
		
		System.out.println();
		sum=0;
		i=num1;
		System.out.println("두 수 사이 짝수 합:");
		while(i>=num1&&i<=num2) {
			if(i%2==0) {
				sum+=i;
			}i++;
		}System.out.println(sum);
		
		
		System.out.println();
		System.out.println("두 수 사이 합:");
		sum=0;
		i=num1;
		while(i>=num1&&i<=num2) {
			sum+=i;
			i++;
		}System.out.println(sum);
		
		
	}

}
