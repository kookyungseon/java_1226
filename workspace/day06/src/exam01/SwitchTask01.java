package exam01;

public class SwitchTask01 {
	public static void main(String[] args) {
		
//		switch문
		
		int num1 = 1;
		
		switch(num1) {
		
		case 1 :   //switch()안에 있는 변수의 값이 case 옆에 있는 값과 같은지 확인
//			case의 값과 변수의 값이 같으면 실행
			System.out.println("num1은 1입니다");
			break;
		
		case 2 :
			System.out.println("num1은 2입니다");
			break;
		
		default :
			System.out.println("num1은 1도 2도 아닙니다");
			break;
		
		}
		
		
		
	}

}
