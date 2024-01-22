package object;

public class EqualsTest01 {
	
	public static void main(String[] args) {
		
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		
		System.out.println(str1 == "안녕하세요");
		System.out.println(str1 == str2);
		System.out.println(str1.equals("안녕하세요!!"));
		System.out.println(str1.equals(str2));
		
	}

}
