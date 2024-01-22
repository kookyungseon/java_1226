package exam01;

import java.util.Scanner;

public class JoinUser {
   public static void main(String[] args) {
      
//      간단한 회원가입 프로그램 만들기!!
      User user = new User();
      Scanner sc = new Scanner(System.in);
      
      System.out.println("===회원가입을 시작합니다!===");
      
      System.out.print("가입할 아이디 입력 : ");
      String userId = sc.nextLine();
      
      System.out.print("가입할 비밀번호 입력 : ");
      String userPw = sc.nextLine();
      
      System.out.print("가입할 이름 입력 : ");
      String userName = sc.nextLine();
      
//      setter 메소드로 user객체의 private 필드에 값 저장
      user.setUserId(userId);
      user.setUserPw(userPw);
      user.setUserName(userName);
      
      System.out.println();
      
//      회원 정보 확인
      System.out.println("===회원정보 확인===");
      
//      getter 메소드로 user객체의 필드의 값 가져오기
      System.out.println("아이디 : "+user.getUserId());
      System.out.println("비밀번호 : "+user.getUserPw());
      System.out.println("이름 : "+user.getUserName());
      System.out.println(); //줄바꿈
      
      System.out.println("==회원가입이 완료되었습니다==");
      
      
      
      
      
      
      
   }

}