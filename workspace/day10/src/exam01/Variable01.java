package exam01;

public class Variable01 {
   
   int num; //인스턴스 변수
   static int num2; //정적 변수
   
   int addNum(int var1, int var2) {  //var1,2는 매개변수
      int result = var1 + var2;  //result는 지역변수
      return result;
   }
   
   public static void main(String[] args) {
      Variable01 v1 = new Variable01();
      
      System.out.println(v1.addNum(10, 20)); //10은 addNum메소드의 매개변수 var1에 저장되는 인수
//      20은 addNum메소드의 매개변수 var2에 저장되는 인수
      
   }
   

}