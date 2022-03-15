import java.util.Scanner;

public class FactorialUtil 
{//02.21
	

	public String factorial(int n){
		// 구현하세요
		int result = 1;
		String print;
		for(int i=n; i>=1; i--){
				result *= i;
		}
		
			print = "팩토리얼 결과 값 = "+result+"\t(";
		for(int i=n; i>1; i--){
			print += i+"*";
			if(i == 2){
				print += (i-1)+")\t";
			}
		}

		return print;
		
	}

	


		//main
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input		= ");

		FactorialUtil util = new FactorialUtil();
		System.out.print("Result= "+util.factorial(keyboard.nextInt()));
	}//main
}//class
