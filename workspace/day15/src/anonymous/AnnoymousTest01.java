package anonymous;

//미구현된 클래스 생성
class Animal{
	public void cry() {};
	
}

public class AnnoymousTest01 {
	
//	방법 1) 필드에 익명자식 객체를 생성
	Animal dog = new Animal(){
//		미구현된 클래스 구현 
		String name = "멍멍이";

		@Override
		public void cry() {
			System.out.println("강아지 " +name+"은/는 멍멍!");
		}
		
	};
	
//	방벙 2) 지역변수의 초기값으로 대입
	void method1() {
		Animal cat = new Animal (){
//		미구현 클래스 구현
			String name ="달이";

			@Override
			public void cry() {
				System.out.println("고양이 " + name + "은/는 야옹!");
			}
			
		};
		cat.cry(); //지역변수 이기 때문에 바로 사용해야함 
	}
//	방법 3) 익명객체 매개변수로 대입 
	void method2(Animal animal) {
		animal.cry();
	}
	
	
	public static void main(String[] args) {
		AnnoymousTest01 a = new AnnoymousTest01();
//		방벙 1) 필드에 익명 자식 객체를 생성 
		a.dog.cry();
//		방법 2) 지역 변수의 초기값 대입 방법
		a.method1();
//		방법 3) 인경객체 매개변수로 대입
		a.method2(new Animal() {
			String name ="무우";

			@Override
			public void cry() {
				System.out.println("소 "+name+"은/는 음머!");
			}
			
		});
		
	}

}
