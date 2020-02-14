package com.vuvanthanh.a2;

public class ChickenSound implements IfSound{
	
	@Override
	public String sound(){
		
		System.out.println("Cluck, cluck");
		return "Cluck, cluck";
		
	}
}
