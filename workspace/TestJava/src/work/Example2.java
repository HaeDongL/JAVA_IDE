class Example2 
{
	/*
	[1] 1단 ~ 9단을 입력 받아 입력 받은 단수를 출력하는 프로그램
	입력값이 0이하이거나 10이상인 경우 1~9까지의 값을 입력할것을 출력할 것.

	실행예> java Example2 5
			==>실행결과(출력결과..)
			5 단을 출력 합니다.
			1*5 = 5
			2 * 5 = 10 ....
	*/
	public static void main(String[] args) 
	{
		int number = Integer.parseInt(args[0]);
		
		if(args.length != 1){
			System.out.println("입력 인수의 개수가 잘못되었습니다. 1개만 입력하세요.");
			return;
		}

		if(number <= 0 || number >= 10 ){
			System.out.println("1~9까지의 값을 입력할것을 출력할 것.");
		}else {
			System.out.println(number+"단을 출력합니다.");
			for(int i=1; i<=9; i++){
				System.out.println(i+"*"+number+"="+(i*number));
			}
		}
	}
}
