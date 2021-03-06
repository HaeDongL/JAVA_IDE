// [1]: 이름과 전화번호를 입력받고 출력하는 예제
	/*
	 FileName: Test1.java
	 
	 실행예 > java Test1 홍길동 011-111-1111 
	 ==> 실행결과(출력결과..)
	 "홍길동"씨의 [hp]는"011-111-1111"입니다.
	 */
public class Test1 {
	public static void main(String[] args) {
		
		//Class 의 실행시 추가적정보는 (예> java Test1 홍길도 1234)
		System.out.println("\""+args[0]+"\""+"씨의 [hp]는 \""+args[1]+"\"입니다");

		
		//==> Java 의 primitive data type 8EA
		//==> Java 에서 문자를 나타내는 data type 은 String(<== reference data type)
		//==> reference data type 를 배구기 전 primitive data type 처럼 사용.
		//==> 입력받은 문자는 String 이라는 문자형으로 받음.

		String name = args[0];
		String hp = args[1];
		System.out.println("나의 이름은 \""+name+"\"입니다.");
		System.out.println("\""+name+"\"씨 [hp]는 \""+hp+"\" 입니다.");
		// 문자를 다루는 data type 인 String(reference data type) : 중요
	}
}
