package music;

public class Rock implements Music {

	
//	인터페이스 구
	@Override
	public void mod() {
		System.out.println("락모드 실행");
		
	}
	void onlyRock() {
		System.out.println("onlyRock 실행");
	}
	

}
