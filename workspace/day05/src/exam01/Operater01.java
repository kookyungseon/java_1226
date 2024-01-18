package exam01;

public class Operater01 {
	public static void main(String[] args) {
		
//		단항 연산자
//		+(양수), -(음수)
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(-num1);
		System.out.println(+num2);
		
//		증감연산자
//		++, --
		num1++; //num1 = num1 +1
		System.out.println("++연산 결과 : " +num1);
		
		num2--; //num2 = num2 -1
		System.out.println("--연산 결과 :" + num2);
		
//		전위형
		int num3 = 1;
		System.out.println("전위형 : " + --num3);
		
//		후위형 
		int num4 =1;
		System.out.println("후위형 : " + num4--);
		System.out.println("후위형 다음 라인 : " + num4);
		
		int x =1;
		int result = x-- + 5 + --x;
		
		System.out.println("연산결과 : " + result);
//		1)x-- +5 : 후위형이므로 x+5 먼저 연산 된 다음 --
//		2) --x  전위형이므로 바로 연산 -> x = x-1
//		3) x-- + 5의 연산 결과 5, --x의 연산결과 0 -> 5+0 =5
		
//		!(NOT)연산자
		System.out.println(!true);
		System.out.println(!false);
	}
}
