package a06_조건;
/*
 * 학점 계산
 */

import java.util.Scanner;

public class Score {
	/*
	 * 학점계산
	 * 정수형 변수 score
	 * 문자열 변수 grade
	 * 
	 * 입력
	 * 정수를 입력해주세요 : 80
	 * 
	 * 조건
	 * 0미만 이거나 100 초과면 잘못된 정수입니다. 출력
	 * 90 ~ 100 A학점 출력
	 * 80 ~ 89 B학점 출력
	 * 70 ~ 79 C학점 출력
	 * 60 ~ 69 D학점 출력
	 * 0 ~ 59  F학점 출력
	 * 
	 * grade = "A학점";
	 * 
	 * 출력
	 * A학점
	 */

	public static void main(String[] args) {
		int score = 0;
		String grade = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 :");
		score =scanner.nextInt();
		
		
		if(score < 0 || score >100 ) {
			grade = "잘못된 정수입니다.";
		}else if(score >=90) {
			grade = "A학점";
		}else if(score >=80) {
			grade = "B학점";
		}else if(score >=70) {
			grade = "C학점";
		}else if(score >=60) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		System.out.println(grade);
		}
		
		
		
	}


