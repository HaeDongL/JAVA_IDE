
/*
	FileName : Bank.java
	1. abstract.class�� interface(���������)�� �޸� �Ϲ� ���� method�� Field�� ���� �� �ִ�.
*/

public abstract class Bank001 
{
	//Field
	private String name;

	//Constructor
	public Bank001(){

	}

	public Bank001(String name){
		this.name = name;
	}

	///Method
	// ������� ����ϴ� display method �� �߻�Method�� ����
	public abstract void display();
	
	public String getName(){
		return name;
	}
	public void setName(){
		this.name = name;
	}
}