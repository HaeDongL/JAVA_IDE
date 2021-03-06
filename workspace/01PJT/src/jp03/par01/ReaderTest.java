package jp03.par01;

/*
 * FileName: ReaderTest.java
 * 
 * 1.java.io package : 프로그램 외부로 자원을 받거나(?), 전달(?)경우에 사용
 * 2.keyboard로 부터 data를 읽어 들이면...
 * 
 * ===================================================
 * InputStream은 한글처리(2byte)가 되지 않는다.
 * 문자를 처리하는 Reader 계열로 바꾸면...
 */

import java.io.*;
public class ReaderTest {
	
	public static void main(String[] args) {
	try {
		
		//InputStream::표준 입력장치를 추상화 한 class
		InputStream inputStream = System.in;
		//InputStream을 Reader로 변경 (Byte처리 ==> 문자처리 변경)
		Reader reader = new InputStreamReader(inputStream);
		
		System.out.println("입력을 기다립니다....");
		
		//값을 읽어드리는 무한 loop를 시작
		
		while(true) {
			
			//1.java.io 는 지연(block)될수 있다.
			int i = inputStream.read();
			char c = (char)i;
			
			//2.java.io 는 FIFO 구조 => Queue
			System.out.println("입력하신 값 : "+c);
			
			//==> char 'x'가 입력되면 while 종료
			if(c=='x'){
				inputStream.close();
				break;
			}
			
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}	
}


