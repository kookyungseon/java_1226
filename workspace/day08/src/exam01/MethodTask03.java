package exam01;

import java.util.Scanner;

public class MethodTask03 {
	
//	1)
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
//	2)
	void sub(int num1, int num2) {
		System.out.println(num1-num2);
	}
	
//	3)
	int multiply() {
		int num1 =10;
		int num2 = 20;
		
		return num1 * num2;
	}
	
//	4)
	void div() {
		int num1 = 20;
		int num2 = 10;
		System.out.println(num1/num2);
	}
	public static void main(String[] args) {
	
//		<실습1>
//		계산기
//		1) 더하기 기능 (매개변수 있고, 리턴값도 있음) add
//		2) 빼기 기능 (매개변수 있고, 리턴값 없음) sub
//		3) 곱하기 기능(매개변수 없고, 리턴값 있음 )multiply
//		4) 나누기 기능 (매개변수 리턴값 둘다 없음 ) div
		
//		4개 메소드 호출 매개변수 2개씩 
		MethodTask03 task = new MethodTask03();
		
		int result = task.add(100, 200);
		System.out.println(result);
		task.sub(20, 10);
		System.out.println(task.multiply());
		task.div();
	}

}
