/*
 	[2]: 두수를 입력받고 두수를 비교하여 더하기/빼기 예제
 	첫번째인수가 크면 빼고 / 적으면 더하기
 	FileName : Test2.java
 	
 	실행예> java Test2 2 1
 	==>실행결과(출력결과..)
 	첫번째인수:2, 두번째인수:1, 2-1=1입니다.
 	
 	실행예> java Test2 1 2
 	첫번째인수:1, 두번째인수:2, 1+2=3입니다.
 	
 */
public class Test2 {
	//main method
	public static void main(String[] args) {
		
		int num1 =  Integer.parseInt(args[0]);
		int num2 =  Integer.parseInt(args[1]);

		if(num1>num2) {
			System.out.println("첫번째 인수: "+num1+", 두분째 인수: "+num2+", "+num1+"-"+num2+"="+(num1-num2));
		}else if(num1<num2) {
			System.out.println("첫번째 인수: "+num1+", 두분째 인수: "+num2+", "+num1+"+"+num2+"="+(num1+num2));
		}
		
	}
}
