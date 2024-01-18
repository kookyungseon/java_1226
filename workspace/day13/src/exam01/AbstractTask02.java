package exam01;

abstract class Animal{
	abstract void crying();
	
}

class Dog extends Animal{

	@Override
	void crying() {
		System.out.println("강아지는 멍멍하고 운다");
		
	}
	
}

class Cat extends Animal{

	@Override
	void crying() {
		System.out.println("고양이는 야옹하고 운다");
		
	}
	
}

public class AbstractTask02 {
	public static void main(String[] args) {
		Dog dog =new Dog();
		Cat cat = new Cat();
		
		dog.crying();
		cat.crying();
		
	}

}
