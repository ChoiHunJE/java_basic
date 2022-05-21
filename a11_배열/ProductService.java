package a11_배열;

import java.util.Scanner;

public class ProductService {
	Scanner scanner;
	Product[] products;
	
	public ProductService(Scanner scanner) {
		this.scanner =scanner;
	}
	
	public boolean mainLoop(int select) {
		boolean flag=true;
		 
		if(select==1) {
			insertProduct();
		}else if(select==2) {
			showProduct();
		}else if(select==3) {
			System.out.println("프로그램 종료중...");
			flag=false;
		}
		return flag;
	}
	
	public void productSetting() {
		System.out.println("관리할 물품 수량을 입력하세요.");
		products= new Product[scanner.nextInt()];
	}
	
	public Product addProduct() {
		Product product=new Product();
		System.out.println("물품명: ");
		product.setProductName(scanner.nextLine());
		System.out.println("제조사: ");
		product.setProductCompany(scanner.nextLine());
		return product;
	}
	
	public void insertProduct() {
		System.out.println("물품 정보 입력");
		for(int i=0;i<products.length;i++) {
			System.out.println(i+1+"번째 물품 입력");
			products[i]=addProduct();
			System.out.println();
		}
		System.out.println("물품 입력을 완료 하였습니다.");
	}
	
	public void showProduct() {
		System.out.println("물품 정보 조회");
		System.out.println("번호"+"\t\t"+"물품명"+"\t\t"+"제조사");
		for(int i=0;i<products.length;i++) {
			System.out.println((i+1)+"\t\t"+products[i].getProductName()+"\t\t"+products[i].getProductCompany());
		}
	}
	
	
	
	
	
}
