package jp03.par06;

import java.io.*;

/*
 * FileName: WriteObjetcFile.java
 * 
 * o ObjectOutputStream을 이용 회원정보를 갖는 UserVO instance 를
 * 	(객체는 상태를 갖는다/ 상태정보를)persistence data(File)로 저장
 * 
 */


public class WriteObjectFile {

	public static void main(String[] args) throws Exception {
		//1.instance 를 File에 저장할 SinkStream :: FileOutputStream 생성
		//2.instance 를 전송하는 FilterStream : ObjectOutputStream 생성
		
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));
		
		oss.writeObject(new UserVO(1,"홍길동")); //==>API확인
		oss.writeObject(new UserVO(2,"홍길순")); //==>API확인
		
		//Stream close()
		oss.close();

	}

}
