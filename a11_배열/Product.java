package a11_배열;

public class Product {
	private String ProductName;
	private String ProductCompany;
	
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCompany() {
		return ProductCompany;
	}
	public void setProductCompany(String productCompany) {
		ProductCompany = productCompany;
	}
	
	public void ProductInfo() {
		System.out.println("제품명: "+ProductName);
		System.out.println("제조사: "+ProductCompany);
	}
	
	
}
