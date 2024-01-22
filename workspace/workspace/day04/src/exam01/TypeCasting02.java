package exam01;

public class TypeCasting02 {
	public static void main(String[] args) {
		
//		자동형변환
		double number = 1 + 0.1; //정수 + 실수 = 실수 
		int number2 = 'a';
		char number3 = 'A' + 1;
		char number4 = 65;
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println(number3); // char자료형 + 정수 -> 문자 
		System.out.println(number4); // char자료형이 정수값을 가지면 문자형으로 자동 형변환
		
	}

}
