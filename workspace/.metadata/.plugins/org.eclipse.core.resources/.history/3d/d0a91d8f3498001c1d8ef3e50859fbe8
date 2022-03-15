package t02_28;

class CellPhone{
	
	///Field
	private String phoneNumber;
	private int totalCallTime; 
	private int totalFee; 
	private int feePerCallTime; 
	
	
	///Constructor
	
	public CellPhone() {
		
	}
	
	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}
	
	///Method
	
	public void call(String number, int time) {
		this.totalCallTime += time;
		System.out.println(number+"번호로 "+time+" 통화함.");
	}
	
	public void calculationTotalFee() {
		this.totalFee = this.feePerCallTime * this.totalCallTime;
	}
	
	
	
	//getMethod
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public int getTotalCallTime() {
		return totalCallTime;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	
	//setMethod
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
	
	
}

class SmartPhone extends CellPhone{
	///Field
	private boolean isMonthlyFixedRate; 
	private int monthlyFixedFee; 
	///Constructor
	public SmartPhone(){
		
	}
	public SmartPhone(String phoneNumber,int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
		
	}
	public SmartPhone(String phoneNumber,int feePerCallTime,boolean isMonthlyFixedRate,int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	///Method
	
	public void calculationTotalFee() {
		if(isMonthlyFixedRate) {
			setTotalFee(monthlyFixedFee);
		}else {
			int total = getFeePerCallTime() * getTotalCallTime();
			setTotalFee(total);
		}
		
	}
}





public class Prob19 {
	
	
	public static void main(String[] args) {
		//전화번호, feePerCallTime을 초기화 하는 생성자 호출 인스턴스 생성
		CellPhone cellPhone = new CellPhone("010-010-010",1000);
		//상대전화번호 와 통화시간을 인자로 전달하는 call Method 호출
		cellPhone.call("017-017-017",10);
		cellPhone.call("016-016-016",10);
		cellPhone.calculationTotalFee();
		System.out.println(cellPhone.getPhoneNumber()+"의 통화시간은 "+
					cellPhone.getTotalCallTime()+" 이며\n"+
					"단가 "+cellPhone.getFeePerCallTime()+
					" 총요금은 "+cellPhone.getTotalFee()+"원 입니다.");
		System.out.println("===========================================");
		
		//전화번호,feePerCallTime을 초기화하는 생성자 호출 인스턴스 생성
		SmartPhone smartPhone = new SmartPhone("000-000-000",200);
		smartPhone.call("017-017-017",10);
		smartPhone.calculationTotalFee();
		System.out.println(smartPhone.getPhoneNumber()+"의 통화시간은 "+
					smartPhone.getTotalCallTime()+" 이며\n"+
					"단가 "+smartPhone.getFeePerCallTime()+
					" 총요금은 "+smartPhone.getTotalFee()+"원 입니다.");
		
		
		System.out.println("===========================================");
		SmartPhone smartPhone01 = new SmartPhone("111-111-111",0,true,3000);
		smartPhone01.call("017-017-017",10);
		smartPhone01.call("016-016-016",10);
		smartPhone01.calculationTotalFee();
		System.out.println(smartPhone01.getPhoneNumber()+"의 통화시간은 "+
					smartPhone01.getTotalCallTime()+" 이며\n"+
					"단가 "+smartPhone01.getFeePerCallTime()+
					" 총요금은 "+smartPhone01.getTotalFee()+"원 입니다.");
	}

}
