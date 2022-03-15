//package jb04.part01;


public class Bank03 
{

	///Field
	int balance;
	int money;
	int command;
	String bankName;
	String userName;
	
	///Constructor
	
	public Bank03(){

	}

	public Bank03(String[] str){
		validate(str);		//인자값을 검증하는 Method 호출
		initialize(str);		//Field를 초기화 시키는 Method 호출
		work();				//Commend 가 출금, 입금을 판단 deposit(), withdrawal() 호출하는 method
		displayMoney();		//잔액을 표시하는 method
	}

	///Method
	//인자값을 검증하는 Method
	public void validate(String args[]){
		if(!(args.length == 2 || args.length == 4)){
			System.out.println("[usage]::java Bank03 [coustomerName][bankName][option][money]");
			System.out.println("[usage]::인자값이 2, 4개 가 필요합니다.");
			System.exit(0);
		}

		if(args.length != 2 && Integer.parseInt(args[2]) != 1 && Integer.parseInt(args[2]) !=2){
			System.out.println("[usage]::java Bank03 [coustomerName][bankName][option][money]");
			System.out.println("[usage]::option을 확인하세요 :: 1=> 입금, 2==>출금");
			System.exit(0);
		}
	}

	public void initialize(String[] value){
		userName = value[0];
		bankName = value[1];
		if(value.length == 4){
			command = Integer.parseInt(value[2]);
			money = Integer.parseInt(value[3]);
		}
		System.out.println(userName+"님의 주거래은행은"+bankName+"입니다.");
	}

//==>command 출금,입금 판단 deposit(), withdrawal(), 호출 method

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


	public static void main(String[] args) 
	{
		new Bank03(args);
	}
}
//