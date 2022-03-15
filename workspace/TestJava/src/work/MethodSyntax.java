//package jb03.part04;

/*
	FileName : MethodSyntax.java
	1.OOP	 : Message
	2.OOPL	 : Method
	o 객체간의 행위를 정의 하는 Method 문법
	o OPP에서 Message (Method)란 객체간 data를 전달 또는 바을 수 있는 수단.
	o OOP는 객체와 객체간 통신은 method 호출
*/

class MethodSyntax 
{
	//Field
	String name = "홍길동";
	String add = "한양";

	//Method
	//=> 브라우저를 켜는 행위정의
	public void browerOn(){
		System.out.println("brower를 켜다");
	}

	//==> 작업을 하고 작업유무를 boolean type 으로 return하는 행위
	public boolean documentWork(){
		System.out.println("document작업을 하고 작업완성 유무를 boolean return");
		return true;
	}
	//==> 두개의 정수를 받아 합을 return 하는 행위
	public int sum(int i, int j){
		System.out.println("<<"+i+">> 와 <<"+j+">>값을 받아 합 return");
		return (i+j);
	}

	//==> 이름을 return 하는 행위
	public String getName(){
		System.out.println("이름을 전달합니다.");
		return name;
	}
	//==> 주소를 retrun 하는 행위
	public  String getAdd(){
		System.out.println("주소를 전달합니다.");
		return add;
	}
	//==> 이름, 주소 두가지 정보(상태값)를 Array DataType return 하는 행위
	public String[] getAllInformation(){
		String[] str = {name, add};
		//String[] str = {"홍길동", "한양"};
		return str;
	}
}//class
