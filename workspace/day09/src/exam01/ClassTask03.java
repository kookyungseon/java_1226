package exam01;
//실습
//Player 클래스 생성
//필드 : 이름 String, 나이 int , 직업 String
// 생성자 1개 : 이름, 나이, 직업 초기 값 설정
//printShow() : 이름 , 나이 , 직업 출력
// 클래스 선언하고 구현까지
// 객체 2개 1명은 축구선수, 1명은 야구선수 

class Player{
	String name;
	int age;
	String job;
	
	public Player(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	void PrintShow() {
		
		System.out.println("이름 : " + name);
   		System.out.println("나이 : " + age);
   		System.out.println("직업 : " +job);
	
	}
}


public class ClassTask03 {
	public static void main(String[] args) {
		Player p1 = new Player("이름1",20,"축구선수");
		Player p2 = new Player("이름2",20,"야구선수");
	
	p1.PrintShow();
	System.out.println();
	p2.PrintShow();
		

		
	}

}
