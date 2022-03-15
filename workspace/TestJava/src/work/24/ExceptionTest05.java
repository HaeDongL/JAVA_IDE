//package jp02.part02;

/*
*	 FileName : ExceptionTest05.java
*
*       ==>  java ExceptionTest 10 20 0 실행시 3번째 인자값이 0이면 실행시 문제발생
*       ==> 출력결과(실행시 에러)읽고 출력결과 확인
*       ==> 해결1. try{}catch()로 문제(Exception::예외)발생사황 처리, 정상 종료
*  		==> 해결 2. throws 로 JVM에서 던지듯 호출한(문제를 발생시킨)곳으로 발생한
*                          Exception 을 던진다(? , 위임). (어디로  : 호출한 곳(문제 유발한 곳))
*      ==> 해결 3. JVM에서 던지 건, program 내부에서 throws 하던 Exception(예외처리)의
*                          해결책은 try-catch
* ============================================
*     ==> main()에서 throws 를 사용했다 의미가 있는가? 
*     ==> main 은 누가 호출하여 java application 을 실행 시키는가 ? 
*/
public class ExceptionTest05{	
	
	///Field
	private int sum;
	private int avg;
	
	///Constructor	
	public ExceptionTest05(){
	}
	
	///Method
	public void sum(int x,int y){
		System.out.println("1.==> sum 시작");
		sum = x + y;
		System.out.println("1.==> 합 : "+sum);
		System.out.println("1.==>  sum 끝");
	}
	//JVM에서 던진 ArithmethicException을 다시 자신을 호출한 곳으로 던진(?, 위임)다
	 public void avg(int z) throws ArithmeticException{
		System.out.println("2.==> avg 시작");
		avg = sum / z;  		//z = 0 인경우 불능
		System.out.println("2.==>평군 : "+avg);
		System.out.println("2.==> avg 끝");
	  }
	
	///main method
	// main method 에서 try-catch 처리 않고 JVM에서와 같이 throws Exception
	// 을 던지고 있다 결과는 ????
	public static void main(String[] args) throws Exception{
		
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		
		ExceptionTest05 et = new ExceptionTest05();
		et.sum(i,j);
		et.avg(k);

		System.out.println("main Method End....");
		
  }//end of main
	
}//end of class