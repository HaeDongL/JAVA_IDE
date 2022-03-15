//package jb05.part03;

/*
	FileName: ModifierTest01.java

	1.ModifierTest01, ModiFierTest02, ModiFierTest03, ModiFierTest04을 통해
	class 구현시 modifier / Access Modifier 어떻게 활용, 응용되는 지 살펴 보면...
	2.TopSecret01.class 를 Access Modifier, Modifier로 어떻게 변경시키는지를 이해
*/

class TopSecret01
{

	///Field
	int secretNo = 7777;

	///Constructor
	public TopSecret01(){

	}

	///Method
	//getter Method
	public int getSecretNo(){
		return secretNo;
	}

}///end of class


public class ModifierTest01 
{

	/// main Method
	public static void main(String[] args) 
	{
		
		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.getSecretNo());

	}// end of main
}// end of class

/*
	TopSecret.class의 문제점
	o: secretNo는 중요한 attribute이다 그러나 누구나 접근및 변경이 가능
*/