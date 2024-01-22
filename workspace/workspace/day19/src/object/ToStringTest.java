package object;

class Student{
	
//	필드
	int math;
	int kor;
	int eng;
	String grade;
	
	
	public Student(int math, int kor, int eng, String grade) {
		super();
		this.math = math;
		this.kor = kor;
		this.eng = eng;
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "math 점수는 " + math +" kor 점수는 "+kor+" eng 점수는 "+eng;
	}
	
}

public class ToStringTest {
	
	public static void main(String[] args) {
		Student st1 = new Student(100, 90,80,"A");
		System.out.println(st1);
	}

}
