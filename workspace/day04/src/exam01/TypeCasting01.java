package exam01;

public class TypeCasting01 {
	public static void main(String[] args) {
		
//		형변환 
//		정수 -> 정수
		int num1 = (int)3L; //강제 형변환 long(8byte) -> int(4byte)
		long num2 = 3; // 자동 형변환 int(4byte) -> long(8byte)
		
//		실수 -> 실수
		float num3 = (float)3.0; //강제 형변환 double(8byte) -> float(4byte)
		double num4 = 3.14F; // 자동 형변환 float(4byte) -> double(8byte)
		
//		정수 -> 실수 (자동형변환)
		float num5 = 123456L;
		double num6 = 3;
		
		System.out.println(num5);
		System.out.println(num6);
		
		
//		실수 -> 정수 (강제형변환)
		int num7 = (int)3.0;
		long num8 = (long)3.14F;
		
//		오버플로우 : 해당 자료형이 표현할 수 있는 최대 범위보다 큰 수를 저장할 때 발생하는 현상 
		byte num9 = (byte)129;
		System.out.println(num9);
//		언더플로우 : 해당 자료형이 표현할 수 있는 최소 범위보다 작은 수를 저장할 때 발생하는 현상 
		System.out.println((byte)-129);
		
	}

}
