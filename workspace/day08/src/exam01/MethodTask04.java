package exam01;

import java.util.Scanner;

public class MethodTask04 {
   
//   메소드 printStar
//   숫자 입력 : 5 
//   *****
//   매개변수 o
//   리턴o,x
   
//   1) 리턴 o
   String printStar(int cnt){
      String star = "";
      for(int i =0; i<cnt; i++) {
         star += "*";
      }
      return star;
   }
   
//   리턴 x
   void printStar2(int cnt) {
      for(int i=0; i<cnt; i++) {
         System.out.print("*");
      }
      System.out.println();
   }
   
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
//      클래스 객체화
      MethodTask04 task = new MethodTask04();
      
      System.out.print("별의 개수 입력 : ");
      int cnt = sc.nextInt();
      
//      String starResult = task.printStar(cnt);
//      System.out.println(starResult);
      task.printStar2(cnt);
            
            
            
            
            
            
            
            
      
   }

}