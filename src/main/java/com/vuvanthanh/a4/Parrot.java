package com.vuvanthanh.a4;

public class Parrot extends Bird{
	
	private IfSound ifSound;
	
	public String getSound(){
		return ifSound.sound();
	}
	
	public void setSound(IfSound ifSound) {
		this.ifSound = ifSound;
	}
	
}
