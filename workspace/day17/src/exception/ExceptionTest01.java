package exception;

import java.util.Scanner;

public class ExceptionTest01 {
   
   public static void main(String[] args) {
      
      Scanner sc = null;
      
      try {
         sc.next();
      }catch(NullPointerException e) {
//         예외처리할 문장;
         System.out.println("null이에요!");
         System.out.println(e);
         System.out.println(e.toString());
         System.out.println(e.getMessage());
         e.printStackTrace();
      }catch(Exception e) {
//         우리가 try에서 어떤 오류가 발생할지 전부 예상하기는 힘들다.
//         예상치 못한 오류가 발생할 수 있다.
//         예상치 못한 오류를 잡기 위해 Exception타입의 참조변수를 사용한다.
//         모든 예외의 부모 클래스는 Exception 클래스이다.
//         즉, 어떤 예외가 발생하더라도 Exception 타입의 참조변수에 저장가능하다(업캐스팅)
         System.out.println("예상치 못한 오류");
         
         
      }
   }
}
