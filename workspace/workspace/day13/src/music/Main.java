package music;

public class Main {
	public static void main(String[] args) {
		
		Main main = new Main();
		Music music1 = new HipHop(); //업캐스팅
		Music music2 = new Ballad(); //업캐스팅
		
		main.check(music1);
		main.check(music2);
		main.check(new Rock());
		
		
	}
	
	void check(Music music) {
		if(music instanceof Ballad) {
			Ballad ballad = (Ballad)music;
			ballad.mod(); //인터페이스 구현 메소드
			ballad.onlyBallad();
		}else if (music instanceof HipHop) {
			HipHop hip = (HipHop)music;
			hip.mod();
			hip.onlyHipHop();
		}else if(music instanceof Rock) {
			Rock rock = (Rock)music;
			rock.mod();
			rock.onlyRock();
		}
	}

}
