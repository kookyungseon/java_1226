package objectTest01;

public class ToStringTest01 {
//	생성자 
	public ToStringTest01() {
		
	}
	
	
	public static void main(String[] args) {
		ToStringTest01 tt = new ToStringTest01();
		
		int[] arr1 = new int[5];
		
		System.out.println(tt);
		System.out.println(tt.toString());
		System.out.println(arr1);
//		toString()은 참조값을 문자열 형태로 반환 
//		(클래스경로와이름@16진수로 변환된(해쉬코드))
	}

}
