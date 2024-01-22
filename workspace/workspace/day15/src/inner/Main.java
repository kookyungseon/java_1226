package inner;

public class Main {
	public static void main(String[] args) {
//		OuterClass의 인스턴스(객체) 생성
		OuterClass o = new OuterClass();
		System.out.println(o);
		
//		OuterClass의 인스턴스를 생성하고 그 인스턴스를 이용해서 
//		InstanceInner 클래스의 인슽턴스를 생성 
		OuterClass.InstanceInner ii = o.new InstanceInner();
		
//		OuterClass의 생성자를 먼저 호출하고 그 다음에 인스턴스 클래스의 생성자 호출 
		OuterClass.InstanceInner ii2 = new OuterClass().new InstanceInner();
		
//		내부 스태틱 클래스의 인스턴스 생성 
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		
		
	}

}
