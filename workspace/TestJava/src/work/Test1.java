// [1]: �̸��� ��ȭ��ȣ�� �Է¹ް� ����ϴ� ����
	/*
	 FileName: Test1.java
	 
	 ���࿹ > java Test1 ȫ�浿 011-111-1111 
	 ==> ������(��°��..)
	 "ȫ�浿"���� [hp]��"011-111-1111"�Դϴ�.
	 */
public class Test1 {
	public static void main(String[] args) {
		
		//Class �� ����� �߰��������� (��> java Test1 ȫ�浵 1234)
		System.out.println("\""+args[0]+"\""+"���� [hp]�� \""+args[1]+"\"�Դϴ�");

		
		//==> Java �� primitive data type 8EA
		//==> Java ���� ���ڸ� ��Ÿ���� data type �� String(<== reference data type)
		//==> reference data type �� �豸�� �� primitive data type ó�� ���.
		//==> �Է¹��� ���ڴ� String �̶�� ���������� ����.

		String name = args[0];
		String hp = args[1];
		System.out.println("���� �̸��� \""+name+"\"�Դϴ�.");
		System.out.println("\""+name+"\"�� [hp]�� \""+hp+"\" �Դϴ�.");
		// ���ڸ� �ٷ�� data type �� String(reference data type) : �߿�
	}
}