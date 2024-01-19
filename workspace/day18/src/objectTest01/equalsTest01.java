package objectTest01;

class Person{
   
   //필드
   String name;
   int age;
   
   
   public Person(String name, int age) {
      super();
      this.name = name;
      this.age = age;
   }

   
//   이름이 같다면 같은 사람이라 판별하도록 equals() 재정의 
   @Override
   public boolean equals(Object obj) {
      if(this == obj) {//현재 객체와 비교대상 객체가 같은 인스턴스인 경우
         return true;
      }
      
//      A || B -> A,B 둘 중 하나라도 true -> true
      if(obj == null || this.getClass() != obj.getClass()) {
//         비교 대상 객체가 null이거나 클래스 타입이 다른 경우
         
         return false;//두 객체가 다르다고 판단
      }
      
      Person p = (Person)obj;
//      비교대상 객체 obj를 Person 타입으로 형 변환하여 p에 저장
      return this.name.equals(p.name);
//      현재 객체의 name 필드와 비교대상 객체의 name필드를 비교하여
//      같으면 true, 다르면 false로 출력
      
   }
   
   
   

}


public class equalsTest01 {
   
   public static void main(String[] args) {
      

      Person p1 = new Person("짱구", 10);
      Person p2 = new Person("유리", 30);
      Person p3 = new Person("짱구", 40);
      
      System.out.println(p1.getClass());
      System.out.println(p3.getClass());
      System.out.println(p1.equals(p3));
      System.out.println(p1.equals(p2));
      
//      System.out.println(p1); //참조값
//      System.out.println(p2); //참조값
//      System.out.println(p1.equals(p2)); //2개의 참조값이 같은지 비교
//      
//      String str1 = "안녕";
//      String str2 = "안녕";
//      String str3 = new String("안녕");
//      
////      ==
//      System.out.println(str1.equals(str3));
//      System.out.println(str1 == str3);
      
      
      
   }
   
   
   
   
   
   

}