package exam03;

public class DoWhileTask01 {
	public static void main(String[] args) {
		
//		10번 안녕하세요 출력
		
		int cnt = 0;
		do {
			cnt++;
			System.out.println(cnt+"번 안녕하세요");
		}while(cnt < 10);
		
		int num = 1;
		while(num < 1) {
			System.out.println("while문은 " +num+"을 출력하지 못합니다");
		}
		
		int num2 = 1;
		do {
			System.out.println("do~while은 적어도 한번 실행됩니다");
		}while(num2 < 1);
		
	}

}
