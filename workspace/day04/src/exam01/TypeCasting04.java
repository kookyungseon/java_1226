package exam01;

public class TypeCasting04 {
	public static void main(String[] args) {
//		문자열 형변환
		int num1 = 10, num2 = 20;
		String number1 = "10", number2 = "20";
		
		System.out.println(num1 + num2); // 숫자 + 숫자 -> 연산
		System.out.println(number1 + number2); //문자열 + 문자열 -> 연결 
		
		System.out.println(num1 + number2); //숫자 + 문자 => 문자열 연결 
		
		System.out.println("제 나이는 " + num1 + "살 입니다 ");
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다");
		
//		숫자를 문자열로 변환
		String number3 = num1 +"";
		System.out.println(number3);
		
	}

}
