import java.util.*;

public class StackTest
{

	/*
		FileName: StackTest.java
		
		::java.util.Stack (Last in First Out)
		각각의 API를 확인하고 각각의 Method의미를 확인
		아래의 출력결과를 이해 및 확인
	*/

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<String>();

		String value = new String("1: 홍길동");
		stack.push(value);
		stack.push(new String("2.:이순신"));
		stack.push("3.주몽");

		System.out.println("==> 저장된 Data 갯수 : "+stack.size());
		String str1 = stack.pop(); // 데이터를 밖으로 내보냄
		System.out.println(str1);

		System.out.println("==> 저장된 Data 갯수 : "+stack.size());
		String str2 = stack.peek(); // ==> pop(), peek()의 차이점...
		System.out.println(str2);	// 데이터를 밖으로 내보내지 않고 값만 전달...

		System.out.println("==> 저장된 Data 갯수 : "+stack.size());
		while(!stack.isEmpty()){ // 비어있는지 확인하는 boolean형의 메소드인거 같음.
			String str3 = (String)stack.pop(); // 데이터를 내보내면서 출력함.
			System.out.println(str3);
		}
	}
}
