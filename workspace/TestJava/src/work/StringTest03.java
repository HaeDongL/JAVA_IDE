//package jb01.part03;

/*
	FileName: StringTest03.java
	==> 각각의 method 를 API에 확인하고, 출력결과를 확인

*/


public class StringTest03 
{
	//Main Method
	public static void main(String[] args) 
	{
		String name = "012ABCdef";
		String hi = "Hi !";

		String s1 = hi.concat(name);
		System.out.println(s1);

		String s2 = s1.substring(7);//7번째 문자열 이후 문자 출력
		System.out.println(s2);

		int a = name.indexOf("ABC");
		System.out.println(a);
		System.out.println(name.substring(a));

		int b = name.indexOf("ABC");
		System.out.println(b);
		System.out.println(name.substring(b));
		System.out.println(name.substring(b,5));

		int c = name.indexOf("z");
		System.out.println(c);
	}//end of main
}// end of class
