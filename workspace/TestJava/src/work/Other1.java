package jb04.part07.outer;

	/*
		FileName : Other.java
		1.Encapsulation(information hiding)을 지원하는 Access Modifier 이해
		2.public /  / protected/ private 의 사용 및 이해

		o Son은 Father와 같은 package 에 존재하며, 상속관계이다.
		o 주석을 풀고
		==> Compile 시 error를 확인하고, error의 의미 이해
		==> 각 Access Modifier의 접근범위를 확인
	*/

public class  Other1
{

	//Field
	//==> Father를 이해할것
	Father unknown = new Father(); //==> Father 인스턴스 생성

	
	//Constructor
	public Other1(){
		System.out.println(this.unknown.name); //==> public String name = "홍길동";
		//System.out.println(f.bank);			//==>  protected String bank = "한양은행";
		//System.out.println(f.branch);			//==>  String branch = "역삼동지점";
		//System.out.println(f.password);		//==> private int password = 1234;

		//Field(상태정보)는 Method(행위)를 이용 접근

		System.out.println(this.unknown.getBranch());
		System.out.println(unknown.getPassword(0));
	}



}//class

/*
	1.private을 사용하여 다른 class로 부터 상태 정보은닉
	2.method 를 통해 (행위를 통해) 정보은익 여부를 제어
*/
