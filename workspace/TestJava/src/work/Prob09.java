class Prob09 
{

	///Field

	///Constructor
	
	///Method
	public void diamond(int number){
		int count = 1;
		for(int i=1; i<=number/2+1; i++){
			for(int j=i; j<=number/2; j++){
				System.out.print(" ");
			}
			for(int k=1; k<i+count; k++){
				System.out.print("*");
				
			}
			count++;
			
			
			System.out.println();
		}//for
		
	}





	public static void main(String[] args) 
	{
		//아래에 구현하시오.
		Prob09 prob = new Prob09();
		prob.diamond(Integer.parseInt(args[0]));
	}//main
}//class
