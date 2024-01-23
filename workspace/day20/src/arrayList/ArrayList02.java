package arrayList;

import java.util.ArrayList;

public class ArrayList02 {
	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		
//		추가
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		System.out.println(li);
//		값 가져오기
		System.out.println(li.get(1));
//		System.out.println(li.get(10)); 인덱스 범위 넘으면 오류 발생
		
		
//		삭제 : index 번호로 삭제 => int 타입을 인수
//		li.remove(1);
//		System.out.println(li);
		System.out.println(li.remove(1)+10); // 값처럼 사용 가능하다
		System.out.println(li);
		
//		삭제 : 값으로 검색해서 삭제 => Object 타입을 인수 
//		삭제 성공여부를 bloolean타입으로 반환함
		System.out.println(li.remove(Integer.valueOf(10)));
		System.out.println(li);
		
//		수정 :수정할 인덱스, 값 넘겨주어야 한다 
//		수정되기 전의 값을 반환
		System.out.println(li.set(0, 100));
		System.out.println(li);
		
//		포함여부 검사 : 리스트에 존재하면 true 없으면 false 반환
		System.out.println(li.contains(100));
		System.out.println(li.contains(1000));
		
//		전체삭제
		li.clear();
		System.out.println(li);
	}

}
