package exam01;

public class Soccer {
static String job = "축구선수";
	String name;
	int age;
	String pos;
	

	 public Soccer(String name, int age, String pos ) {
		 this.name = name;
		 this.age = age;
		 this.pos = pos;
	      
	   }
	 static void showJob() {
		 System.out.println("제 직업은 " +job +"입니다");
		 
	 }
	 void introduce() {
		 System.out.println("이름 : " + name);
		 System.out.println("나이 : " +age);
		 System.out.println("포지션 : " + pos);
		
	 }

}
