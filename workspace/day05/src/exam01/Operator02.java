package exam01;

public class Operator02 {
   public static void main(String[] args) {
      
//      산술연산자
      int num1 = 10;
      int num2 = 3;
      double num3 = 2.5;
      double num4 = 3.0;
      
//      1) + 연산자
      System.out.println(num1 + num2); //정수 + 정수 = 정수
      System.out.println(num1 + num3); //정수 + 실수 = 실수
      System.out.println(num3 + num4); //실수 + 실수 = 실수
      
//      2) - 연산자
      System.out.println(num1 - num2); //정수 - 정수 = 정수
      System.out.println(num1 - num4); //정수 - 실수 = 실수
      System.out.println(num3 - num4); //실수 - 실수 = 실수
      
//      3) * 연산자
      System.out.println(num1 * num2); // 정수 * 정수 = 정수
      System.out.println(num1 * num4); // 정수 * 실수 = 실수
      System.out.println(num3 * num4); // 실수 * 실수 = 실수
      
//      4) / 연산자
      System.out.println(num1 / num2); //정수 / 정수 = 정수(몫만 나온다)
      System.out.println(num1 / num3); //정수 / 실수 = 실수
//      System.out.println(num1 / 0); 오류 발생 -> 정수는 0으로 나눌 수 없다
      System.out.println(num3/0); //실수를 0응로 나누면 Infinity가 나옴
      
//      %연산자
      System.out.println(num1 % num2);
      System.out.println(num3 % num4);
   }

}