package exam02;

public class ForTask02 {
	public static void main(String[] args) {
		
		
//		1) 100 ~ 1 까지 출력
		
		for(int i=0; i < 100; i++) {
			System.out.println(100-i);
		}
		
		System.out.println();
//		2) 1 ~ 100까지 중에 짝수만 출력
		
		for(int i=1; i<101; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}	
		}
		
		System.out.println();
		
		for(int i=2; i<101; i+=2) {
			System.out.println(i);
		}
		
		System.out.println();

		for(int i=0; i<50; i++) {
			System.out.println((i+1)*2);
		}
		
		
		
		
		
	}

}
