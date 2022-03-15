public class Prob11 
{//02.21


	public void calc(int[] ix){
		//아래에 구현하시오
		int evenSum = 0;
		int oddSum = 0;
		for(int i=0; i<ix.length; i++){
			
			if(ix[i]%2 == 0){
				evenSum += ix[i];
			}else{
				oddSum += ix[i];
			}//if-else
		}//for
		System.out.println("홀수의 합 : "+oddSum);
		System.out.println("짝수의 합 : "+evenSum);
	}
		
	public static void main(String[] args) 
	{
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
		int[] ib = new int[]{1,2,3,4,5};

		Prob11 p = new Prob11();
		System.out.println("(배열 ia)");
		p.calc(ia);
		System.out.println("(배열 ib)");
		p.calc(ib);
	}
}
