public class StringUtil
{

	/*이곳에 replaceString 메소드를 작성하십시오.*/
	private static String replaceString(String[] arr){
			int[] count = new int[arr.length];
			int topCount = 0;
			String str="";
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length(); j++){
				if(arr[i].charAt(j) == 'a'){
					count[i] ++;	
				}//inForIf
			}//inFor
			if(topCount < count[i]){
				topCount = count[i];
			}//if
		}//outFor

		

		for(int i=0; i<count.length; i++){
			if(topCount == count[i]){
				str = arr[i].replace('a','A');
				break;
			}//if
		}//for
		
		//replace
		return str;
	}
	
	public static void main(String[] args) 
	{
		String[] arr = {"java program","array","java program area","append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 "+result);
	}//main
}//class
