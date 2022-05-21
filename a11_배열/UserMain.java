package a11_배열;

import java.util.Scanner;

public class UserMain {
	private Scanner scanner;   // 3번째
	
	public UserMain(Scanner scanner) {  // 4번째
		this.scanner = scanner;
	}
	
	public void showMainDisplay() {    // 1번째 -->제일 메인으로 표시되는 창
		System.out.println("[회원정보 관리 프로그램]");
		System.out.println("1. 회원정보 입력");
		System.out.println("2. 회원정보 조회");
		System.out.println("3. 프로그램 종료");
		System.out.println("======================");
	}
	
	public int inputSelect() {  // 6번째
		int select =0;
		System.out.println("명령을 선택해 주세요: ");
		select =scanner.nextInt();
		scanner.nextLine();
		return select;
	}

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		UserMain userMain =new UserMain(scanner);   // 2번째(scanner 제외)  5번째 New Scanner(System.in)넣기
		UserService userService=new UserService(scanner);  //  9번째
		
		userService.userSizesetting();
		
		do {
			System.out.println();	
			userMain.showMainDisplay();  //3번째
		}while(userService.mainLoop(userMain.inputSelect()));   // inputSelect 7번째  mainLoop 10번째
			
		
		System.out.println("프로그램 종료");
		
		
		
		
	} // main
	
}	
		


