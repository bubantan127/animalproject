package com.vuvanthanh.a2;

public class Chicken extends Bird{

	private IfFly ifFly;
	private IfSound ifSound;
	private IfSwim ifSwim;	
	
	public String getFly(){
		return ifFly.fly();
	}
	
	public void setFly(IfFly ifFly) {
		this.ifFly = ifFly;
	}
	
	public String getSound(){
		return ifSound.sound();
	}
	
	public void setSound(IfSound ifSound) {
		this.ifSound = ifSound;
	}
	
	public String getSwim(){
		return ifSwim.swim();
	}
	
	public void setSwim(IfSwim ifSwim) {
		this.ifSwim = ifSwim;
	}
	
}
