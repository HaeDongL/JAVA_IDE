//package jb03.part05;

/*
	FileName: Developer1Test.java
	::Developer1.class를 Instance 생성 사용하는 class 정의 :: Application class 정의
*/

class Developer1Test
{
	//Field
	//Method
	//main
	public static void main(String[] args) 
	{
		
		//Developer1.class를 Instance 생성
		Developer1 developer = new Developer1();

		//developer 식별성을 갖는 Instance . 연산자를 통해 사용

		System.out.println("이름은 : "+developer.name);
		System.out.println("직업은 : "+developer.job);
		System.out.println("평균수입은 : "+developer.avgIncome);
		System.out.println("PJT경력은 : "+developer.projectCareer);

		System.out.println("=========================================");


		//project에 참여

		developer.participateProject();
		System.out.println("평균수입은: "+developer.avgIncome);
		System.out.println("project 참여 경력은 : "+developer.projectCareer);

		System.out.println("=========================================");

		//1개 과목을 강의
		developer.instruct();
		System.out.println("평균수입은 : "+developer.avgIncome);


		//////////////////////// 추가된 부분 /////////////////////////////////


		System.out.println("=========================================");

		//홍길동이 한미은행 project에 참여
		String projectName = "한미은행";
		developer.participateProject(projectName);
		//==> 위의 두라인을 아래와 같이 표현했다. 주석풀고 출력결과르 확인하면...
		System.out.println("평균수입은 : "+developer.avgIncome);
		System.out.println("project참여 경력은 : "+developer.projectCareer);

		
		System.out.println("=========================================");

		//홍길동이 2개 과목을 강의
		int IectureCount = 2;
		developer.instruct(IectureCount);
		//==> 위의 두라인을 아래와 같이 표현했다. 주석풀고 출력결과를 확인하면....
		//hong1.instruct(2);
		System.out.println("평균수입은 : "+developer.avgIncome);

	}//main
}//class
