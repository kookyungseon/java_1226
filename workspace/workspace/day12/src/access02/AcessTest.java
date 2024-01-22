package access02;

import access01.A;

class Child extends A{
//	A a = new A();
//	a.var3();
	
	void test() {
		var3 = 3; // protect는 자식 클래스의 메소드를 통해 접근 가능 
		super.var3 =10;
	}
	
}




public class AcessTest {

}
