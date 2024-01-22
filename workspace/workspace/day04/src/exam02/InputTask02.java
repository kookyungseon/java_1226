package exam02;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
		
//		이름을 입력해 주세요 :
//		000님 안녕하세요
//		000님 안녕히가세요
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.next();
		
		System.out.println(name + "님 안녕하세요");
		System.out.println(name + "님 안녕히가세요");
		
		System.out.println("입력 >>>");
		System.out.println(sc.next());
		System.out.println(sc.next());
		
		
	}

}
