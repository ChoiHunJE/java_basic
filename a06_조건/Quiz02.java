package a06_조건; 
/*
 * 사분면 고르기
 *
*/
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x =0, 
			y=0 ,
			quadrant =0;
			
		
		System.out.print("x축:");
		x= sc.nextInt();
		System.out.print("y축:");
		y= sc.nextInt();
		
/*	if(x > 0 && y > 0) {quadrant=1;
			System.out.println(quadrant+"사분면");
		}else if(x < 0 && y > 0) {quadrant=2;
			System.out.println(quadrant+"사분면");
		}else if(x < 0 && y< 0) {quadrant=3;
			System.out.println(quadrant+"사분면");
		}else if(x > 0 && y > 0) {quadrant=4;
			System.out.println(quadrant+"사분면");
		}else {
			System.out.println("원점");*/
		
		if(x == 0 && y ==0){
			System.out.println("원점입니다.");
		}else if(x > 0 && y > 0) {
			quadrant = 1;
		}else if(x <0 && y > 0) {
			quadrant =2;
		}else if(x <0 && y < 0) {
			quadrant =3;
		}else  {
			quadrant =4;
		}
		
		System.out.println(quadrant + "사분면");   //&& : 이면서 || : 이거나
		
		
		
		
		
		
		}
		
		
		
	}


