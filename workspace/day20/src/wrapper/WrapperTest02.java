package wrapper;

import java.util.Arrays;

public class WrapperTest02 {
	
	public static void main(String[] args) {
//		1, 3.14, 'A', "Dog", true
//		위의 값들을 하나의 배열에 담기
		
//		int[] arr1 = new int[5];//배열에는 한가지 자료형의 값들만 받음
		
		Object[] obj = {1,3.14,'A',"dog", true}; //auto-boxing
		
		System.out.println(Arrays.toString(obj));
		System.out.println(obj[1]);
	}

}
