package exam01;

abstract class ClassA{
//	추상 메소드가 1개라도 있는 클래스는 바드시 추상 클래스로 만들어야한다.
	
	abstract void method1();
//	추상 클래스안에서 일반 메소드 작성 가능 
	void method2() {
		System.out.println("메소드2 실행!");
		
	}
}

class ClassB extends ClassA{
//	추상 클래스를 상속받은 클래스는 반드시 추상 메소드를 오버라이딩 해야한다 
	
	@Override
	void method1() {
		System.out.println("오버라이팅 method()!!");
		
	}
}


public class AbstractTask01 {
	
	public static void main(String[] args) {
//		추상클래스는 객체화 할 수 없다 
//		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassA a = new ClassB(); //업캐스팅
		
		a.method1();
		a.method2();
		b.method1();
		b.method2();
		
		
	}

}
