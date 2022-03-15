//package jp02.part02;

/*
	FileName: ExceptionTest02.java

		==> java ExceptionTest 10 20 0 실행시 3번째 인자값이 0 이면 실행시 문제발생
		==> 출력결과(실행시 에러)읽고 출력결과 확인
		=======================================================
		==> 해결 1.try{}catch()로 문제(Exception::예외)발생사황 처리, 정상 종료

*/

public class ExceptionTest02
{
		///Field
		private int sum;
		private int avg;
		///Constructor
		public ExceptionTest02(){
		}

		///Method
		public vod sum(int x,int y){
			System.out.println("1.==> sum 시작.");
			sum = x + y;
			System.out.println("1.==> 합: "+sum);
		}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
