package a07_반복;
/*
 *로 피라미드 찍기
 */



public class Quiz4 {

	public static void main(String[] args) {
	
		for(int i=1;i<6;i++) {
			for(int j=5;j-i>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	} //main

}
