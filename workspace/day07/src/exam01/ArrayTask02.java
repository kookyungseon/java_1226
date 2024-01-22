package exam01;

import java.util.Scanner;

public class ArrayTask02 {
	
	public static void main(String[] args) {
		
//		<실습>
//		String 3칸 배열 
//		"짱구", "맹구", "철수"를 입력받아서
//		배열에다가 차례대로 저장
//		배열 출력
		
//		Scanner import
		Scanner sc = new Scanner(System.in);
		
//		String 자료형의 3칸 배열 생성
		String[] arrName = new String[3];
		
//		3개의 이름 입력(반복문 사용)
		for (int i=0; i<arrName.length; i++) {
			System.out.print("이름 입력 : ");
			arrName[i] = sc.nextLine();
		}
		
//		arrName의 요소 모두 확인(for문)
		for (int i=0; i<arrName.length; i++) {
			System.out.println(arrName[i]);
		}
		
		
	
		
	}

}
