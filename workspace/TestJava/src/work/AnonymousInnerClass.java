//package jp02.part05
	/*
		FileName: AnonymoutInnerClass.java
		<<AnonymoutInnerClass의 이해>>
		1. class의 이름이 없는 독특한 class
	*/
class A
{
	///Field
	///Constructor
	///Method
	public void abc(String message){
		System.out.println("::"+this.getClass().getName()+"start..");
		System.out.println("::abc() "+message);
		System.out.println("::"+this.getClass().getName()+"end..");
	}


}//class



public class AnonymousInnerClass
{

	//Main Method
	public static void main(String[] args) 
	{
		//1.인스턴스 생성, 식별성으로.. Method 접근
		System.out.println("1.==================");
		A a = new A();
		a.abc("Hello");

		//2.인스턴스 생성 후 바로 Method접근
		System.out.println("2.==================");
		new A().abc("Hello");

		/*=================================
		public class B extends A{
			public void def(String.message){
				System.out.println("::Hi"+message);
			}
		}
		new B().abc("Hello");
		new B().def("Hello");

	===================================*/

	//3.위의 코드를 이해한다면, 아래의 코드는...
	//--> Anonymous(익명,불명: 이름이 없는...)
	System.out.println("3.=============================");

		new A(){
			public void def(String message){
				System.out.println(":: "+this.getClass().getName()+"start..");
				System.out.println("::def() "+message);
				System.out.println(":: "+this.getClass().getName()+"end..");
			}
		}.abc("Hello");

		System.out.println("4.============================");
		new A(){
			public void def(String message){
				System.out.println(":: "+this.getClass().getName()+"start..");
				System.out.println("::def() "+message);
				System.out.println(":: "+this.getClass().getName()+"end..");
			}
		}.def("Hello");


		System.out.println("5.============================");
		new A(){
			public void def(String message){
				System.out.println(":: "+this.getClass().getName()+"start..");
				System.out.println("::def() "+message);
				System.out.println(":: "+this.getClass().getName()+"end..");
			}
		}.def("Hello");


	}
}
