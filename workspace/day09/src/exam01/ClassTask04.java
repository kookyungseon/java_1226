package exam01;

class Phone{
   
//   필드
   String brand;
   String series;
   String color;
   
//   생성자(매개변수 2개)
   public Phone(String brand, String series) {
      this.brand = brand;
      this.series = series;
   }
   
//   생성자(매개변수 3개)
   public Phone(String brand, String series, String color) {
      this(brand, series); //자기 자신의 생성자
      this.color = color;
   }
   
   
   void printPhone() {
      System.out.println("브랜드명 : "+brand);
      System.out.println("시리즈명 : "+series);
      System.out.println("색상 : "+color);
      
   }



   
}


public class ClassTask04 {
   
   public static void main(String[] args) {
      
//      객체 생성(매개변수 2개 생성자)
      Phone p1 = new Phone("갤럭시", "s22");
//      객체 생성(매개변수 3개 생성자)
      Phone p2 = new Phone("아이폰", "15 Pro", "white");
      
      p1.printPhone();
      p2.printPhone();
      
      
   }
   

   

}
