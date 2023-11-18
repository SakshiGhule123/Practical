package com.lab.program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		try 
		{
            System.out.print("Please enter an integer: ");
            int userInput = obj.nextInt();
            System.out.println("You entered: " + userInput);
        }
		catch (InputMismatchException e) 
		{
            System.out.println("Invalid input. Please enter a valid integer.");
        } 
		finally
		{
            obj.close();
        }

	}

}
