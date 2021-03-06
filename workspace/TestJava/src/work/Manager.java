//package jb04.part03;

/*
	FileName: Manager.java
	1.상속(일반화관계)과 생성자의 관계
	2.생성자를 명시적으로 호출하는 this() method 이해
	==> 아래의 예제 실해를 통해 super(), this() / super, this의 역할 및 의미를 이해
*/

class Manager extends Employee

{
	//Field
	int salary;

	//Constructor
	public Manager(){
		System.out.println("Manager의 default Constructor");
	}

	public Manager(String name){
		super(name);
		System.out.println("Manager의 name을 받는 Constructro");
	}
	
	public Manager(String name, String part){
		this(name);
		this.part = part;
		System.out.println("Manager의 name, part을 받는 Constructor");
	}

	public Manager(String name, String part, int age){
		this(name, part);
		this.age = age;
		System.out.println("Manager의 name, part, age을 받는 Constructor");
	}

	public Manager(String name, String part, int age, int salary){
		this(name,part,age);
		this.salary=salary;
		System.out.println("Manager의 name, part, agem salary을 받는 Constructor");
	}

	//Method

	public int salary(){
		System.out.println("Manager의 salary method");
		baseSalary = 200;
		return baseSalary;
	}


	public void callSalary(){
		System.out.println("Empolyee의 기본급은 : "+super.salary());
		System.out.println("Manager의 기본급은2 : "+this.salary());
		System.out.println("Manager의 기본급은1 : "+salary());
	}


	public static void main(String[] args) 
	{
		
		//Manager m1 = new Manager("홍길동");
		
		//Manager m2 = new Manager("홍길동","EJB");
		
		//Manager m3 = new Manager("홍길동","EJB",25);
		
		//Manager m4 = new Manager("홍길동","EJB",25,300);

		//System.out.print("\n");

		//System.out.println("overriding된 salary 호출 : "+m4.salary);

		//m4.callSalary();

		
	}//main
}//class
