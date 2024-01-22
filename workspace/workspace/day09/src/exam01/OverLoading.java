package exam01;

public class OverLoading {
	
//	add() 메소드 2개 생성
//	오버로딩 : 같은 메소드명 작성 (매개변수 갯수, 자료형만 다르다면)
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	
	
	public static void main(String[] args) {
		
		OverLoading o1 = new OverLoading();
		
		System.out.println(o1.add(10, 20));
		System.out.println(o1.add(10, 20 , 30));
	}

}
