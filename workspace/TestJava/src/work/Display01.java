
//5번째 프린트
/*
	FileName:Display01.java
		1.busCharge.class의 charge() Method 사용유무는?
		2.하위 클래스(Student.Adult.Old)에서 charge() Method 가 OverRiding 않는다면?
		/////////////////////////////////////////////////////////////////////
		
		==> abstract Method / abstract class 의 필요성
		o abstract Method
			: 구체적일 필요가 없는 Method
			: 하위클래스에서 구체적으로 재정의(OverRiding)해야하는 강제성을 갖는 Method
		o abstract class
			: 구체적이지 않은 abstract Method가 정의된 클래스
			: 일반화의 관계중 공통적, 일반적 행위와 속성을 공유를 목적으로 정의된 클래스
			==> abstract class는 instance 생성 할 수 없다.:: 중요중요<==
		/////////////////////////////////////////////////////////////////////
*/
abstract class BusCharge
{
	///Field
	String section;
	///Constructor;
	public BusCharge(){
	}
	public BusCharge(String section){
		this.section = section;
	}
	///method
	public void information(){
		System.out.println("버스요금안내");
	}

	//==> 사용되지 않으며, 하위클래스에 OverRiding을 강제하는 추상메소드 정의

	//public void charge(){
	//	System.out.println("학생:300,일반인:500,어르신:공짜");
	//}
	public abstract void charge();
}//class

//abstract class 상속시 abstract method 필히 재정의(OverRiding)해야함 <== 강제성

class Student extends BusCharge
{
	public Student(){
		super("학생");
	}
	//==> 아래의 Method 주석처리하고 컴파일시... 컴파일 에러를 확인하자

	public void charge(){
		System.out.println("300원");
	}
}//class

class Adult extends BusCharge{

	public Adult(){
		super("어른");
	}
	public void charge(){
		System.out.println("500원");
	}

}//class

//abstract class 상속시 abstract method 필히 재정의 (OverRiding)해야함 <==강제성

class Old extends BusCharge
{
	public Old(){
		super("어르신");
	}
	public void charge(){
		System.out.println("공짜");
	}
}//class

public class Display01
{	
	///Main Method

	public static void main(String[] args) 
	{
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information();
		System.out.println(b1.section);
		b1.charge();// 어떤 클래스의 Method를 호출되었는지 확인하자.

		b2.information();
		System.out.println(b2.section);
		b2.charge();// 어떤 클래스의 Method를 호출되었는지 확인하자.

		b3.information();
		System.out.println(b3.section);
		b3.charge();// 어떤 클래스의 Method를 호출되었는지 확인하자.

		//==> 아래의 주석을 차례로 풀어 컴파일 에러를 확인하자.
		//==>1. abstract class는 객체는 생성 불가
		// BusCharge bc01 = new BusCharge();

		//==>2. 객체생성은 불가하나, 변수의 선언 (Data Type)은 가능하다.
		//BusCharge.bc02
	}//main
}//class
