package a13_추상;

public class HighSchoolStudent extends Student {
	@Override
	public void canNotSmoking() {
		System.out.println("고등학생은 흡연 불가");
	}
}
