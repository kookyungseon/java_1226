package exam01;

//실습
//클래스명 Soccer
//필드 멤버 : job, name, age, pos
//생성자 1개
//메소드 showJob : 직업 출력 메소드 
//메소드 introduce : 이름, 나이, 포지션 


public class StaticTask03 {
	public static void main(String[] args) {
		
	
	Soccer sc1 = new Soccer("이름", 20, "포지션");
	Soccer.showJob();
	sc1.introduce();
	
	}	

}
