package exam01;

public class ArrayTask01 {
	
	public static void main(String[] args) {
		
//		배열의 선언
//		1) 배열의 어떤 값을 넣을지 알 때 선언방법
//		자료형[] 배열명 = {값1, 값,...}
		int[] arr1 = {1, 2, 3, 4, 5};
		
//		2) 몇개의 값이 들어올지만 알때 선언 방법
		int[] arr2 = new int[5]; //5개의 정수형 데이터가 들어올 배열
		
//		3) 어떤 값을 넣을지도 모르고 몇칸을 만들지도 모를 때
		int[] arr3 = null;
		
		System.out.println(arr1);
		
//		배열의 인덱스 번호 -> 배열 요소 접근
		System.out.println("arr1의 첫번째 값 : " + arr1[0]);
		System.out.println("arr1의 두번째 값 : " + arr1[1]);
		System.out.println("arr1의 세번째 값 : " + arr1[2]);
		System.out.println("arr1의 네번째 값 : " + arr1[3]);
		System.out.println("arr1의 다섯번째 값 : " + arr1[4]);
//		System.out.println("arr1의 여섯번째 값 : " + arr1[5]); 오류발생 -> 인덱스 범위를 넘음
		
		System.out.println("arr1의 길이 : "+arr1.length);
		
		arr1[0] = 10; //인덱스 번호를 사용해서 배열의 요소 값 수정
		System.out.println(arr1[1] + 10); //값으로 사용
		
		int data = arr1[2];
		System.out.println(data);
		
		
//		반복문 사용 배열 요소 전체 확인
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1의 "+(i+1)+"번째 값 : " + arr1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
