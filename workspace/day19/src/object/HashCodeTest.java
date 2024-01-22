package object;

class User{
//   필드
   int userNum; //회원 번호
   String userName;//회원 이름
   
   public User(int userNum, String userName) {
      super();
      this.userNum = userNum;
      this.userName = userName;
   }
   
   
   
}


public class HashCodeTest {
   public static void main(String[] args) {
      
      User u1 = new User(10, "sun");
      System.out.println(u1.hashCode()); //hashCode는 16진수의 참조값을 정수로 변환
      
      
      
   }

}