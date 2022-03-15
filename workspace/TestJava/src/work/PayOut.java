//package jb05.part08;

public interface PayOut{

	/*
		FileName: Deposit.java

		1. 금융업무를 하는 곳이라면 출금업무(기능)는 필수 기능
		2. 은행, 금고, 증권동 어느곳이나 공통된 업무인 출금업무(기능)를 interface정의
	*/
	//interface Field(member variable) ==> public static final특성을 갖는다.
	public final static String payOut= "출금";

	//interface method ==> public abstract 특성을 갖는다.
	public abstract void payOut(int menony);
	
	
}
