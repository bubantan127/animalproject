package com.vuvanthanh.a4;

public class PhoneSound implements IfSound{
	
	@Override
	public String sound(){
		
		System.out.println("Reng, reng");
		return "Reng, reng";
		
	}
}
