package com.vuvanthanh.fbonus;

public class Rooster extends Bird{
	
	private IfSound ifSound;
	
	public String getSound(){
		return ifSound.sound();
	}
	
	public void setSound(IfSound ifSound) {
		this.ifSound = ifSound;
	}
	
}
