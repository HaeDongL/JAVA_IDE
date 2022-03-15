class Human
{//02.21
	///Field
	private String name;
	private int age;
	//Constructor
	public Human(){

	}

	public Human(String name){
		this.name = name;
	}
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}

	///Method
	public void print(){
		System.out.println("이름 : "+this.name+"\t나이 : "+this.age);
	}

	public String getName(){
		return  this.name;
	}

	public int getAge(){
		return this.age;
	}
}


class Student extends Human
{
	///Field
	private int id;

	///Constructor
	public Student(){
	}

	public Student(String name){
		super(name);
	}
	
	public Student(String name, int age){
		super(name,age);
	}
	
	public Student(String name, int age, int id){
		super(name,age);
		this.id = id;
	}

	///Method
	public String getSubject(){
		return this.subject;
	}

	public void print(){
		System.out.println("이름 : "+getName()+"\t나이 : "+getAge()+"\t학    번 : "+this.id);
	}
	public int getId(){
		return this.id;
	}

}

class Teacher extends Human
{	
	///Field
	private String subject;

	///Constructor
	public Teacher(){
	}

	public Teacher(String name){
		super(name);
	}

	public Teacher(String name, int age){
		super(name,age);
	}

	public Teacher(String name, int age, String subject){
		super(name,age);
		this.subject = subject;
	}

	///Method
	public String getSubject(){
		return this.subject;
	}

	public void print(){
		System.out.println("이름 : "+getName()+"\t나이 : "+getAge()+"\t담당과목 : "+this.subject); 
	}
	
}

class Employee extends Human
{
	///Field
	private String dept;

	///Constructor
	public Employee(){
	}

	public Employee(String name){
		super(name);
	}

	public Employee(String name, int age){
		super(name,age);
	}

	public Employee(String name, int age, String dept){
		super(name,age);
		this.dept = dept;
	}

	///Method
	public String getDept(){
		return this.dept;
	}	

	public void print(){
		System.out.println("이름 : "+getName()+"\t나이 : "+getAge()+"\t부    서 : "+this.dept);
	}
	
}


public class Prob13
{


	public static void main(String[] args) 
	{
		Student s = new Student("홍길동",20,200201);
		Teacher t = new Teacher("이순신",30,"JAVA");
		Employee e = new Employee("유관순",40,"교무과");

		s.print();
		t.print();
		e.print();
	}
}

