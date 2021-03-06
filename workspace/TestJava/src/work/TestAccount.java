class Account
{//02.21
	///Field
		private String accNo;
		private int balance;
	///Constructor
		public Account(){
		}
		public Account(String accNo){
			this.accNo = accNo;
			System.out.println(this.accNo+" 계좌가 개설되었습니다.");
		}
	///Method
		public String getAccNo(int pwd){
			if(pwd == 1234){
				return this.accNo;
			}else {
				return null;
			}
		}

		public int getBalance(int pwd){
			if(pwd == 1234){
				return this.balance;
			}else {
				return 0;
			}	
		}

		public void save(int money){
			System.out.println(accNo+" 계좌에 "+money+"만원이 입금되었습니다.");
			this.balance += money;
		}

		public void deposit(int money){
			System.out.println(accNo+" 계좌에 "+money+"만원이 출금되었습니다.");
			this.balance -= money;
		}
}

public class TestAccount
{
	public static void main(String[] args) 
	{
		String accNo = null;
		int balance = 0;
		
		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo(1234);
		balance = accObj.getBalance(1234);
		System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원 입니다.");

		accObj.save(100);
		balance = accObj.getBalance(1234);
		System.out.println(accObj.getAccNo(1234)+" 계좌의 잔고는 "+balance+"만원입니다.");
		
		accObj.deposit(30);
		balance = accObj.getBalance(1234);
		System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원 입니다.");
		
	
	}
}
