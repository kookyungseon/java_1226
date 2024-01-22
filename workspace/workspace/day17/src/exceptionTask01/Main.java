package exceptionTask01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 >>>");
		
		int num = sc.nextInt();
	
	if(num <1 || num >10) {
		try {
			throw new MyExceptionTask();
		} catch (MyExceptionTask e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
	
			
		}
	}else {
		System.out.println("1~10사이의 숫자입니다");
	}
}
	
	
}