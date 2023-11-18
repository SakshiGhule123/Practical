package com.lab.program;

import java.util.Scanner;

public class eceptionexample {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
       System.out.println("Enter the first number :");
       int iNo1 = obj.nextInt();
       
       System.out.println("Enter the Second number :");
       int iNo2 = obj.nextInt();
       
       try {
    	   
       double Result = iNo1 /iNo2;
       
       System.out.println("Output is"+Result);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println("Exception occur");
       }
	}

}
