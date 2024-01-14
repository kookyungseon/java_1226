package exam01;


class Family{
	
	String name;
	int age;
	static String address = "서울"; //객체가 모두 값을 공유하는 멤버 : 클래스 변수 
	
	public Family(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class StaticTask01 {
	public static void main(String[] args) {
		
		Family father = new Family("아버지", 61);
		Family son = new Family("아들", 28);
		
		System.out.println(Family.address);
		System.out.println(Family.address);
		
		
//		아버지가 인천으로 이사 
		father.address = "인천";
		System.out.println(Family.address);
		
//		아들이 이사갔는지 확인 
		System.out.println(Family.address);
		
		
	}
}
