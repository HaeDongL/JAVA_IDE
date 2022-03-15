import java.util.Scanner;

class Test000 
{

//main method
	public static void main(String[] args) 
	{	
		
	int[] a = {1,2,3,4,5};
	int[] b = a;
	
	System.out.println("a[2] ="+a[2]);

	System.out.println("b[2] 에 6을 넣음;");
	
	b[2] = 6;
	

	System.out.println("a[2] = "+a[2]);

	System.out.println("b[2] = "+b[2]);
	

	}


}

