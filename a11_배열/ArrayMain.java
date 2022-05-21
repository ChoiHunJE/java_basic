package a11_배열;

public class ArrayMain {

	public static void main(String[] args) {
		User[] users =new User[5];  //5개의 공간을 만듬
		
		users[0]=new User();  // 각각의 주소값이 연결
		users[1]=new User();
		users[2]=new User();
		users[3]=new User();
		users[4]=new User();
		
		for(User user : users) {
			user.setUsername("김준일");
			System.out.println(user.getUsername());
		}
		
		
		
		
		
		
		
	}

}
