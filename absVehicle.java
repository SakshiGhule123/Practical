package com.java.demo.intro;

abstract class VehicleX
{
	abstract void StartEngine();
	abstract void StopEngine();
	
}

class CarX extends VehicleX
{

	@Override
	void StartEngine() 
	{
		System.out.println("Engine is Start");
	}

	@Override
	void StopEngine() 
	{
		System.out.println("Engine is Stop");
	}
	
}

class Motercycle extends VehicleX
{

	@Override
	void StartEngine() 
	{
		System.out.println("Engine is Start");
	}

	@Override
	void StopEngine() 
	{
		System.out.println("Engine is Stop");
	}
	
}
public class absVehicle {

	public static void main(String[] args) 
	{
	 Motercycle obj = new Motercycle();
	 obj.StartEngine();
	 obj.StopEngine();
	}

}
