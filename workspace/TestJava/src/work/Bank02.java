//package jb04.part01;

/*
	FileName: Bank02.java
	입력받은 인자의 값에 다라 주거래 으행, 입금, 출금 행위를 수행하는 Application
*/

public class Bank02
{
	///Field
	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	//Constructor
	public Bank02(){

	}
	public Bank02(String[] str){
		userName = str[0];
		bankName = str[1];
		command = Integer.parseInt(str[2]);
		money = Integer.parseInt(str[3]);
	}


	///Method
	// ==> commend 로 판단 deposit(), withdrawal() 호출하는 행위

	public void work(){
		if(command == 1){
			deposit();
		}else if(command == 2){
			withdrawal();
		}
	}
	//==> 입금을 수행 method
	public void deposit(){
		balance += money;
		System.out.println(money+"원 입금함.");
	}
	//==> 출금을 수행 method
	public void withdrawal(){
		balance -= money;
		System.out.println(money+"원 출금함.");
	}

	//==> 현재의 금액을 display하는 method
	public void displayMoney(){
		System.out.println("현재금액은 : "+balance+"입니다.");
	}
	///getter//setter method 생략

	//main method
	public static void main(String[] args){
		
		//data의 유효성 검사
		if(!(args.length==2 || args.length == 4)){
			System.out.println("[usage]::java Bank02 [coustomerName][bankName][option][money]");
			System.out.println("[usage]::인자값이 2,4개 필요합니다.");
			System.exit(0);
		}

		System.out.println(args[0]+"님의 주거래은행 "+args[1]+"입니다.");

		Bank02 b = new Bank02();

		if(args.length != 2){
			//입금: 1, 출금: 2인자 판단을 위한 command
			int command = Integer.parseInt(args[2]);

			if(command !=1 && command !=2){
				System.out.println("[usage]::java Bank02 [coustomerName][bankName][option][money]");
				System.out.println("[usage]::option을 확인하세요 :: 1 => 입금, 2==>출금");
				return;
			}

			//String Array 인자 받는 생성자를 이용한 인스턴스 생성
			b = new Bank02(args);

		}
		//잔액을 표시하는 method 호출
		b.displayMoney();
	

	}

}
//