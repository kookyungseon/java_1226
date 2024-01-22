package exam02;

import java.util.Scanner;

public class IfTask01 {
	public static void main(String[] args) {
		
//		나이를 입력받아서 나이가 20이상이다 -> "성인입니다" 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요 : ");
		int myAge = sc.nextInt();
		
		if(myAge >=20) { //myAge의 값이 20이상인 경우
			//if문의 조건식이 true일 경우 실행
			System.out.println("성인입니다.");
			
		}else if(myAge >= 17) {
			System.out.println("고등학생입니다");
		}else if(myAge >= 14) {
			System.out.println("중학생입니다");
		}
		else {
			System.out.println("어린이입니다");
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
