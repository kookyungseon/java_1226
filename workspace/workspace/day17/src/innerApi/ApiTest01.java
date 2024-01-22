package innerApi;

import java.util.Random;

public class ApiTest01 {
	public static void main(String[] args) {
//		내부 Api
//		Random api : 난수에 관련된 기능을 모아놓은 api
		Random r = new Random();
		
//		n미만의 랜던 정수를 반환
		int num2 = r.nextInt(100);
		System.out.println(num2);
		
//		0이상 1 미만의 랜덤 실수 반환
		double num3 = r.nextDouble();
		System.out.println(num3);
		
//	 	범위를 지정하여 랜덤 정수 반환
//		5 ~15
		int num4 = r.nextInt(15 - 5 +1) +5;
		System.out.println(num4);
		
		
	}

}
