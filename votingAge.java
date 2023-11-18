package com.lab.program;

import java.util.Scanner;

class AgeException extends Exception
{
	AgeException(String s)
    {
        super(s); // call the parent class constructor
    }
}
public class votingAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        
        try {
            if (age < 18) {

            	throw new AgeException("Invalid age!!");
            }
            else
            {
                System.out.println("you are eligible");
            }
             }
            catch(AgeException obj)
            {
            	 System.out.println(obj.getMessage());
            }
      
        

	}

}
