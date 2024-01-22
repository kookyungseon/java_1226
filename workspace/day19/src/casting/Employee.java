package casting;

public class Employee extends Person{
	
	String workSpace;

	public Employee(String name, int age, String job, String workSpace) {
		super(name, age, job);
		this.workSpace = workSpace;
	}
// 	자식 클래스에서 추가한 메소드
	void walk() {
		System.out.println(name +"은/는 " + workSpace +"로 출근단다");
		
	}
//	부모 클래스의 eat() 오버라이드
	@Override
	void eat() {
		System.out.println(name + "은/는 "+workSpace +"의 구내식당에서 점심을 먹는다");
	}
	

}
