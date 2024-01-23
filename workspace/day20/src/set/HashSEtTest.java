package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSEtTest {
	public static void main(String[] args) {
		
//		HashSet
		HashSet<String> animalSet = new HashSet<>();
		animalSet.add("코알라");
		animalSet.add("사자");
		animalSet.add("기린");
		animalSet.add("고양이");
		animalSet.add("고양이");
		animalSet.add("고양이"); //중복값 무시
		
		System.out.println(animalSet);
		
		Iterator<String> animalIter = animalSet.iterator();
		System.out.println(animalIter.hasNext());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		System.out.println(animalIter.hasNext());
	
		
	}

}
