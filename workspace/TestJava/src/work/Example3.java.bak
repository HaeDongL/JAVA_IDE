//package jb02.part02;

	/*
	[2]두수를 입력 받고 두사이의 값의 합을 구하기

	실행예> java Example3 1 10
	==> 실행결과 (출력결과...)
		1~10의 합은 55입니다.
		<<java Example3 10 1 인경우도 위와 같이 출력>>
		<<java Example3 10 10으로 입력될 경우>>
		입력값이 같습니다 [usage]:: 어쩌구 저쩌구
	*/

class Example3 
{	//main method
	public static void main(String[] args) 
	{
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		// 변수 값 스위칭
		int sum = 0;
		int temp;
		
		if(number1 != number2){

			if(number1 > number2){
				temp = number1;
				number1 = number2;
				number2 = temp;
			}

			for(int i=number1; i<=number2; i++){
				sum += i;
			}
			

			System.out.println(number1+"~"+number2+"합은"+sum+"입니다.");
		}else {
			System.out.println("입력값이 같습니다 [usage]:: 다시 입력하세요.");
		}

		
		
			
		


	
		
		
			
		

		
		

	}
}

