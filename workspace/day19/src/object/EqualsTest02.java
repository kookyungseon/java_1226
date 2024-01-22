package object;

class Person{
   
//   필드
   String name;
   int age;
   
//   생성자
   public Person(String name, int age) {
      super();
      this.name = name;
      this.age = age;
   }

   @Override
   public boolean equals(Object obj) {  //매개변수로 객체가 들어올 때 Object클래스로 자동 업캐스팅됨!!
      
      if(this == obj) { //현재 객체와 비교대상 객체가 같은 인스턴스인 경우
         return true;
      }
      
      if(obj == null || this.getClass() != obj.getClass()) {
//         비교대상 객체가 null이거나 클래스 타입이 다른 경우
         
         return false; //
      }
      
      Person p = (Person)obj;
      // 비교대상 객체 obj를 Person 타입으로 형 변환하여 p에 저장
      
      return this.name == p.name;
//      현재 객체의 name 필드와 비교대상 객체의 name필드를 비교하여
//      같으면 true, 다르면 false로 출력
      
      
      
   }
   
   
   
   
   
}



public class EqualsTest02 {
   
   public static void main(String[] args) {
      Person p1 = new Person("짱구", 10);
      Person p2 = new Person("유리", 20);
      Person p3 = new Person("짱구", 30);
      
      System.out.println(p1.equals(p2));
      System.out.println(p1.equals(p3));
      
//      .getClass()
      System.out.println(p1.getClass());
      System.out.println(p2.getClass());
      System.out.println(p3.getClass());
      
      
      
      
      
   }
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   