package a12_상속;

public class Eagle extends Animal {
	public Eagle() {
		super();
		System.out.println("동물 객체 생성");
	}
	@Override
	public void move() {
		System.out.println("날개를 펼쳐서 날아갑니다.");
	}
	public Eagle(String name) {
		super(name);
		System.out.println("동물 객체 오버로딩 생성");
	}
	
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 높이 날아오릅니다.");
	}
}
