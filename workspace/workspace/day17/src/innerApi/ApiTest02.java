package innerApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ApiTest02 {
	public static void main(String[] args) {
	
	 Date today = new Date();
	 System.out.println(today);
//	 현재 시간 출력
	 
//	SimpleDateFormat 날짜 형식 지정
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
	 String form = sdf.format(today);
	 System.out.println(form);
	 
//	 시, 분, 초 
	 SimpleDateFormat  sdf2 = new SimpleDateFormat("yy년 MM/dd ---- HH:mm:ss");
	 System.out.println(sdf2.format(today));
	}

}
