//package jb01.part02
/*
 [3] 두수를 입력받고 입력받은수가 짝수, 홀수,3의 배수를 판단하기
 	FileName: Test3.java
 	
 	실행예> java Test3 10 15
 	==>실행결과(출력결과...)(알아서 출력할것)
 	입력하신 1번째 인자값 10은 짝수 이며 3의 배수가아닙니다.
 	입력하신 2번째 인자값 15는 홀수 이며 3의 배수입니다.
 */
public class Sum {
	//main method
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		// 첫번째 인자값
		if(num1 % 2 == 0 && num1 % 3 == 0) {
			System.out.println("입력하신 1번째 인자값 "+num1+"은 짝수 이며 3의 배수입니다 ");
			if(num1 % 3 != 0){
			
			}
				
			
		}else if(num1 % 2 != 0) {
				System.out.println("입력하신 1번째 인자값 "+num1+"은 홀수 이며 3의 배수가아닙니다.");
		}
		
		
		if(num2 % 2 == 0 && num2 % 3 == 0) {
			System.out.println("입력하신 2번째 인자값 "+num2+"은 짝수 이며 3의 배수입니다 ");
			
				
			
		}else if(num2 % 2 != 0) {
				System.out.println("입력하신 2번째 인자값 "+num2+"은 홀수 이며 3의 배수가아닙니다.");
		}
		
	
		
	}
}
