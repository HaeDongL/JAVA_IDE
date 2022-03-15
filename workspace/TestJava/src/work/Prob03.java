import java.util.Scanner;
class Prob03 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요 ");
		int inputInt = keyboard.nextInt();
		
		
		//아래에 구현하세요
		if(inputInt > 1 && inputInt < 10){
			
			for(int i=1; i<=inputInt; i++){
				int factorial = 1;
				for(int j=1; j<=i; j++){
					factorial *= j;
				}
				System.out.println(i+"! = "+factorial);
			}

			
		}else {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}//else

	}//main
}//class
