package exam03;

public class ContinueBreak {
	public static void main(String[] args) {
		
//		break문 : {}영역을 탈출
		int cnt = 0;
		while (true) {   //무한반복
			cnt ++;
			if(cnt == 6) {
				break;
			}
			System.out.println(cnt);	
		}
		
//		continue문 : 다음 반복으로 넘어간다
//		1~10까지 5를 제외하고 출력
		for(int i=1; i<11;i++) {
			if(i == 5) {
				continue;	
			}
			System.out.println(i);
		}
		
//		<실습> 1~ 100까지 숫자 중 홀수의 합만 구해서 출력
		int sum = 0;
		for(int i=1; i<101; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		
		System.out.println("1~100까지 홀수의 합 : "+sum);
		
		
		
		
		
		
		
		
	}

}
