package exam01;

public class MethodTask02 {
	
//	매개변수 x, 리턴x
	void printHello() {
		System.out.println("안녕");
	
	}
//	매개변수 없고, 리턴 있는 경우 
	int add1() {
		int num1 = 1; // 지역변수 
		int num2 =2;
		return num1 + num2;
		
	}

//	매개변수 있고, 리턴 없는 경우 
	void add2(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
//	매개변수 있고, 리턴 있는 경우 
	int add3(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		
//	메소드를 사용하기 위해서는 먼저 class 객체를 만들어 줘야함
		MethodTask02 task = new MethodTask02();
		
		task.printHello();
		System.out.println(task.add1());
		task.add2(10, 20);
		
		int result = task.add3(100, 200);
		System.out.println(result);
	}

}
