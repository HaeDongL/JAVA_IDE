package t02_28;

class CellPhone01{
	
	///Field
	private String model;
	private double battery;
	///Constructor
	CellPhone01(){
	}
	public CellPhone01(String model) {
		super();
		this.model = model;
	}
	///Method
	void call(int time) {
		System.out.println("통화시간 : "+time);
		if(time < 0) {
			throw new IllegalArgumentException("통화시간입력오류");
		}else {
			this.setBattery(this.getBattery() - (time*0.5));
		}
		
	}
	
	void charge(int time) {
		System.out.println("충전 시간 : "+time);
		if(time < 0) {
			throw new IllegalArgumentException("충전시간입력오류");
		}else {
			this.setBattery(this.getBattery() + (time*3));	
		}
		
	}
	void printBattery() {
		System.out.println("남은 베터리 양: "+this.getBattery());
	}
	
	public boolean equals(Object otherObject) {
		
		if(otherObject instanceof CellPhone01 && this.model.equals(((CellPhone01) otherObject).model)) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	///Get
	public String getModel() {
		return model;
	}
	
	public double getBattery() {
		return battery;
	}
	
	///Set
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setBattery(double battery) {
		this.battery = battery;
	}
	
}



public class CellPhoneMain {
	
	
	public static void main(String[] args) {
		
		CellPhone01 myPhone = new CellPhone01("SCH-600");
		
		myPhone.charge(20); //20분간 충전을 한다
		myPhone.printBattery();
		
		myPhone.call(300); //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge(50);
		myPhone.printBattery();
		
		myPhone.call(40); //40분간 통화를 한다.
		myPhone.printBattery();
		
		try {
			myPhone.call(-20);//통화시간이 잘못 입력되었다.
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		CellPhone01 yourPhone = new CellPhone01("SCH-600");
		
		if(myPhone.equals(yourPhone)) {
			System.out.println("동일 모델입니다.");
		}else {
			System.out.println("다른 모델입니다.");
		}

	}


}
