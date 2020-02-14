package com.vuvanthanh.a4;

public class CatSound implements IfSound{
	
	@Override
	public String sound(){
		
		System.out.println("Meow");
		return "Meow";
		
	}
}
