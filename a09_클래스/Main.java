package a09_클래스;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("junil", "1234", "김준일", "junil@gmail.com"); //클래스명,변수명/주소 값만 저장
		user1.showProfile();
		
		System.out.println();
		
		User user2 = new User("abcd", "1111", "최훈제", "hunje@naver.com"); //변수를 선언해서 괄호안의 값을 담고있다.
		user2.showProfile();
		
		System.out.println();
		
		//
		Student s1=new Student();
		s1.name="홍길동";
		s1.studentYear=3;
		s1.studentCode=1548455-5484;
		s1.showStudentInfo();
		
		System.out.println();
		
		//
		Product p1 =new Product("p20220125_1","텀블러","스타벅스");
		p1.productInfo();
		
		Product p3=null;
		//null:주소가 0번지임을 가르킨다.
	}

}
