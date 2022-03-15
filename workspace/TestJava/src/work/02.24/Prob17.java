public class Prob17 
{
	public String leftPad(String str, int size, char padChar){
		/* 여기에 프로그램을 완성하십시오.*/
		String padCharTemp = "";
		if(str.length() != size){
			for(int i=0; i<size - str.length(); i++){
				padCharTemp += padChar;
			}//for
			str = padCharTemp + str;

		}//if
		return str;
	}

	public static void main(String[] args) 
	{
		Prob17 prob17 = new Prob17();
		System.out.println(prob17.leftPad("ABC",6,'#'));
		System.out.println(prob17.leftPad("ABC",5,'$'));
		System.out.println(prob17.leftPad("ABC",2,'&'));	
	}//main
}//class
