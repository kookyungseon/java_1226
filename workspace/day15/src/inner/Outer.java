package inner;

public class Outer {
//	필드
	int var1;
	String name;
	
//	메소드
	void method() {
		
	}
	
//	 내부 클래스
	class Inner {
//		필드, 생성자, 메소드 
		int var2;

		public Inner(int var2) {
	super();
	this.var2 = var2;
	}

	void innerMethod() {
//	내부 클래스에서 외부 클래스의 멤버 사용 가능
		method(); //내부 클래스는 상속받지 않아도 외부클래스의 멤버 사용가능
		var1 =10;
	}
		
	}

}
