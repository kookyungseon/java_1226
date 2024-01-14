package exam01;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String studentName = sc.nextLine();
		
		System.out.println("나이 입력 : ");
		int studentAge = sc.nextInt();
		
		st.setStudentName(studentName);
		st.setStudnetAge(studentAge);
		
		System.out.println();
		
		System.out.println("학생 이름 : " + st.getStudentName());
		System.out.println("학생 나이 : " + st.getStudnetAge());
		
		

		
		
	}

}
