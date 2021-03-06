
/*
	FileName: ModifierTest02.java

	==> TopSecret01.class 문제점
	==> Access Modifier를 통한 information hiding과 Method(행위)를 통한 접근
*/

class TopSecret02
{
	///Field
	//==> access modifier를 활용한 information hiding
	//==> private 접근제어를 사용 직접접근할 수 없도록 하고 getter Method 통해 접근
	private int secretNo = 7777;

	///Constructor
	public TopSecret02(){
		
	}
	//Method
	//getter Method
	//=> method를 통해 조건을 충족할 경우만 secretNo를 retrun
	public int getSecretNo(int pwd){
		if(pwd == 0){
			return secretNo;
		}else {
			return 0;
		}
	}
}//class


public class ModifierTest02 
{

		//main Method
	public static void main(String[] args) 
	{
		TopSecret02 topSecret = new TopSecret02();

		//==> private Field는 information hiding 되어 있어 접근 및 변경이 불가
		//System.out.println(topSecret.secretNo);
		//topSecret.secretNo = 1234;

		System.out.println(topSecret.getSecretNo(0));
	}//end of main
}//end of class
