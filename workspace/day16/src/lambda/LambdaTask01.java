package lambda;

public class LambdaTask01 {
	public static void main(String[] args) {
		
//		함수형 인터페이스 객체 선언시 람다식을 이용해서 함수 구현(매개변수 1개)
//		AddTen t = new AddTen(); 인터페이스 객체화 x
//		람다식 문법 : (매개변수,...) -> {기능구현;};
//		AddTen t =(num1) -> {return num1 + 10;};
		AddTen t =num1 -> {return num1 + 10;}; //함수형 인터페이스의 매개변수가 1개인 경우 ()생략 가능
		
		
//		매개변수 2개
		AddNum a = ( num1, num2) -> {return num1 + num2;};
//		AddNum a =  num1, num2 -> {return num1 + num2;}; 매개변수 2개일 경우 소괄호 생략 불가  
		
//		리턴 없고 매개변수 1
//		Print p = name -> {System.out.println(name);}; 
		Print p = name -> System.out.println(name); //리턴 타입이 없고 명령어가 1줄인 경우 중괄호 생략 가능 
		
		int num1 = 10;
		int num2 = 20;
		String name ="아무무";
		
		int result1 = t.addTen(num1); //람다식은 값처럼 사용 가능!
		int result2 = a.add(num1, num2);
		
	
		System.out.println(result1);
		System.out.println(result2);
		p.printName(name);
		
		
	}

}
