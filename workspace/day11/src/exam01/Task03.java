package exam01;

//<실습>
//부모클래스 Animal
//필드 : 이름(name), 나이(age)
//메소드 : cry(), sleep()
//cry() : "동물은 어떻게 울음소리를 낼까요?" 출력
//sleep() : "잠을 잔다" 출력
//생성자 1개 : name, age

//Animal의 자식 클래스 Dog, Cat 2개
//필드 : 종(species) 추가
//생성자 1개 : 부모의 생성자에서 name, age  -> 종 추가 
//cry()를 재정의(오버 라이딩) : 부모의 cry() 호출, "강아지(필드) 멍멍이(필드)는 멍멍(Cat : 야옹) 하고 웁니다"

class Animal {

//   부모클래스 필드
   String name;
   int age;

   public Animal(String name, int age) {
      this.name = name;
      this.age = age;
   }

   void cry() {
      System.out.println("동물은 어떻게 울음소리를 낼까요?");
   }

   void sleep() {
      System.out.println("잠을 잔다");
   }

}

//자식 클래스 Dog
class Dog extends Animal {

//   자식 클래스 필드 추가로 선언 : name, age, species(추가)
   String species;
//   String name; 부모에서 상속받음
//   int age;  부모에서 상속받음

//   Dog 클래스 생성자
   public Dog(String name, int age, String species) {
      super(name, age);
//      this.name = name ;
//      this.age = age;
      this.species = species;
   }

   @Override
   void cry() {  //자식 클래스에서 부모 클래스의 cry() 재정의(오버 라이딩)
      super.cry(); //부모클래스의 cry() 메소드 호출
      System.out.println(species+" "+name+"는 멍멍하고 웁니다.");
   }
   
//   자식 클래스 Dog에서 메소드 추가
   void walk() {
      System.out.println("강아지는 산책을 좋아한다.");
   }
   
}

class Cat extends Animal{
//   Cat 클래스의 필드
   String species;

//   자식 클래스의 생성자
   public Cat(String name, int age, String species) {
      super(name, age);
      this.species = species;
   }

//   Animal의 cry() 오버라이딩(재정의)
   @Override
   void cry() {
      super.cry();
      System.out.println(species+" "+name+"은 야옹하고 웁니다.");
   }
   
//   자식 클래스 Cat 추가 메소드
   void tower() {
      System.out.println("고양이는 켓타워에서 노는걸 좋아합니다");
   }
}

public class Task03 {

   public static void main(String[] args) {
      
//      Animal의 객체
      Animal a = new Animal("모름",0);
      a.cry();
      a.sleep();
//      a.walk(); 부모 클래스에서 자식 클래스의 추가된 멤버에는 접근 불가
//      a.tower();
      
//      Dog의 객체
      Dog dog = new Dog("동팔이",12,"강이지");
      dog.cry();
      dog.sleep();//자식 클래스에서는 부모클래스의 메소드에 접근 가능
      dog.walk(); //자식클래스에서 새롭게 추가된 메소드
//      dog.tower();
      
//      Cat의 객체
      Cat cat = new Cat("달이", 5, "고양이");
      cat.cry();
      cat.sleep();
//      cat.walk();
      cat.tower();
      
      
   }
   
   
   
}