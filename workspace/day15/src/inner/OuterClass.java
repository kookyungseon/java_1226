package inner;

public class OuterClass {
//필드
	int instanceVar;
	static int staticVar; //스태틱 변수
	
	class InstanceInner{ //OuterClass 내부에서 정의한 인스턴스 내부 클래스
		
		
	}
	
	static class StaticInner{ //OuterCalss 내부에서 정의한 스태틱 내부 클래스
		
		
	}
//	인스턴스 메소드
	void instanceMethod() {
//		인스턴스 메소드 내부에서 인스턴스, 스태틱 멤버 모두 사용 가능 
//		
		int localVar; // 지역변수 
		
//		로컬 내부 클래스
		class LocalInner{ //메소드 내부에서 정의한 로컬 내부 클래스 
			
			
		}
		
//		OuterClass의 멤버 인스턴스 메소드 내부에서 사용 가능
		LocalInner li = new LocalInner(); //로컬 내부 클래스의 객체를 참조하는 로컬 변수 
		InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
		
	}
	
//	 스태틱 메소드
	static void staticMethod() {
//		스태틱 메소드 내부에서는 인스턴스 멤버 가져오지 못함!!
		
		int localVar; // 지역변수 
//		instaceVar =20; static 메소드 안에서 인스턴스 변수 사용 불가 
		staticVar =20; //OuterClass의 스태틱 변수 사용 가능
		
		class LocalInner{
			
		}
		
		LocalInner li = new LocalInner();
//		InstanceInner ii = new InstanceInner(); static 메소드는 클래스의 인스턴스 멤버는 사용할 수 없음 
		StaticInner si = new StaticInner(); //static 메소드에서 static 붙은 멤버들은 사용 가능 
		
	}
	
	
	
	
	
	
	
	
	
	
}
