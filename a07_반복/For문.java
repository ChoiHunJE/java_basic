package a07_반복;
/*
 * for문으로 구구단 만들기 2~9단까지
 */

public class For문 {

	public static void main(String[] args) {
		/*
		 * 
		 * dan 정수형 변수 = 2
		 * 
		 * 반복문 for
		 * 
		 * dan + 문자열로 x + i +문자열 = (dan * i)
		 */
		
	//	for(int dan =2, i = 0; i < 9;++i);{
	//		System.out.println(dan +"x"+(++i)+"="+(dan*i));
		
		for(int i =0 ; i < 8 ; i++) {  //단수 8번 반복 --> 바깥 for문 / 곱하는 숫자는 9번 반복 --> 안쪽 for문
			System.out.println((i+2) + "단");
			for(int j =0; j < 9 ; j++) {
				System.out.println((i+2) + " x " + (j + 1) + " = " + ((i+2) * (j+1)));
			}
			System.out.println();  //단이 끝날때마다 보기좋게 한칸아래씩
		}
		
		
		
		
		
		}
		
		
		
		
		
	}


