package object;


class Person{
	
//	필드
	String neme;
	int age;
	
//	생성자
	public Person(String neme, int age) {
		super();
		this.neme = neme;
		this.age = age;
	}
	
	
}
public class EqualsTest02 {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("짱구",10);
		Person p2 = new Person("유리",20);
		Person p3 = new Person("짱구",30);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
	}

}
