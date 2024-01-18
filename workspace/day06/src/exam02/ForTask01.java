package exam02;

public class ForTask01 {
	
	public static void main(String[] args) {
		
//		for(초기식; 조건식; 증감식){}
		
//		안녕하세요 문구 10번 출력
		for(int i = 0; i<10; i++) {
//			 1번      2번(5번)  4번
			System.out.println("안녕하세요");
//			3번
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
//		<실습>
//		이름 10번 출력
//		1번째 강진혁
//		2번째 강진혁
//		...
//		10번째 강진혁
		
		for(int i=1; i < 11; i++) {
			System.out.println(i +"번째 강진혁");
		}
		
		for(int i=10; i>0; i--) {
			System.out.println(11-i+"번째 강진혁");
		}
		
		
		
		
		
		
		
	}

}
