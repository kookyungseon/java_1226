package exception02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력하시오 >>");
		int number = sc.nextInt();
		
		if(number <0 ) {
			try {
				throw new MyException();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}

}
