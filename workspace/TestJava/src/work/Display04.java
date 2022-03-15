//package jb06.part05.test03;

/*
	FileName: Display04
	1.busCharge.class�� charge() Method ���������?
		2.���� Ŭ����(Student.Adult.Old)���� charge() Method �� OverRiding �ʴ´ٸ�?
		/////////////////////////////////////////////////////////////////////
		
		<<< interface >>>
			:abstract method ���� (��ɸ� �������� class /pure abstract class)
			 ���(method)�� ���� ����(����)class ���� O/R ����
			:�ν��Ͻ� �����Ұ� (�߻�Ŭ������ �ν��Ͻ� �����Ұ��� ���� �ǹ�)
			SPEC�� ������� ������ ���̸�,
			������ ����� SPEC�� ������ ����ü(���� ��ü)�� ���
		/////////////////////////////////////////////////////////////////////
*/



class BusCharge
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
		System.out.println("������ݾȳ�");
	}

}//class


//charge()�� ������ interface
//==>����� ������(��ɸ� �����Ͽ� �����Ѵٸ�...): ����ö,�װ�,�ý�,��ݿ��� ��밡��.

interface Fee
{
	public void charge();
}

// interface ������ abstract Method ���� ������ (OverRiding)�ؾ��� <== ������
class Student extends BusCharge	implements Fee
{
	public Student(){
		super("�л�");
	}

	//==> �߷��� Method�� �ּ�ó���ϰ� �������غ���... ������ Ȯ���� ����.
	public void charge(){
		System.out.println("300��");
	}
}//class

// interface ������ abstract Method ���� ������ (OverRiding)�ؾ��� <== ������
class Adult extends BusCharge{

	public Adult(){
		super("�Ϲ���");
	}
	public void charge(){
		System.out.println("500��");
	}

}//class


// interface ������ abstract Method ���� ������ (OverRiding)�ؾ��� <== ������
class Old extends BusCharge
{
	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println("��¥");
	}
}//class


public class Display04 
{		//main
	public static void main(String[] args) 
	{	
		
///		<<����1>> �Ʒ��� ������ ���� ���� ��µȴ�.
		BusCharge bc1 = new Student();
		Adult bc2 = new Adult();
		Old bc3 = new Old();

		
		bc1.information();
		System.out.println(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();

		
		
		//<<����2>> �Ʒ��� �������� ���� �߻� :: �����Ͻ� ����
		// �ϳ� : ������ �߻��� ����
		// �ο� : ������ �ذ��Ͽ� ����� �ɼ� �ֵ��� ������ �����Ұ�
		//==> ��Ʈ : castingComplete.java�� ����°�� �������� / casting �����ڸ� ����� ������??

		
		Fee[] fee = new Fee[3];
		fee[0] = new Student();
		fee[1] = new Adult();
		fee[2] = new Old();

	
		for(int i=0; i<fee.length; i++){
			fee[i].information();
			System.out.print(fee[i].section);
			fee[i].charge();
		}

	}//main
}