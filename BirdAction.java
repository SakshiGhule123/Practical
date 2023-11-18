package com.java.demo.intro;

abstract class Bird
{
	abstract void fly();
	abstract void  makeSound();
}

class Eagle extends Bird
{

	@Override
	void fly() {
		System.out.println("Eagle flies at high altitude with e-eagle flies at high altitude with its wings spread out on a sunny day in the mountains.");

	}

	@Override
	void makeSound() {
		
		System.out.println("Eagle emits surprisingly weak-sounding calls—usually a series of high-pitched whistling or piping notes.");
	}
	
}

class Hawk extends Bird
{

	@Override
	void fly() {
		System.out.println("They are relatively larger-winged, shorter-tailed and fly further distances in open areas");

	}

	@Override
	void makeSound() {
		
		System.out.println(" Hawk make sound screaming kee-eeeee-arr");
	}
	
}
public class BirdAction {

	public static void main(String[] args) {
		
		Hawk obj1 = new Hawk();
		Eagle obj2 = new Eagle();
		
		obj1.fly();
		obj1.makeSound();
		
		System.out.println();
		
		obj2.fly();
		obj2.makeSound();
	}

}
