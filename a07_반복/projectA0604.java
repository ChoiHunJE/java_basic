package a07_반복;

import java.util.Scanner;

public class projectA0604 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String input=null;
		int sum=0;
		
		while(true) {
		input=sc.nextLine();
		if(input.equals("종료")) {
			System.out.println("프로그램 종료");
			break;
		}if(input.equals("실행")) {
			for(int i=0;i<100;i++) {
			System.out.print(i+" ");
		}continue;
			}else {
				System.out.println(input);
		}
		}
		
		
		
		
	}

	}
