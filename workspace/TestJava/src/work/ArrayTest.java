//packate jb02.part04;

/*
	FileName: ArrayTest01
	1.Array(배열): 같은 Data Type 의 묶음
	2.Reference Data Type 의 이해
	3.new / .keyword 사용
*/
class ArrayTest
{	
	//main method
	public static void main(String[] args) 
	{
		//1. int Data Type array 선언 ==> int[] intArray; or int intArray[];
		//2. 9개의 int를 저장(관리)할 수 있는 공간을 갖는 array 생성 ==> new int[9];
		//3. 대입 연산자 = 를 이용 대입 변수에 9개 공간의 위치 정보 대입 i = new int[9];
		//4. array 선언, 생성, 위치정보 대입, 을 동시에...
		int[] intArray = new int[9];
		
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;
		intArray[6] = 7;
		intArray[7] = 8;
		intArray[8] = 9;

		//==> array 선언, 생성 위치정보, value 대입을 동시에 하는 다른방법들
		//int[] intArray = {1,2,3,4,5,6,7,8,9};
		//int[] intArray = new int[] {1,2,3,4,5,6,7,8,9};

		//배열의 index를 이용 각각의 value 에 접근
		for(int j=0; j<9; j++){
			System.out.println("intArray["+j+"]값은 : "+intArray[j]);
		}

		// 각각의 값을 이용하여 5단을 출력. intArray.legth
		// . Operator 와 length keyword 사용
		System.out.println("==========================");
		for(int k=0; k<intArray.length; k++){
			System.out.println("5 X "+intArray[k]+"="+5*intArray[k]);
		}

		//==> 아래의 출력 내용을이해하자. (primitive int i = 0; 과 비교 이해이해하면...)
		int[] j = intArray;
		System.out.println("j[0] 값은 : "+j[0]);
		System.out.println("j[5] 값은 : "+j[5]);

		//==> 위의 출력을 이해했다면 아래의 주석을 풀고 출력결과를 확인.
		j[5] = 1234;
		System.out.println("j[5] 값은 : "+j[5]);
		System.out.println("i[5]==> "+intArray[5]);
	}//end of main
}// end of class
