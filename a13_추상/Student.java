package a13_추상;

public abstract class Student extends Person {

	public abstract void canNotSmoking();
	
	@Override
	public void work() {
		System.out.println("공부를 합니다.");
	}
	
	@Override
	public void eatSomething() {
		System.out.println("학생 식당에서 밥을 먹습니다.");
	}
}
