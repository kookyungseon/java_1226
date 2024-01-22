package exam01;

class Student{
//	멤버 필드 (변수)
	String name ;
	int age;
	
	int kor; // 국어 성적 
	int eng; // 영어 성적
	int math; // 수학 성적
	
	
//	멤버 메소드
	int getTotal() {
		return kor + eng + math;
		
	}
	
	
}


public class ClassTask01 {
	public static void main(String[] args) {
		Student st1 = new Student(); //객체화 
		Student st2 = new Student();
		
		st1.name="짱구";
		st1.age=10;
		st1.kor = 60 ;//학생1의 국어점수
		st1.eng = 70 ;//학생1의 영어점수
		st1.math = 30 ;//학생1의 수학점수
		
		
		
		st2.name = "철수";
		st2.age=12;
		st2.kor =90;
		st2.eng =90;
		st2.math =90;
		
		System.out.println("첫번째 학생의 이름은 "+ st1.name +"이고 나이는 "+ st1.age + "살 입니다");
		System.out.println(st1.name+"의 점수 총합은" +st1.getTotal()+"점 입니다");
		System.out.println("첫번째 학생의 이름은 "+ st2.name +"이고 나이는 "+ st2.age + "살 입니다");
		System.out.println(st2.name+ "의 점수 총합은" +st2.getTotal()+"점 입니다");
		
		
	}

}
