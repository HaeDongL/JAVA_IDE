
import java.util.Scanner;

public class Prob04 {
	public static void main(String[] args) {
		
		int number = 0;
		int count = 0;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 ");
		number = keyboard.nextInt();
		
		/*여기에 프로그램을 완성하십시오*/
		
		if(number > 0 && number < 1000) {
			for(int i=number; i<=1000; i++) {
				if(i % number == 0) {
					sum += i;
					count++;
				}//if
			}//for
			System.out.println(number+"의 배수 개수 = "+count);
			System.out.println(number+"의 배수 합 = "+sum);
		}else {
			System.out.println("1 ~ 1000 사이의 수를 입력하세요.");
		}
		
		
	}//main
}//class
