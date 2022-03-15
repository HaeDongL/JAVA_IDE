class Bank
{
	//Feild
	int balance = 0;
	String bankName;
	String userName;
	int money;



	//Constructor
	
	public Bank(String uName, String bName){
		userName = uName;
		bankName = bName;
		System.out.println(userName+"님의 주거래은행은 "+bankName+"입니다.");
	}
	
	
	//Method
	public void deposit(int x, int y){
		money = y;
		if(x == 1){
			System.out.println(y+"원 입금함");
			balance += money;
		}else {
			System.out.println(y+"원 출금함");
			balance -= money;
		}//else
		System.out.println("현재 "+balance+"원 있습니다.");
	}//deposit
		
	}
