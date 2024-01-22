package access01;

public class A {
	public int var1; //day12 프로젝트 안에만 있으면 접근 가능
	int var2; //default : access01 패키지 안에서만 접근 가능
	protected int var3 ; // protected : access01 패키지 안에서만 접근 가능 단, 자식 클래스는 가능
	private int var4;//같은 클래스에서만 접근 가능 

	
// getter, setter 메소드 - > private 멤버 다른 클래스에 접근 가능하게 하는 메소드 
	//getter
	public int getVar4() {
		return var4;
	}
	public void setVar4(int var4) {
		this.var4 = var4;
	}
	
}
