package exam02;

import java.util.Scanner;

public class InputTask04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오늘 날짜 입력 :");
		double date = sc.nextDouble();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.println("오늘 날짜는 " + date);
		System.out.println("당신의 나이는 " + age + "살 입니다");
		
	}

}
