package com.vuvanthanh.fbonus;

public class RoosterSound implements IfSound{
	
	@Override
	public String sound(){
		
		System.out.println("Cock-a-doodle-doo");
		return "Cock-a-doodle-doo";
		
	}
}
