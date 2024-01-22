package exception01;

import java.util.Scanner;

public class ExceptionTest01 {
	
	public static void main(String[] args) {
		
		Scanner sc = null;
//		NullPointerException: 예외 발생!
		try {
			sc.next();
		}catch(NullPointerException e) {
			System.out.println("null이에요!");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("예상치 못한 오류!");
		}
		System.out.println("실행 시키고 싶은 명령어");
		
		
	}
	

}
