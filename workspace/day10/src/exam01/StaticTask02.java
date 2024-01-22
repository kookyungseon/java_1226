package exam01;

public class StaticTask02 {
   
   public static void main(String[] args) {
      
//      객체화 작업
      Studnet st1 = new Studnet("짱구");
//      인스턴스 메소드 호출
      st1.hello();
      
//      정적 메소드 호출 : 클래명.멤버명으로 사용한다!
      Studnet.goschool();
      
      Studnet st2 = new Studnet("철수");
//      인스턴스 메소드 호출
      st2.hello();
//      정적 메소드 호출
      Studnet.goschool();
      
   }

}
