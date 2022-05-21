package a09_클래스;

public class User { //틀이다.
	String username;   //변수
	String password;
	String name;
	String email;
	
	public User(String username, String password, String name, String email) {
		this.username = username;  //생성자 -->주소값을 리턴함
		this.password = password;
		this.name =  name;
		this.email = email;
		
	}
	
	void showProfile() {  //메소드
		System.out.println("아이디: " + username);
		System.out.println("비밀번호: " + password);
		System.out.println("이름: " +name);
		System.out.println("이메일: " + email);
	}
}
