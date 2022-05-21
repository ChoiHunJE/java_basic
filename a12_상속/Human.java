package a12_상속;

/*
 * @ --> 어노테이션
 * this --> 자기자신의 주소를 의미
 * super --> 부모의 주소를 의미
 */

public class Human extends Animal{
	
	public Human() {
		super();  // 모든 기본 생성자 안에는 슈퍼라는 객체가 숨어있다.
		System.out.println("사람 객체 생성");
	}
	public Human(String name) {
		super();
		super.setName(name);  // 부모(super)주소  .(참조)에 setname(값) 전달
		System.out.println("사람 객체 오버로딩 생성");
	}
	
	@Override   // 재정의
	public void move() {
		System.out.println(getName()+"이 두발로 걷습니다.");
	}  
	// @는 오버테이션 상속, 구현을 통해서 재정의가 이루어진 표기,
   // 삭제하여도 실행은 되지만 자식요소인지 부모요소인지 확인이 힘들다.
	
	public void readBooks() {
	System.out.println("사람이 책을 읽습니다.");
}


}
