package a12_상속;

public class Animal {
	private String name;
	
	public Animal() {
		System.out.println("동물 객체 생성");
	}
	public Animal(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move() {
		System.out.println(name+" 동물이 움직입니다.");
	}
}
