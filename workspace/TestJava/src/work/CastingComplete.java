//package jb05.part06;

/*
	FileName : CastionComplet.java
	1. Primitive Type 형변환(묵시적/명시적): data 의 크기
	2. Reference Type 형변환(묵시적/명시적): 개념의 크기(추상화정도)
		: 중요, 중요 : 객체의 형변환 조건 : ~~ is a ~~ Relationship
*/

//상위 class Super정의

class Super
{
	///Method
	public void a(){
		System.out.println("Super : a()");
	}
}//end of class

//상위 class Spuer를 상속 받는 하위 class Sub 정의
class Sub extends Super
{
	///Method

	public void a(){
		System.out.println("overriding된 Sub:a()");
	}

	public void b(){
		System.out.println("sub:b()");
	}
}//end of class

//상위 class Super를 상속 받는 하위 class Sub 정의


public class CastingComplete
{	

	///Main Method
	public static void main(String[] args) 
	{
		//하나 : 상위 class 인스턴스 생성(Data type == 인스턴스 의 경우)
		System.out.println("\n여기는 Super s1 = new Super()부분");
		Super s1 = new Super();

		//두울 : 하위 class 인스턴스 생성(Data type == 인스턴스의 경우)
		System.out.println("\n여기는 Sub s2 = new Sub()부분");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		//세엣 : 상위 data type 으로 하위 인스턴스 생성(Data type != 인스턴스)

		System.out.println("\n여기는 Super s3 = new Sub()부분");
		Super s3 = new Sub();
		s3.a();// 형변환이 일어나서 Super클래스의 인스턴스가 생성이되어 하위클래스의
				//b()를 사용하지 못하게된것.
		//아래의 사항은 error가 발생한다 s3는 b90를 참조할수 없다.(꼭 이해);

		//s3.a()를 사용하려면 ==>casting 연산자 사용(즉 자원의 원상태복귀(?)) a 아니고 b같음

		System.out.println("\n는 b()에 접근 불가하다.");
		System.out.println("casting 연산자를 이용 Sub sub = (Sub)s3 명시적 형변환");
		Sub sub = (Sub)s3;
		sub.b();

		//네엣 : 하위 data type으로 상위 인스턴스 생성 (Data type != 인스턴스)
		//error 부위 (하위래퍼런스변수는 상위인스턴스를 레퍼런스할 수 없다.) 아래
		//Sub s4 = new Super();

	

	}
}
