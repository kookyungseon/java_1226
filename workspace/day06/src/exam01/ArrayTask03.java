package exam01;

import java.util.Scanner;

public class ArrayTask03 {
	
	public static void main(String[] args) {
		
//		<실습2>
//		int 형 배열(arrNum) 3개
//		3개의 숫자를 입력받아 배열의 저장공간에 저장
//		배열안에 있는 숫자의 합을 출력
		
//		import 단축키 : ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		int[]arrNum = new int[3]; //3개의 정수가 들어오는 배열
		
//		3개의 숫자의 합을 저장할 변수 선언
		int total = 0;
		
		for(int i=0; i<arrNum.length; i++) {
			System.out.print((i+1)+"번째 숫자 입력 : ");
			arrNum[i] = sc.nextInt();
			total += arrNum[i];
		}
		
		System.out.println("3개 숫자의 합 : "+total);
		
		

		
		
	}

}
