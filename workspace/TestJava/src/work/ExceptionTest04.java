//package jp02.part02;


/*
	FileName: ExceptionTest02.java

		==> java ExceptionTest 10 20 0 실행시 3번째 인자값이 0 이면 실행시 문제발생
		==> 출력결과(실행시 에러)읽고 출력결과 확인
		==> 해결1. try{}catch로 문제(Exception:: 예외)발생사황 처리, 정상 종료
		==> 해결2. throw로 JVM에서 던지듯 호출한(문제를 발생시킨)곳으로 발생한
		===================================================
		==> 해결3. JVM에서 던지 건, program 내부에서 throw 하던 Exception(예외처리)의 해결책은 try-catch
*/		


public class ExceptionTest04 
{

	///Field
	private int sum;
	private int avg;
	
	
	///Constructor
	public ExceptionTest04(){

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
		avg = sum/z;	//z=0인 경우 불능
		System.out.println("2.==> 평균 : "+avg);
		System.out.println("2.==> avg 끝");
	}

	public static void main(String[] args) 
	{
		
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest04 et = new ExceptionTest04();
		et.sum(i,j);

		// JVM에서 던지 건, program 내부에서 throw 하던 Exception(예외처리)의 해결책은 try-catch

		try{
			et.avg(k);
		//}catch(ArithmeticException e){//현재라인을 주석처리하고 아래를 주석을 풀고 실행하면...
		}catch(Exception e){		//Exception e = new ArithmeticException()은 가능한가? 가능
				System.out.println("1.>>==================================");
				System.out.println("et.avg(k)에서 Exception이 발생한 모양");
				System.out.println("2.>>==================================");
				System.out.println(e);	//System.out.println(e.toStrgin);
				System.out.println("3.>>==================================");
				e.printStackTrace();
				System.out.println("4.>>==================================");

		}
		System.out.println("main Method End...");
	}
}
