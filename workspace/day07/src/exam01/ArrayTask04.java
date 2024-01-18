package exam01;

public class ArrayTask04 {
	public static void main(String[] args) {
		
//		2차원 배열
//		행과 열의 개수를 알때
		int [][] arr1 = new int[3][3]; //3행 3열의 배열 생성
		
//		2차원 배열에 어떤 값이 들어올 지 알때
		int[][]arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
//		2중 반복문
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println(); //줄바꿈
		}
		
		
//		int[][]arr3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
//		<실습>
//		각 행의 숫자의 합을 출력(3개)
//		2차원 배열 내의 숫자 총합 출력
//	    각행의 합을 담을 변수, 총합을 담을 변수
		
		int[][]arr3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
//		총합을 저장할 변수 선언
		int total = 0;
		
		for(int i=0; i<arr3.length; i++) {
//			행의 숫자 합을 담을 변수 선언
			int rowTotal = 0;
			
			for(int j=0; j<arr3[i].length; j++) {
				rowTotal += arr3[i][j];
			}
			System.out.println((i+1)+"번째 행의 합 : "+ rowTotal);
//			총합 = 총합 + 행의합
			total += rowTotal;
		}
		
		System.out.println("arr3의 배열 요소 총합 : "+total);
		
		
		
		
		
		
	}

}
