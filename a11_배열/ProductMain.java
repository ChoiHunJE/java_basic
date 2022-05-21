package a11_배열;

import java.util.Scanner;

public class ProductMain {
	private Scanner scanner;
	
	public ProductMain(Scanner scanner) {
		this.scanner=scanner;
	}
	
	public void showMainDisplay() {
		System.out.println("[상품 관리 프로그램]");
		System.out.printf("1.상품 입력%n2.상품 조회%n3.프로그램 종료%n");
		System.out.println("=================");
	}	
	
	public int inputSelect() {
		int select;
		System.out.println("명령어를 선택하세요.(3번 입력시 종료)");
		select= scanner.nextInt();
		scanner.nextLine();
		return select;
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		ProductMain productMain=new ProductMain(scanner);
		ProductService productService=new ProductService(scanner);
		
		
		productService.productSetting();
		
		do{
			productMain.showMainDisplay();
		}while(productService.mainLoop(productMain.inputSelect())); 
		
		System.out.println("프로그램이 종료되었습니다.");
		
		
	}// end of main
}			
		
		
	

		
		
		

	
