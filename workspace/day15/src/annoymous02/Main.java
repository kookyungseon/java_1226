package annoymous02;

public class Main {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		
		ca.printData();
//		인터페이스 객체화 할때 익명클래스 활용 
		InterA a = new InterA() {
			
			@Override
			public void printData() {
				System.out.println("익명크랠스에서 오버라이딩!");
			}
		};
		a.printData();
	}

}
