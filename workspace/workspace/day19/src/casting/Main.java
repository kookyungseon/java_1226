package casting;

public class Main {
   
   public static void main(String[] args) {
      
      Person p1 = new Person("짱구", 5, "유치원생");
      Student st1 = new Student("맹구", 21, "대학생", "코리아학교");
      Employee e1 = new Employee("홍길동", 30, "개발자", "코리아회사");
      
//      객체 오버라이딩 진행 확인
//      p1.eat();
//      st1.eat();
//      e1.eat();
      
//      다운캐스팅 확인
      printWalk(p1);
      printWalk(st1);
      printWalk(e1);
      
//      stWalk(st1);
//      employeeWalk(e1);
      
   }
   
////   매개변수에 부모 클래스 타입의 매개변수(들오면서 자동 업캐스팅)
   static void printWalk(Person person) {
//      st1, e1 매개변수로 들어오면서 Person 클래스 타입으로 업캐스팅
      if(person instanceof Student) { //st1은 Student타입을 가지므로 true 반환
         ((Student)person).walk(); //다운 캐스팅 //이미 업캐스팅된 st1 객체를 Student 타입으로 다운 캐스팅
      }else if (person instanceof Employee) { //e1은 Employee타입을 가지므로 true 반환
         ((Employee)person).walk(); //이미 Person 타입으로 업캐스팅된 e1객체는 Employee 타입으로 다운 캐스팅 가능
      }else {
         System.out.println("걷기 싫어!!!!");
      }
   }
   
//   static void stWalk(Student student) {
//      student.walk();
//   }
//   
//   static void employeeWalk(Employee e) {
//      e.walk();
//   }
      
      
      
      
      
      
      
      
      
      
}
