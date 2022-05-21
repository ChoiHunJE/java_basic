package a11_배열;

import java.util.Scanner;

public class CarService {
	private Car[] cars;
	private Scanner scanner;
	
	public CarService(Scanner scanner) {  //CarService가 생성될때 스캐너도 같이 생성!!!!
	this.scanner = scanner;	
	}
	
	public boolean mainLoop(int select) {  //매개변수는 select!!  Main에서 select가 있음!
		boolean flag =true;
		
		if(select ==1) {
			insertCar();
		}else if(select ==2) {
			showCars();
		}else if(select ==3) {
			 System.out.println("프로그램 종료중...");
			 flag = false;
		}else {
			System.out.println("잘못된 명령입니다.");
		}
		return flag;
	}
	
	public void carSizesetting() {
		System.out.print("프로그램에서 관리할 차량의 최대 몇대인지를 입력하세요.");
		cars =new Car[scanner.nextInt()];
	}
	public Car addcar() {
		Car car =new Car();
		System.out.println("차량번호: ");
		car.setCarNumber(scanner.nextLine());
		System.out.println("차량모델: ");
		car.setCarModel(scanner.nextLine());
		System.out.println("제조사: ");
		car.setCarCompany(scanner.nextLine());
		return car;
	}
	
	public void insertCar() {
		System.out.println("(차량 정보 입력)");
		for(int i=0;i<cars.length;i++) {
			System.out.println(i+1+"번체 차량 입력");
			cars[i]=addcar();
			System.out.println();
		}
		System.out.println("차량정보 입력이 완료되었습니다.");
	}
	
	public void showCars() {
		System.out.println("(차량 정보 조회)");
		System.out.println("순번\t차량번호\t\t차량모델\t\t제조사"); //tab
		for(int i=0;i<cars.length;i++) {
			System.out.println(i+1+"\t"+cars[i].getCarNumber()+"\t\t"+cars[i].getCarModel()+"\t\t\t"+cars[i].getCarCompany());
		}
	}

	
	


}
