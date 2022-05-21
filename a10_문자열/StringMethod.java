package a10_문자열;

public class StringMethod {

	public static void main(String[] args) {
		String email ="cgw2908515@gmail.com";
		int tokenIndex = email.lastIndexOf("@");
		System.out.println(tokenIndex);
		String username =email.substring(0,tokenIndex);// 0~7번이 되기 전(0~6)까지 자르자
		String providerAddress =email.substring(tokenIndex+1);// 8부터 끝까지
		
		System.out.println("이메일: "+email);
		System.out.println("아이디: "+username);
		System.out.println("웹주소: "+providerAddress);
		
	}

}
