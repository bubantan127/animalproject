package com.vuvanthanh.a4;

public class DuckSound implements IfSound{
	
	@Override
	public String sound(){
		
		System.out.println("Quack, quack");
		return "Quack, quack";
		
	}
}
