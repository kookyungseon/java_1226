package arrayList;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(20);
		
		System.out.println(al);

				
//		System.out.println(al[0]);ArrayList 에서 안됨
		System.out.println(al.get(0)); //객체명.get(i) 값을 출력할 수 있음
		
		int[] arr1 = {1,2,3,4};
//		for(int i =0 ; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		System.out.println(arr1[0]+10);
		
		
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		ArrayList li = new ArrayList();
		li.add(1);
		li.add(0.1);
		li.add('a');
		li.add("java");
		
		System.out.println(li);
		
//		System.out.println(li.get(0)+1); ArrayList의 요소를 값으로서 활용할 수 없다 
		Integer num1 = (Integer)li.get(0); //다운캐스팅
		
//		<E> <Element> : 제네릭 (Generic)
		ArrayList<Integer> li2 = new ArrayList<>();
		
		
		for(int i=0; i <10 ; i++) {
			li2.add(i);
		}
	
		System.out.println(li2);
		System.out.println(li2.size());
		
		Integer num2 = li2.get(0);

		
//		향상된 for문, for - each
		for(int data : li2) { //auto unboxing
			System.out.println(data +10);
		}
		
		System.out.println(li2.toString());
		
		
	}

}
