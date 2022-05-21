package a08_메소드;
/**
 * 
 * N개의 합
 *
 */

public class Quiz01 {
	
	static int sum(int n ,int startNum, int resultNum) {
		if(n != 0) { //n이 0이 아니면 아래를 반복해라
			resultNum += startNum;
			return sum(--n, ++startNum, resultNum);
		}
			return resultNum;
	}

	public static void main(String[] args) {
		
		System.out.println(sum(100, 1, 0));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
