

/*
	FileName : CallByValueTest.java
		1. primitive type variable : Method ���� ==> Call By Value
		2. �������� �����ϰ�, �ڵ��Ͽ� ������� Ȯ�� : Call By Value; ����
*/
public class CallByValueTest
{

	///Field
	int number = 100;
	
	///Constructor
	public CallByValueTest(){
	}

	///Method
	public void valueChange(int value){
		System.out.println("========================");
		value = value + 100;
		System.out.println("value: "+value);
		System.out.println("========================");
	}
	///Main Method
	public static void main(String[] args) 
	{
		CallByValueTest call = new CallByValueTest();

		//method �� ���� ������ int(primitive DataType)
		call.valueChange(call.number);
		System.out.println("number: "+call.number);
	}//end of main
}/// end of class