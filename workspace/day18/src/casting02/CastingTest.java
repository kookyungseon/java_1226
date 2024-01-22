package casting02;

public class CastingTest {
	public static void main(String[] args) {
//		up casting
		SmartTv smartTv = new SmartTv();
//		자료형   변수명(참조변수) 	= 값(생성자)
		
		Tv tv = new Tv();
		
//		1. up casting
//		(자료형) 변수명
		Tv tv1 = (Tv)smartTv;
		
		smartTv.netflix();
		tv.chUp();
		tv1.chDown(); // up casting - > 부모클래스의 멤버 호출가능
//		tv1.netflix(); up casting -> 자식클래스의 멤버는 호출 불가능
		
//		2. up casting
		Tv tv2 = (Tv)new SmartTv();
		tv2.powerOnOFF();
//		tv2.netflix(); 
		
//		3.up casting
		Tv tv3 = new SmartTv();
		tv3.chUp();
//		tv3.netflix();
		
//		Down Casting
//		업캐스팅된 객체가 있어야된다 
//		타입명 참조변수명 = (타입명)이미 업캐스팅 된 참조변수
		
		SmartTv st1 =(SmartTv)tv3;
		st1.netflix();
		
//		잘못된 Down Casting
//		업캐스팅된 객체가 없을 때, 부모클랫 객체를 자식클래스의 객체로 만들 때 오류 발생 
		
		
		
		
	}

}
