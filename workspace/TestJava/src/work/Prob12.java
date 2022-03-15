class Student
{//02.21
	///Field
	private String name;
	private int age;
	private int id;

	///Constructor
	public Student(){
	}

	public Student(String name){
		this.name = name;
	}
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}

	///Method
	public void print(){
		System.out.println("이름 : "+this.name+"\t나이 : "+this.age+"\t학    번 : "+this.id);
	}

	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public int getId(){
		return this.id;
	}

}

class Teacher
{	
	///Field
	private String name;
	private int age;
	private String subject;

	///Constructor
	public Teacher(){
	}

	public Teacher(String name){
		this.name = name;
	}

	public Teacher(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Teacher(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	///Method
	public void print(){
		System.out.println("이름 : "+this.name+"\t나이 : "+this.age+"\t담당과목 : "+this.subject); 
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getSubject(){
		return this.subject;
	}
}

class Employee
{
	///Field
	private String name;
	private int age;
	private String dept;

	///Constructor
	public Employee(){
	}

	public Employee(String name){
		this.name = name;
	}

	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, String dept){
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	///Method
	public void print(){
		System.out.println("이름 : "+this.name+"\t나이 : "+this.age+"\t부    서 : "+this.dept);
	}

	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getDept(){
		return this.dept;
	}
}


public class Prob12 
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
