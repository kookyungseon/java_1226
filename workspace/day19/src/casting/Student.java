package casting;

public class Student extends Person{
	
	String schoolName;

	public Student(String name, int age, String job, String schoolName) {
		super(name, age, job);
		this.schoolName = schoolName;
	}
	 
//	자식 클래스에서 추가할 메소드
	void walk() {
		System.out.println(name + "은/는 " + schoolName +"로 등교한다");
	}
// 	부노 클래스의 eat() 재정의 (오버라이트)
	@Override
	void eat() {
		System.out.println(name + "은/는 " +schoolName+"에서 점심을 먹는다");
	}
	

	

}
