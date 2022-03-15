
public class Util
{


	///Field
	
	///Constructor
	
	///Method
	public int findPrimeCount(int limit){
		/////////////////아래에 구현하세요.////////////////////
		int count = 0;
		int decimalCount = 0;
		for(int i=2; i<=limit; i++){
			for(int j=1; j<=i; j++){
				if(i % j == 0){
					count++;
				}
			}//inFor
			if(count == 2){
				decimalCount += 1;
				count = 0;
			}else {
				count = 0;	
			}//if

		}//outFor


		
		return decimalCount;
	}

	public int[] findPrimeReturnArray(int limit){
			
		int decimalCount = findPrimeCount(limit);
			
		int[] array = new int[decimalCount];
		int arrayCount = 0;
		int count = 0;

		for(int i=2; i<=limit; i++){
			for(int j=1; j<=i; j++){
				if(i % j == 0){
					count++;
				}
			}//inFor
			if(count == 2){
				array[arrayCount] = i;
				arrayCount++;
				count = 0;
			}else {
				count = 0;	
			}//if

		}//outFor
		
		

		return array;
	}



	public static void main(String[] args) 
	{
		int limit = 67;

		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1~"+limit+"까지의 소수의 개수는 "+primeCount+"EA이며 소수는 아래와 같다.");

		System.out.println("//////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+((primeArray.length-1)!= i ? "," : ""));
		}//for
	}//main
}///class
