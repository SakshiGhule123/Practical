package com.java.demo.intro;
class MultArray
{int i;
	public void Multi(int a[][],int b[][])
	{
		int iMul = 0;
		 for(int i = 0 ;i < a.length ;i++)
		 {
			 for(int j =0; j <a.length ; j++)
			 {
				 iMul = a[i][j] * b[i][j];
				 System.out.print(iMul + "\t");
			 }
			 System.out.println();
		 }
	}
	
	public void EvenOdd(int a[][])
	{
		System.out.println("Even number is :");
		 for(int i = 0 ;i < a.length ;i++)
		 {
			 for(int j =0; j <a.length ; j++)
			 {
				 if(a[i][j] % 2 == 0)
				 {
					 System.out.print(a[i][j] + "\t" );
					 
				 }
				 
			 }
			 
		 }
		 System.out.println();
		
		System.out.println("odd number is :");
		 for(int i = 0 ;i < a.length ;i++)
		 {
			 for(int j =0; j <a.length ; j++)
			 {
				 if(a[i][j] % 2 != 0)
				 {
					 System.out.print(a[i][j] + "\t" );
					 
				 }
				 
			 }
			 
		 }

	}
	
}
public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[][]={{8,6,1},{2,9,2},{3,5,3}};
     int b[][]={{3,4,4},{23,2,4},{3,7,6}};
     
     MultArray obj = new MultArray();
     obj.Multi(a, b);
     obj.EvenOdd(a);
  
	}

}
