package com.vuvanthanh.a4;

public class DogSound implements IfSound{
	
	@Override
	public String sound(){
		
		System.out.println("Woof, woof");
		return "Woof, woof";
		
	}
}
