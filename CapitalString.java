package com.java.demo.intro;

class Conversion
{
	public String Capital(String str)
	{
		char Arr[]=str.toCharArray();
		
		for(int i =0; i < Arr.length ;i++)
		{
		    if((Arr[i] >='a') && (Arr[i] <='z'))
		    {
		    	Arr[i] =(char) ((char) Arr[i] - 32) ;
		    }
		}
		
		String str1 =  String.valueOf(Arr);
		return str1;
	}
}
public class CapitalString {

	public static void main(String[] args) {
		String str = "sakshi";
		
		Conversion obj = new Conversion();
		
		System.out.println("The output is "+obj.Capital(str));
	}

}
