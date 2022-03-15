//package jb02 part03;
class Example5
/*
	FileName: Example5.java

	o 문자열 관리하는 String array(String[][]text = new String[9][9])를 만들고,
	o 구구단 문자열을 text Array에 저장하여 출력하는 예제

	실행예> java Example5
		==>실행결과(출력결과...)
		1단을 출력합니다.
		text[0][0]: 1 * 1 = 1
		text[0][1]: 1 * 2 = 2

		==> 아래의 내용을 참조하여 만들어 보자...
		int i = 9;
		int j = 9;

		text[8][8] = i+"*"+j+"="+i*j
*/
{
	//main method
	public static void main(String[] args) 
	{
		String[][] text = new String[9][9];
		
		for(int i=0; i<text.length; i++){
			System.out.println((i+1)+"단을 출력합니다");
			for(int j=0; j<text[i].length; j++){
				text[i][j] = (i+1)+"*"+(j+1)+"="+(i+1)*(j+1);
				System.out.println("text["+i+"]["+j+"] = "+text[i][j]);
					
			}
			System.out.println();
		}

	}
}
