package a06_조건;

public class If_Ex {

	public static void main(String[] args) {
		int num = 80;
		
		if(num < 0 || num >100) {
			System.out.println("올바른 점수가 아닙니다.");
		}else if(num >= 90) {
			System.out.println("90 ~ 100점 입니다.");
		}else if(num >= 80) {
			System.out.println("80 ~ 90점 입니다.");
		}else if(num >= 70) {
			System.out.println("70 ~ 80점 입니다.");
		}else if(num >= 60) {
			System.out.println("60 ~ 70점 입니다.");
		}else {
			System.out.println("0 ~ 59점입니다.");
		}
		
		
		
		
		
		
		
		
	}

}
