//package jp01.part09;

import java.util.HashSet;
import java.util.Set;

/*
	FileName : SetTest

	::java.util.HashSet : data의 중복을 허용하지 않는 자료저장
		각각의 Set(interface)/ HashSetAPI를 확인하고 각각의 Method 의미을 확인
		아래의 출력겨로가를 이해 및 확인

*/

public class SetTest 
{
	
	public static void main(String[] args) 
	{
		Set<String>hs = new HashSet<String>();
		
		String str = new String("A");
		boolean isAddOk = hs.add(str); // 중복되지 않은 데이터를 저장하고 boolean타입의 true를 반환?
		System.out.println("저장유무 : "+isAddOk);

		isAddOk = hs.add("b");
		System.out.println("저장유무 : "+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("저장유무 : "+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("저장유무 : "+isAddOk);// 만약 값이 중복된 자료라면 저장하지 않고 false를 반환하는거 같음.

		System.out.println("저장된 data 갯수 : "+hs.size());

		if(hs.contains("b")){ // contains는 해당 데이터를 가지고 있는지 판별하는 boolean타입의 메소드
			System.out.println("저장된 data b를 삭제함.");
			hs.remove("b");
		}
		System.out.println("저장된 data 갯수 : "+hs.size());
	}
}
