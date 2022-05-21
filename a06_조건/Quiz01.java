package a06_조건;
/*
 * 두 수 비교
*/
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력해주세요: ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		
		if (A > B) {
			System.out.println(">");
		}else if (A < B) {
				System.out.println("<");
		}else {
				System.out.println("==");
				}
		
		
	}

}
