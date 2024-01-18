package exam01;

public class Studnet {
	
//	정적필드 : 학교이름(모든 학생의 학교이름은 같다 )
	static String schoolName = "코리아 고등학교";
	
//	인스턴스 필드 선언 : 이름 (학생들마다 이름이 다르다 )
	String studentName;
	
//	생성자(학생의 이름 초기화)
	 public Studnet(String studentName) {
	      
	      this.studentName = studentName;
	   }
	
//	인스턴스 메소드 
	void hello() {
		System.out.println("안녕, 내 이름은 " + studentName + "이야");
//		인스턴스 메소드는 인스턴스 필드를 사용할 수 있음 
		System.out.println("나는 " + schoolName +"에 다니고 있어!");
//		인스턴스 메소드는 정적 필드 사용할 수 있음 
		
	}
//	정적 메소드 
	static void goschool () {
		
//		System.out.println(studentName + "은 학교에 가는 날입니다");
//		static 메소드는 인스턴스 멤버를 사용할 수 없다 
		System.out.println(schoolName + "에 등교합니다!");
//		정적 메소드에서는 저엊ㄱ 필드 사용 가능하
	}
}
