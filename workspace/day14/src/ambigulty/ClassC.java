package ambigulty;

public class ClassC implements Inter1, Inter2, Inter3 {

	@Override
	public void printText() {
		
//		부모에서 정의된 default 메소드를 사용하려면 어떤 부모의 메소드를
//		사용할지 정해서 작성한다
		Inter1.super.printText();
//		재정의 
//		System.out.println("ClassC printText()");
		
	}
	
	
	

}
