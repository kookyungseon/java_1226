package arrayList;


class MyClass<T>{ //T라는 타입을 받는 매개변수를 가진 제네릭 클래스
	
// 필드
	T data;
// 생성자
public MyClass(T data) {
	super();
	this.data = data;
}
// 메소드
	void printData() {
		System.out.println(data);
	}
}

public class GenericTest {
	public static void main(String[] args) {
//		T라는 제네릭 타입을 String으로 구체화
		MyClass<String> mc = new MyClass<>("안녕");
		mc.printData();
		
		MyClass<Integer>mc2 =new MyClass<>(59);
		mc2.printData();
	
		
	}

}
