package a08_메소드;

	/*
	 * 1.메서드 이름이 같아야 한다.
	 * 2. 매개변수의 개수 OR 타입이 달라야한다.
	 * 3. 반환 타입은 관계 없다.
	 */


public class Overloading {
	
	static int add(int a,int b) {
		return a+b;
	}
	
	static double add(int a,double b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10,5));
		System.out.println(add(10,3.3));
		System.out.println(add(10.5,3.3));
	}

}
