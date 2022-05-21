package a13_추상;

public class Teacher extends Person {
	@Override
	public void work() {
		System.out.println("수업을 합니다.");	
	}

	@Override
	public void eatSomething() {
		System.out.println("교사 식당에서 밥을 먹습니다.");
	}
}
