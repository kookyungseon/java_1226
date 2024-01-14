package exam02;

//부모 클래스 Person
class Person{
//   필드
   String name;
   int age;
   String job;
   
//   부모클래스의 생성자
   public Person(String name, int age, String job) {
      super();
      this.name = name;
      this.age = age;
      this.job = job;
   }
   
   void eat() {
      System.out.println(name+"은/는 밥을 먹는다");
   }
   
}

class Student extends Person{
   
   String schoolName;

//   자식 클래스의 생성자
   public Student(String name, int age, String job, String schoolName) {
      super(name, age, job);
      this.schoolName = schoolName;
   }

//   오버라이딩 : 재정의
   @Override
   void eat() {
      System.out.println(name+"은/는"+schoolName+"을 점심을 먹는다");
   }
   
   void walk() {
      System.out.println(name+"은/는"+schoolName+"로 등교한다.");
   }
}

class Employee extends Person{
   
   String workSpace;

//   Employee의 생성자
   public Employee(String name, int age, String job, String workSpace) {
      super(name, age, job);
      this.workSpace = workSpace;
   }

   @Override
   void eat() {
      System.out.println(name+"은/는"+workSpace+"의 구내식당에서 밥을 먹는다");
   }
   
   void walk() {
      System.out.println(name+"은/는 "+workSpace+"로 출근한다.");
   }
   
}


public class CastingTask02 {
   public static void main(String[] args) {
      
//      부모클래스 타입의 변수에 부모 생성자
      Person p1 = new Person("짱구", 5,"유치원생");
//      부모 클래스 타입의 변수에 Student 자식 클래스의 생성자(업캐스팅)
      Person p2 = new Student("강진혁", 20 ,"대학생", "코리아대학교");
//      부모 클래스 타입의 변수에 Employee 자식 클래스 생성자(업캐스팅)
      Person p3 = new Employee("홍길동", 30, "개발자", "코리아회사");
      
//      객체 오버라이딩 진행되는 것 확인
      p1.eat();
      p2.eat();
      p3.eat();
      
      
//      다운캐스팅 확인
      printWalk(p1);
      printWalk(p2);
      printWalk(p3);
      
      
      
   }
   
//   매개변수에 부모 클래스 타입의 매개변수 생성(들어오면서 자동 업캐스팅)
   static void printWalk(Person person) {
      
      if(person instanceof Student) {
         ((Student) person).walk();  //Peron타입을 Student 타입으로 다운 캐스팅
      }else if (person instanceof Employee) {
         ((Employee)person).walk();
      } else {
         System.out.println("걷기 싫어!!");
      }
      
   }
   

}
