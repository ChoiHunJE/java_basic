package a09_클래스;

public class Product {
	/*
	 * 변수
	 * 상품코드 productCode
	 * 상품명  productName
	 * 제조사  company
	 */
	
	String productCode;
	String productName;
	String company;
	
	public Product(String productCode, String productName, String company) {
		this.productCode = productCode;
		this.productName=productName;
		this.company=company;
	}
	
	public void productInfo() {
		System.out.println("상품코드: "+productCode);
		System.out.println("상품명: "+productName);
		System.out.println("제조사: "+company);
	}
	
	
	
	
	
	
	
}
