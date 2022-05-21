package a07_반복;

public class alpabet {

	public static void main(String[] args) {
		// 알파벳 대문자 소문자 전부 출력하기
		char ch='A';
		for(int i=ch;i<'Z'+1;i++) {
			System.out.print((char)i+" ");
		}
		System.out.println();
		char ch1='a';
		for(int i=ch1;i<'z'+1;i++) {
			System.out.print((char)i+" ");
		}
		System.out.println();
		
		ch='a';
		while(true) {
			if(ch>='z'+1) {
				break;
			}else if (ch>='a'||ch<='z') {
				System.out.print(ch+" ");
			}
			ch++;
		}
		
		
	}  // end of main

}
