package a11_배열;

/**
 * 
 * 자동차 관리 프로그램
 * Car
 * 변수
 * carNumber  -->차량 번호(43다 1317)
 * carModel   -->K5
 * carCompany  -->KIA
 * 
 * CarService
 * 
 */

public class Car {  // 단순정보를 담는 클래스 Car!!!!!!!
	// 변수
	// 생성자   순서대로 생성!!
	// get,set
	private String carNumber;
	private String carModel;
	private String carCompany;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String carNumber, String carModel, String carCompany) {
		super();
		this.carNumber = carNumber;
		this.carModel = carModel;
		this.carCompany = carCompany;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}
	public void showCarInfo() {
		System.out.println("차량 번호"+carNumber);
		System.out.println("차량 모델"+carModel);
		System.out.println("제조사"+carCompany);
	}
	
	
	
	
	
	
}
