package jp03.par06;

import java.io.*;

/*
 * FileName: ReadObjectFile.java
 * 
 * o ObjectInputStream을 Persistence data (file)에 저장된
 * 	 회원정보를 갖는 UserVO instance륽(객체는 상태를 잦는다/상태정보를)읽어온다.
 * 
 * 
 */


public class ReadObjectFile {
	
	//main Method
	
	public static void main(String[] args)throws Exception {
		//1.instance 를 File에 저장할 SinkStream :: FileOutputStream 생성
		//2.instance 를 전송하는 FilterStream : ObjectOutputStream 생성
				
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserInfo.obj"));
		
		UserVO user01 = (UserVO)ois.readObject();
		UserVO user02 = (UserVO)ois.readObject();
		
		System.out.println("1번째 회원정보 :: "+user01);
		System.out.println("2번째 회원정보 :: "+user02);
		
		//Stream close()
		ois.close();

	}

}
