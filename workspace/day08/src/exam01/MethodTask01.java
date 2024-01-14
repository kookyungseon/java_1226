package exam01;


public class MethodTask01 {
   
//   메소드 정의
//   정수 2개를 매개변수로 받아와서 받아온 2개의 숫자의 합의 결과를 반환하는 메소드
//   반환타입 메소드명(자료형 매개변수,...){
//         실행할 기능;
//         return 반환값;
//   }
   int add(int num1, int num2) {
//      메소드의 기능
      int result = num1 + num2;
      return result;
   }
   
//   "안녕하세요"라는 문자열을 출력하는 메소드 printHello
   static void printHello() {
      System.out.println("안녕하세요");
   }
   
   
   public static void main(String[] args) {
      
      MethodTask01  method01 = new MethodTask01();
//         자료형         변수명   =   값;
//         자료형[]       배열명   = new 자료형[칸수];
      
//       add 메소드 호출
      int result = method01.add(10, 20);
      System.out.println(result);
      
//      printHello메소드 호출
      printHello();
      
      
      
      
      
      
   }

}