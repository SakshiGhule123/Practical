package com.java.demo.intro;
import java.util.*;

abstract class BankAccountX
{
	abstract void Deposite(int iAmount);
	abstract void Withdraw(int iValue);
	
}

class SavingAcccountX extends BankAccountX
{
	int iAmount ;
	@Override
	void Deposite(int iAmount) {
		this.iAmount = iAmount ;
		System.out.println("You Successfully  Deposite amount "+ iAmount);
	}

	@Override
	void Withdraw(int iValue) {
		
		System.out.println("Your Withdram amount is : "+iValue);
	}
	
}


class CurrentAcccount extends BankAccountX
{
	int iAmount ;
	@Override
	void Deposite(int iAmount) {
		this.iAmount = iAmount ;
		System.out.println("You Successfully  Deposite amount "+ iAmount);
	}

	@Override
	void Withdraw(int iValue) {
		
		System.out.println("Your Withdram amount is : "+iValue);
	}
	
}

public class absBank {

	public static void main(String[] args) {
	
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Deposite value :");
		int iDeposite = sobj.nextInt();
		
		System.out.println("Enter the Withdra value :");
		int iWithdraw = sobj.nextInt();
		
       CurrentAcccount obj = new CurrentAcccount();
      
      obj.Deposite(iDeposite);
      obj.Withdraw(iWithdraw);
	}

}
