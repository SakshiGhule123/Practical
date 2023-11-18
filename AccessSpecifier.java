package com.java.demo.intro;

class Access
{
	public int iValue = 11;
	protected int savingAmount = 1400;
	private String  password = "str";
	 Access()
	{
		 System.out.println("In Access Constructor");
		 
		System.out.println("iValue = "+iValue);
		System.out.println("savingAmount = "+savingAmount);
		System.out.println("password = "+password);
		
		System.out.println();
	}
}

class Derived extends Access
{
	Derived()
	{
		 System.out.println("In Derived Constructor");
		System.out.println("iValue = "+iValue);
		System.out.println("savingAmount = "+savingAmount);
		// System.out.println("password = "+password); not allowed because private
	}
}

class Derived1 extends Derived
{
	    Derived1()
		{
	    	 System.out.println("In Derived1 Constructor");
			System.out.println("iValue = "+iValue);
			System.out.println("savingAmount = "+savingAmount);
			System.out.println();
		//	System.out.println("password = "+password);   not allow
		}
}
public class AccessSpecifier {

	public static void main(String[] args) {
		Access obj1 = new Access();
		Derived obj2 = new Derived();
		Derived obj3 = new Derived();
      
		 System.out.println("In Main function");
		System.out.println("iValue = "+obj1.iValue);
	//	System.out.println("savingAmount = "obj1.+savingAmount); // N.A because private
	//	System.out.println("password = "+obj1.password);      // N.A because protected
		System.out.println();
	}

}
