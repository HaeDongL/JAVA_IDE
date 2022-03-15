/*
 	[4] 숫자를 입력 받아(1~100) 90이상 수, 80점이상 우, 70점이상 미, 60이상 양
 	(입력한 값이 0~100 사이 이어야한다. 그 이상 그이하일 경우 어떻게 처리할 것인가.)
 	FileName: Example1.java
 	
 	실행예> java Example1 95
	==>실행결과(출력결과...)
	입력하신 값 95점은 수입니다.
 
 */
public class Example1 {
	//main method
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		// 100/10 99/10 98/10... switch
		
		/*if(score<=100 && score>=90) {
			System.out.println("입력하신 값: "+score+"점은 수입니다.");
		}else if(score<=89 && score>=80) {
			System.out.println("입력하신 값: "+score+"점은 우입니다.");
		}
		else if(score<=79 && score>=70) {
			System.out.println("입력하신 값: "+score+"점은 미입니다.");
		}
		else if(score<=69 && score>=0) {
			System.out.println("입력하신 값: "+score+"점은 양입니다.");
		}
		else {
			System.out.println("잘못된 범위의 값입니다.");
		}
		*/
		
		if(args.length != 1){
			System.out.println("점수를 입력 하세요.");
			return;
		}
		if(score > 100 || score < 0){
			System.out.println("점수의 범위가 잘못되었습니다.");
			return;
		}
		
		String grade = "수";
		switch (score/10){
			case 10:
			case 9:
			break;
			case 8:
				grade = "우";
				break;
			case 7:
				grade = "미";
				break;
			default :
				grade = "양";
				

		}
		System.out.println("입력하신 값: "+score+"점은 "+grade+"입니다.");
		
		

	}//main
}//class
