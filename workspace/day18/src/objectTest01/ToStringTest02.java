package objectTest01;

class Student{
// 필드
	int math;
	int kor;
	int eng;
	String grade;
	double avg;
	
//	생성자 
	public Student(int math, int kor, int eng, String grade, double avg) {
		super();
		this.math = math;
		this.kor = kor;
		this.eng = eng;
		this.grade = grade;
		this.avg = avg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return "math 점수는 " + math + " kor 점수는 " + kor +" eng 점수는 " +eng;
	}
	
	
}

public class ToStringTest02 {
	public static void main(String[] args) {
		Student st = new Student(100, 50, 20, "B", 50.2);
		System.out.println(st);
		System.out.println(st.toString());
		
		int num= 10;
		System.out.println(num);
		
	}

}
