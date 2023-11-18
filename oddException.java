package com.lab.program;

import java.io.IOException;
import java.util.Scanner;

class Calculation
{
	void Argument(int no) throws IOException
	{
		if((no % 2) != 0)
		{
			System.out.println("Exception of odd number");
		}
		else
		{
			System.out.println("The  number is "+no);
		}
	}
}
public class oddException {

	public static void main(String[] args) throws IOException {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int iNo = obj.nextInt();
		
		Calculation s = new Calculation();
		s.Argument(iNo);
	}

}
