package a11_배열;

import java.util.Scanner;

public class CarMain {
	private Scanner scanner;
	
	public CarMain(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void showMainDisplay() {
		System.out.println("차량정보 관리 프로그램");
		System.out.println("1. 차량정보 입력");
		System.out.println("2. 차량정보 조회");
		System.out.println("3. 프로그램 종료");
		System.out.println("======================");
	}
	
	public int inputSelect() {
		int select =0;
		System.out.println("명령을 선택해 주세요: ");
		select =scanner.nextInt();
		scanner.nextLine();
		return select;
	}

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		CarMain carMain =new CarMain(scanner);
		CarService carService=new CarService(scanner);
		
		carService.carSizesetting();
		
		do {
			System.out.println();	
			carMain.showMainDisplay();
		}while(carService.mainLoop(carMain.inputSelect()));
			
		
		System.out.println("프로그램 종료");
	
	}
}
		
	
	

	
	
	

