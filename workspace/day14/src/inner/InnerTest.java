package inner;

public class InnerTest {
	
//	 필드 
	int var1;
	String name;
	
//	메소드
	void method() {
//		외부 클래스 메소드 안에서 내부 클래스 선언 가능
//		로컬 내부 클래스
		class Test{
			
		}
		
	}

//	내부 클래스 (인스턴스 내부 클래스)
	
	class Inner{

//		필드, 생성자, 메소드
		public Inner() {
			super();
		}
//		메소드
		void innerMethod() {
//			외부클래스의 멤버 사용가능
			method();
			var1 =1;
		}
	}
	

}
