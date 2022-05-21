package a07_반복;

public class BreakContinue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i% 2 ==0) {
				continue; //continue기준으로 나는 반복 하지 말고 다음을 계속 반복 해라.
			}
			System.out.println(i);
			continue;
		}
		System.out.println();
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
