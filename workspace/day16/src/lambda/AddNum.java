package lambda;

// 함수형 인터페이스 ( 매개변수 2개 )
@FunctionalInterface
public interface AddNum {
	
	int add(int num1, int num2);
//	int add2(int num1, int num2); 함수형 인터페이스는 추상 메소드 단 1개만 선언할 수 있다!!!
	
	
}
