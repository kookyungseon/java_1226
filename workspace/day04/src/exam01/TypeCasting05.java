package exam01;

public class TypeCasting05 {
	public static void main(String[] args) {
		
//		참조자려형 String 형변환
		
//		기본자료형 -> String 
		String str1 = 3 + "";
		String str2 = 3.0 + "";
		
//		String -> 기본 자료형
//		Integer , Double, Boolean 클래스의 도움을 받아야 형변환 가능 
		
		int number1 = Integer.parseInt(str1);
		System.out.println(number1);
		double number2 = Double.parseDouble(str2);
		System.out.println(number2);
		
	}

}
