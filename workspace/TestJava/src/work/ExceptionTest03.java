/*
	FileName: ExceptionTest02.java

		==> java ExceptionTest 10 20 0 실행시 3번째 인자값이 0 이면 실행시 문제발생
		==> 출력결과(실행시 에러)읽고 출력결과 확인
		==> 해결1. try{}catch로 문제(Exception:: 예외)발생사황 처리, 정상 종료
		===================================================
		==> 해결2. throw로 JVM에서 던지듯 호출한(문제를 발생시킨)곳으로 발생한
				Exception을 던진다(?, 위임).(어디로 : 호출한 곳(문제 유발한 곳))
*/


public class ExceptionTest03 
{

	///Field
	private int sum;
	private int avg;
	
	
	///Constructor
	public ExceptionTest03(){

	}
	///Method
	public void sum(int x, int y){
		System.out.println("1.==> sum 시작");
		sum = x + y;
		System.out.println("1.==> 합 : "+sum);
		System.out.println("1.==> sum 끝");
	}


	//JVM에서 던진 ArithmeticException을 다시 자신을 호출한 곳으로 던진(?, 위임)다.

	public void avg(int z)throws ArithmeticException{
		System.out.println("2.==> avg 시작");
		//z=0인 경우 불능
		avg = sum/z;
		System.out.println("2.==> 평균 : "+avg);
		System.out.println("2.==> avg 끝");
	}

	//main method

	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest03 et = new ExceptionTest03();
		et.sum(i,j);
		//==> 어떤 Exception이 발생하는지 확인하자.
		et.avg(k);

		System.out.println("main Method End...");
	}
}
