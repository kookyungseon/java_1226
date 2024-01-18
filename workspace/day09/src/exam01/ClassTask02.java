package exam01;

class Person{
   
//   필드
   String name; //사람이름
   int age; //나이
   String job; //직업
   
//   생성자 : 매개변수 x, 안에가 텅 비어있음 -> 기본생성자(선언하지 않으면 자동으로 생성)
   public Person(String name, int age, String job) {
    this.name = name;
     this.age = age;
     this.job = job;
     
   }
//   메소드 
   	void show() {
   		
   		System.out.println("이름 : " + name);
   		System.out.println("나이 : " + age);
   		System.out.println("직업 : " +job);
   	}
}



public class ClassTask02 {
	public static void main(String[] args) {
//		person()이라는 생성자에 필드의 초기값 설정 
	
		Person p1 = new Person("강진혁", 20, "강사");
		
////		p1.name = "강진혁";
////		p1.age =20;
////		p1.job ="강사";
//		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.job);
		p1.show();
	}
}