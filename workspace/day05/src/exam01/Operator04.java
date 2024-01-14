package exam01;

public class Operator04 {
	public static void main(String[] args) {
		
//		논리 연산자 : &&, ||, ^
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println(); // 줄바꿈
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println();
		
		System.out.println(true ^ false);
		System.out.println(true ^ true);
		
		int num = 10;
		System.out.println(!(num ==10));
		System.out.println(10>3 && 5>2);
	}

}
