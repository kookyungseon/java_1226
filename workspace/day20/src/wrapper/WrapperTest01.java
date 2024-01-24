package wrapper;



public class WrapperTest01 {
	public static void main(String[] args) {
		
//		boxing : 기본 타입의 값을 wrapper 클래스의 객체로 변환
		Integer num1 = new Integer(3);//권장사항은 아님,  정수형 3이라는 숫자를 Integer 객체 num1에 넣어줌
		Integer num2 = Integer.valueOf(3);
		Double num3 = new Double(1.5);
		Double num4 = Double.valueOf(1.5);
		System.out.println(num1);
		System.out.println(num4);
		
//		unboxing
		int num5 = num1; //Integer 타입을 가지고 있는 num1을 정수형으로 변환
		double num6 = num4;
		int num8 = num1.intValue();
		double num9 = num4.doubleValue();
		
//		auto boxing, auto unboxing
		Integer numInt1 = 5;  //auto boxing
		System.out.println(numInt1);
		
		int num7 = numInt1; //auto unboxing
		
		
		
		
		
		
		
	}

}
