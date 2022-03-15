//package jb04.part03;

/*
	FileName: Manager.java
	1.���(�Ϲ�ȭ����)�� �������� ����
	2.�����ڸ� ���������� ȣ���ϴ� this() method ����
	==> �Ʒ��� ���� ���ظ� ���� super(), this() / super, this�� ���� �� �ǹ̸� ����
*/

class Manager extends Employee

{
	//Field
	int salary;

	//Constructor
	public Manager(){
		System.out.println("Manager�� default Constructor");
	}

	public Manager(String name){
		super(name);
		System.out.println("Manager�� name�� �޴� Constructro");
	}
	
	public Manager(String name, String part){
		this(name);
		this.part = part;
		System.out.println("Manager�� name, part�� �޴� Constructor");
	}

	public Manager(String name, String part, int age){
		this(name, part);
		this.age = age;
		System.out.println("Manager�� name, part, age�� �޴� Constructor");
	}

	public Manager(String name, String part, int age, int salary){
		this(name,part,age);
		this.salary=salary;
		System.out.println("Manager�� name, part, agem salary�� �޴� Constructor");
	}

	//Method

	public int salary(){
		System.out.println("Manager�� salary method");
		baseSalary = 200;
		return baseSalary;
	}


	public void callSalary(){
		System.out.println("Empolyee�� �⺻���� : "+super.salary());
		System.out.println("Manager�� �⺻����2 : "+this.salary());
		System.out.println("Manager�� �⺻����1 : "+salary());
	}


	public static void main(String[] args) 
	{
		
		//Manager m1 = new Manager("ȫ�浿");
		
		//Manager m2 = new Manager("ȫ�浿","EJB");
		
		//Manager m3 = new Manager("ȫ�浿","EJB",25);
		
		//Manager m4 = new Manager("ȫ�浿","EJB",25,300);

		//System.out.print("\n");

		//System.out.println("overriding�� salary ȣ�� : "+m4.salary);

		//m4.callSalary();

		
	}//main
}//class