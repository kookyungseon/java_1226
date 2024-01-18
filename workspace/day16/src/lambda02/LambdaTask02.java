package lambda02;

public class LambdaTask02 {
	public static void main(String[] args) {
		
	 Introduce i = ( name,age) -> System.out.println("이름 : " +name + "\n나이 : " + age);
	 MulNum m = (num1, num2) -> {return num1 * num2;};
	 SubTen s = num1 -> {return num1 -10;};
	
	 String name ="이름";
	 int age = 20;
	 int num1 = 20;
	 int num2= 30;
	 
	 int result1 = m.mulNum(num1, num2);
	 int result2 = s.subTen(num1);
	 
	 i.introduce(name, age);
	 System.out.println(result1);
	 System.out.println(result2);
	 
	}

}
