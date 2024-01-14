package exam02;

class A{
	
}

class B extends A{
	
}
public class CastingTask01 {
	public static void main(String[] args) {
		
		
		A a = new A();
		B b = new B();
		
		System.out.println(a instanceof A);//a class A의 객체니?
		System.out.println(b instanceof B);
		System.out.println(b instanceof A); //B크래스는 A클래스의 자식 클래스 : 자식 클래스의 객체도 부모 클래스의 객체
		System.out.println(a instanceof B); //부모 클래스의 객체는 자식 클래스의 객체가 아님
	}
}
