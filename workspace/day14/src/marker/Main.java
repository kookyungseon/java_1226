package marker;

public class Main {
	public static void main(String[] args) {
		
		Main m = new Main();
		m.checkA(new Eagle()); //업캐스팅
		m.checkA(new Tiger());
		m.checkA(new Horse());
		
		System.out.println();
		
//		육지, 하늘 구별
		m.checkB(new Eagle());
		m.checkB(new Tiger());
		m.checkB(new Horse());
	}
	
//	육식, 초식 구별!
	void checkA(Animal animal) {
		if(animal instanceof Carnivore) {
			System.out.println("육식동물!");
		}else if (animal instanceof Herbivore) {
			System.out.println("초식동물!");
		}
	}
	
//	육지, 하늘
	void checkB(Animal animal) {
		if(animal instanceof Sky) {
			System.out.println("날아다닌다!");
			
		}else if (animal instanceof Land) {
			System.out.println("뛰어다닌다!");
		}
	}
	
	
	

}
