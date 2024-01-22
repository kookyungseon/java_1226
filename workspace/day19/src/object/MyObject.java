package object;

public class MyObject {
   
//   필드 int value
//   equals(), toString, hashCode() 오버라이드
   
//   필드
   int value;
   
//   생성자
   public MyObject(int value) {
      super();
      this.value = value;
   }
   
   
   
   @Override
//   객체의 필드 값이 같으면 true 반환 아니면 false 반환
   public boolean equals(Object obj) {
      if(this == obj) {
         return true;
      }
      
      if(obj == null || this.getClass() != obj.getClass()) {
         return false;
      }
      
      MyObject mo = (MyObject)obj;//다운캐스팅
      return this.value == mo.value;
   }
   
   
   @Override
   public int hashCode() {
      return value;
   }



   @Override
   public String toString() {
      return "MyObject 클래스의 value 값은 " + value;
   }



   public static void main(String[] args) {
//      MyObject 클래스 객체 2개 생성
      MyObject m1 = new MyObject(10);
      MyObject m2 = new MyObject(20);
      
      System.out.println(m1.equals(m2));
      
      System.out.println("m1 : " + m1);
      System.out.println("m2 : " + m2);
      System.out.println("m1.hashCode() : " + m1.hashCode());
      System.out.println("m2.hashCode() : " + m2.hashCode());

      
         
   }

}