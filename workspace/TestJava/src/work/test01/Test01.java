class className01
{

}


class className02 extends className01
{

}

class classMode
{

}



public class Test01 
{
	public static void main(String[] args) 
	{
		className01 cn = new className02(); // Polymorphism ���۷��� ����������ȯ

		Object ob = cn; // ���� ������ ����ȯ�� ���� ObjectŸ��

		classMode cm = (classMode)ob;

		className02 cn2 = (className02)cn; //�Ϲ����� ��Ӱ��� ������ ����ȯ
		
		
	}
}