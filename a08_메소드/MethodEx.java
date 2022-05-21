package a08_메소드;

public class MethodEx {
	
	static int  main2() {
		System.out.println("메소드 호출? ");
		return 1000;  //리턴 값을 1000
	}

	public static void main(String[] args) {
	int num =main2();   //호출
	System.out.println("num: "+num);
	System.out.println("함수 바로 호출: " + main2());
	}

}
