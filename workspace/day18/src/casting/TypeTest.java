package casting;


class A{
	
}

class B extends A{
	
}

public class TypeTest {
	public static void main(String[] args) {
		A a = new A();// a는 클래스 A의 타입을 가진다
		int num = 10;// num은 int 타입을 가진다 
		
		B b = new B();
//		instanceof : true , false
		System.out.println(a instanceof A);
		System.out.println(b instanceof B);
	}
}
