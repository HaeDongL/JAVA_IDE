//package jb04.part04;

/*
	FileName: Display.java

*/


class BusCharge
{
	//Field
	String section;
	//Constructor
	public BusCharge(){
	}
	public BusCharge(String str){
	section=str;
	}
	//Method
	public void informatin(){
		System.out.println("버스요금안내");
	}
	public void charge(){
		System.out.println("학생:300, 일반인: 500, 어른신:공짜");
	}


class Student extends BusCharge
{
	public Student(){
		super("학생");
	}
	public void charge(){
		System.out.println("::300원\n");
	}
}

class Adult extends BusCharge

{
	public Adult(){
		super("일반인");
	}
	public void charge(){
		System.out.println("::500원\n");
	}
}

class Old extends BusCharge
{
	public Old(){
		super("어르신");
	}
	public void charge(){
		System.out.println("::공짜\n");
	}
}

}


class Display
{

	public static void main(String[] args) 
	{
		
	}
}
