package com.java.demo.intro;
import java.util.*;

class Convertor
{
	public int  Cal(int iValue)
	{
		int  fahrenheit= ((iValue*9)/5) + 32;
		return fahrenheit;
	}
}
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		 
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the Temperature in Celsius : ");
    int iTemp = sobj.nextInt();
    
    Convertor obj = new Convertor();
    
    int iRet = obj.Cal(iTemp);
    System.out.println("The temperature in Fahrenheit is :" + iRet);
    
	}

}
