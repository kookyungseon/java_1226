package exam03;

public class DoubleFor01 {
	public static void main(String[] args) {
		
//		이중 반복문
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("i = "+i+", j = "+j);
			}
			
		}
		
		System.out.println();
		
//		<실습> 1 ~ 100까지의 합(for문)
		int total = 0;
		for(int i=1; i<101; i++) {
			System.out.println(total);
			total += i; //total = total + i;
		}
		
		System.out.println("1~100까지의 합 : "+total);
		
	}

}
