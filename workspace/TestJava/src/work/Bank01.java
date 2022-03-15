//<<<<<<<<<<<<<<<<<< 실습전샘플 >>>>>>>>>>>>>>>>>>>>>>>>>>>
/*
	<예제> Bank01.java를 만들고
	실행 예> java Bank01 홍길동 한미은행

	<<출력결과>>
		홍길동님의 주거래은행은 한미은행입니다.
		현재 금액은 0원입니다.

	==>실행시 인자를 4EA를 주면
	실행 예>java Bank01 홍길동 하나은행 1 1000
	
	<<출력결과>>
		홍길동님의 주거래은해응ㄴ 하나은행이며
		1000원 입금함.
		현재금액은 1000원 입니다.
*/

class Bank01 
{
	public static void main(String[] args) 
	{
		if(args.length == 2){
			Bank bank = new Bank(args[0],args[1]);
		}else if(args.length == 4){
			Bank bank = new Bank(args[0],args[1],args[2],args[3]);
		}else {
			System.out.println("인자값은 2개/4개만 넣으세요.");
		}
	}
}
