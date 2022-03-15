package jp03.par03;

import java.io.*;

/*
 * FileName : FileInputStreamTest
 * 
 */

public class FileInputStreamTest {

	public static void main(String[] args) {
		///File을 읽어 들이는 Strema 선언
		FileInputStream fis = null;
		//read() 수 count 위한 변수
		Writer writer = new OutputStreamWriter(System.out);
		
		int readCount=0;
		
		try {
			fis = new FileInputStream(args[0]);
			
			while(true) {
				int i = fis.read();
				
				if(i==-1) {//-1의 의미는 ==> API확인 할 것.
					break;
				}
				
				//char c = (char)i;
				//System.out.print(c);
				writer.wait(i);
				
				readCount++;
			
			}
			
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}finally {
			System.out.println("\n\n=========================================");
			System.out.println("=======>> read횟수 readCount: "+readCount);
			System.out.println("\n\n=========================================");
			try {
				if(fis!=null) {
				fis.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
