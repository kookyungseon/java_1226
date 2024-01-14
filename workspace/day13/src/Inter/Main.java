package Inter;

public class Main {
	public static void main(String[] args) {
		
		Inter inter = new ClassA(); // 업캐스팅
		ClassA a = new ClassA();
//		메소드 접근
		inter.method1();
		inter.method2();
		
		a.method1();
		a.method2();
//		필드 접근
		System.out.println(Inter.VAR1);
//		Inter.VAR1 = 20; 상수는 수정 불가능
		System.out.println(ClassA.VAR2);
		
		
	}
	

}
