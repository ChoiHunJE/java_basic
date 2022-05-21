package a12_상속;

/*
 * 상속(Extends)
 * 상속을 받은 클래스(객체)는 부모의 모든 변수(속성),메소드(기능)을 사용할 수 있다.
 * 부모클래스는 자식클래스의 공통분모를 가지고 있어야 한다.
 * 
 */



public class ExtendsEx {
	public static void main(String[] args) {
		Animal human = new Human("사람");  // 조상 타입 참조 변수로 자손 타입 객체를 다루는 것 -->다형성
		Animal tiger = new Tiger("호랑이");
		Animal eagle = new Eagle("독수리");
		
		
		
		
		//자식 생성자 오버로딩을 하여 부모한테 넘겨준다.
		//오버라이딩을 통해 재정의를 할 수 있다.
		human.move();
		((Human)human).readBooks();
		
		tiger.move();
		((Tiger)tiger).hunting();
		
		eagle.move();
		((Eagle)eagle).flying();
		
		Animal[] animals = new Animal[3];
		animals[0] = human;
		animals[1] = tiger;
		animals[2] = eagle;
		
		System.out.println("=========================");
		
		for(Animal animal : animals) {
			animal.move();
			if(animal instanceof Human) {
				Human h = (Human)animal;
				h.readBooks();
			}
			else if(animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				t.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				e.flying();
			}
			else {
				System.out.println("지원하지 않는 종류의 동물입니다.");
			}
		}
		
		
	}
}
