package jp03.par01;

class Test01{
	int i = 5;
}

class Test02 extends Test01{
	
	int i = 0;
	
	Test02(){
		
	}
	Test02(String text){
		this.i = 1;
	}
}


public class Test {
	public static void main(String[] args) {
		Test02 t = new Test02("Hello");
		
		System.out.println(t.i);
	}
}
