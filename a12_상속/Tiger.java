package a12_상속;

public class Tiger extends Animal {
	public Tiger() {
		super();
		System.out.println("동물 객체 생성");
	}
	
	@Override
	public void move() {
		System.out.println("네발로 숨죽이며 걷습니다.");
		}
	public Tiger(String name) {
		super(name);
		System.out.println("동물 객체 오버로딩 생성");
		}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
		}
	
	
}
