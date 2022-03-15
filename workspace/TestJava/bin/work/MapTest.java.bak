//package jp01.part09

import java.util.Hashtable;
import java.util.Map;

/*
	FileName: MapTest.java
	
		::java.util.Map : key == value Map 구조의 Data저장 python의 딕셔너리 같은애.
		각각의 Map(interafece)/Hashtable API를 확인하고 각각의 Method 의미를 확인
		아래의 출려결과를 이해 및 확인

*/


public class MapTest 
{
	public static void main(String[] args) 
	{
		Map<String,String> map = new Hashtable<String,String>(); // 컴파일 에러로 알았는데 Map는 직접 안만들어짐..
																// 추상 메소드일수도 있음. 전에 했던 Queue도...

		String key = new String("홍길동");	
		String value = new String("의정");
		map.put(key,value); // 기본 문법??

		map.put("이순신","수군 대장군");
		map.put("주몽","고구려시조");

		String value01 = map.get("주몽");// get메소드에 인자값에 key를 입력하면 value를 반환하는 구조
		System.out.println("주몽 설명 : "+value01);

		if(map.containsKey("이순신")){// 해당 키를 가지고 있는지 에대한 boolean타입의 메소드.
			System.out.println("이순신을 key로 갖는 value가 있으며 value: "+map.get("이순신"));
		}

		if(map.containsKey("김유신")){
			System.out.println("김유신을 key로 갖는 value가 있으며 value: "+map.get("김유신"));
		}

		if(map.containsValue("의적")){// 해당 value를 가지고 있는지 에대한 boolean타입의 메소드.
			System.out.println("의적을 value로 갖는 data가 있습니다.");
		}

		if(map.containsValue("도적")){
			System.out.println("도적을 value로 갖는 data가 있습니다.");
		}
	}
}
