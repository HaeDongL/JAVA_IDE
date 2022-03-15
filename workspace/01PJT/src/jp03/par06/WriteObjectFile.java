package jp03.par06;

import java.io.*;

/*
 * FileName: WriteObjetcFile.java
 * 
 * o ObjectOutputStream�� �̿� ȸ�������� ���� UserVO instance ��
 * 	(��ü�� ���¸� ���´�/ ����������)persistence data(File)�� ����
 * 
 */


public class WriteObjectFile {

	public static void main(String[] args) throws Exception {
		//1.instance �� File�� ������ SinkStream :: FileOutputStream ����
		//2.instance �� �����ϴ� FilterStream : ObjectOutputStream ����
		
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));
		
		oss.writeObject(new UserVO(1,"ȫ�浿")); //==>APIȮ��
		oss.writeObject(new UserVO(2,"ȫ���")); //==>APIȮ��
		
		//Stream close()
		oss.close();

	}

}