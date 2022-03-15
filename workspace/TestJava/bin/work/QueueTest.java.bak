//package jp01.part09;
import java.util.LinkedList;
import java.util.Queue;
/*
	FileName: QueueTest.java

	::Java.util.Queue: First In First Out
		각각의 Queue(interface) / LinkedList를 확인, 각각의 Method 의미 확인
		아래의 출력결과를 이해 및 확인

*/


public class QueueTest 
{
	public static void main(String[] args) 
	{
		Queue<String> queue = new LinkedList<String>(); // LinkedList는 Queue에 상속되어있다.

		String value = new String("1: 홍길동");
		queue.offer(value);
		queue.offer(new String("2:이순신"));
		queue.offer("3:주몽");

		String str1 = (String)queue.poll();//가장 먼저 들어온 데이터를 내보내면서 데이터를전달.
		System.out.println(str1);

		String str2 = (String)queue.peek(); //==> poll(),peek()의 차이점은...
		System.out.println(str2);		// 데이터를 내보내진 않음.

		//==>peek()이 null을 return하는 시점은.../ null을 return 하는 시점을 이용 반복문...
		while(queue.peek() != null){// 지금 현재 데이터가 널이 아니라면 이라는뜻.
			String str3 = (String)queue.poll();
			System.out.println(str3);
		}
	}
}
