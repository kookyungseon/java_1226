package exam01;

class Person{
//   필드 선언 : 이름, 나이
   String name;
   int age;
   
//   부모의 생성자
   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }

   void eat() {
      System.out.println("먹는다");
   }
   
   void sleep() {
      System.out.println("잠을 잔다");
   }
   
}

class Student extends Person {

//   자식 필드 선언
   int stNum; //학생번호

   public Student(String name, int age, int stNum) {
      super(name, age);//부모의 생성자에서 가져올 필드
      this.stNum = stNum;// 자식클래스에서 추가된 필드 초기화
   }

   //   Parent 클래스에서 name, age 필드 가져옴
//   Parent 클래스에서 sleep() 메소드 가져옴
//   메소드 1개 추가
   void study() {
      System.out.println("학생은 공부한다");
   }

//   오버라이드 단축키
//   자식클래스에서 부모의 메소드를 재정의
//   alt + shift + s,  v
   @Override
   void eat() {
      super.eat(); //부모 클래스의 멤버 접근  super
      System.out.println("학생은 석식을 먹는다");
   }
   
}
public class InheritTask01 {
   
   public static void main(String[] args) {
      
//      Person 클래스 객체화
      Person p = new Person("짱구", 5);
//      Student 클래스 객체화
      Student st = new Student("짱아", 10, 1234);
      
      System.out.println(p.name);
      System.out.println(st.name);  //자식 객체는 부모의 멤버를 가지고 있음 (부모의 필드 상속)
      
//      p.sleep();
//      st.sleep(); //부모의 메소드 상속
      
//      p.study(); //자식 클래스에서 추가된 멤버는 부모클래스에서 접근 불가
      
      p.eat(); //자식 클래스에서 오버라이드한 메소드는 부모에 영향을 주지 않는다
      st.eat(); //자식 클래스에서 eat() 오버라이드(재정의)
      

      
   }
   
}