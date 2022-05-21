package a11_배열;

public class User {      //Model data적인 부분은 여기!!!!!!!!
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void showInfo() {
		System.out.println("아이디: "+username);
		System.out.println("비밀번호: "+password);
	}
	
	

}
