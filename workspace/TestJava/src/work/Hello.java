//package jb01.part02;

/*
  FileName : Hello.java
 */
public class Hello 
{
	//==> 1�� �ּ� : �����Ͻ� �ּ����� �����Ͻ� ����
	//java ���࿡ �ʿ��� method : main method
	public static void main(String[] args) {
		System.out.println("Hello Java :: �ȳ� �ڹ�");
	}// end for main
} // end for class

/* ==> ���ٹ� �ּ� : �����Ͻ� ����
 
 	<<���ǻ��� �� ��ӻ���>>
 		1. class name �� file name�� �����ؾ� �Ѵ�
 		��)public class Hello �� => Hello.java(File Name)
 		2. ��ҹ��ڸ� ����
 		3. ����� public static void main(String[] args) �ʿ�
 		4. System.out.println(~~~); ==> ~~~Console ���
 		5. Hello.java ������ �� Hello.class(ByteCode) ���� Ȯ��
 		
 	<<Console(DOSȭ��)���� compile & run>>
 	1. File save
 		o FileName : Hello.java ==> FileName�� ClassName�� ����
 		
 	2. Compile
 		1) file���� directory�� �̵� �� compile ==> javac Ȯ���� ���� FileName
 		2) classFile���� Ȯ�� ==> byte code ����Ȯ�� (Hello.class)
 			c:\work>dir
 	
 	3. ����
 		3) run ==> java Ȯ���ڸ� ������ FileName
 			c:\work>java Hello
 			
 		<< EditPlus ȯ�漳��: ������ �������ϱ�>>
 		==>����/�������������� ����� �� ����
 */