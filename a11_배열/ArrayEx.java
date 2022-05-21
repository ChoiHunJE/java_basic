package a11_배열;
/**
 * 배열(Array)
 * 같은 자료형을 하나로 묶어서 관리하는 자료형 객체
 * index, index 연산기호 -> [index]
 */

public class ArrayEx {

	public static void main(String[] args) {
		
		String[] name =new String[5]; //공간을 다섯 개 만드는 작업
		
		name[0] ="홍길동";  //0번index에 홍길동
		name[1] ="홍길일";
		name[2] ="홍길이";
		name[3] ="홍길삼";
		name[4] ="홍길사";
		
		System.out.println(name.length);
		
		for(int i =0;i < name.length;i++) {
			System.out.println(name[i]);
		}
		
		System.out.println();
	
		String[] name2 = {"김준일","홍길동","홍길이","홍길삼","홍길사"};
		for(int i=0;i<name2.length;i++) {
			System.out.println(name2[i]);
		}
		
		
	}

}
