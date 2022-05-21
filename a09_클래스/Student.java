package a09_클래스;

public class Student {//틀
		 String name;//이름   -->  이름 학년 학번 변수
		 int studentYear;//학년
		 int studentCode;//학번  
		 
		 public Student() {//생성자     
			 
		 }
		
		public void showStudentInfo() { //메소드
			System.out.println("학생 이름은 "+ name);
			System.out.println("학년: "+ studentYear);
			System.out.println("학번: "+ studentCode);
		}

}
