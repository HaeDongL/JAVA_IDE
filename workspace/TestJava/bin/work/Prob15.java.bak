class Prob15
{//02.22
	public static void main(String[] args) 
	{
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		//프로그램 구현부 시작
		//참고 문자'a'의 정수값은 97이며, 'z'는 122입니다.
		//char c = 'a';
		// int i = (int)c;
		//char c1 = (char)i;
		
		for(int i=0; i<sourceString.length(); i++){
			int number;
			char currentChar = sourceString.charAt(i);
			if(currentChar == ' '){
				encodedString += ' ';
			}else{
				number = (int)currentChar;
				if(currentChar == 'x' || currentChar == 'y' || currentChar == 'z'){
					encodedString += (char)(number-23);
				}else {
					encodedString += (char)(number+3);
				}
			}
		}
		System.out.println("암호화할 문자열: "+sourceString);
		System.out.println("암호화된 문자열: "+encodedString);

	}
}
