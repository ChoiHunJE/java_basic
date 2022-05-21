package a13_추상;

/*
 * 추상
 * 추상클래스 : 메소드가 하나라도 추상메소드로 정의되어 있으면 무조건 추상 클래스이다.
 * 추상메소드 : 반환자료형, 매개현수, 메소드명만 정의하는 것.
 */


public class AbstactEx {
	public static void main(String[] args) {
//		Person person = new Person(); 추상클래스는 생성할 수 없다.
		Person[] persons = new Person[2];
		
		persons[0] = new Teacher();
		persons[1] = new HighSchoolStudent();
		
		for(Person person : persons) {
			person.eatSomething();
			person.work();	
			
			if(person instanceof Student) {
				((Student)person).canNotSmoking();
			}	
		}
	}
}
