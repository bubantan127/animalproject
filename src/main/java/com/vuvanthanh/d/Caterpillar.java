package com.vuvanthanh.d;

public class Caterpillar extends Animal implements IfFly {

	private IfFly ifFly;
	private IfSound ifSound;
	
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
	
	public void getAction(){
		ifFly.fly();
		ifSound.sound();
	}

	@Override
	public String fly() {
		System.out.println("Caterpillar can not fly");
		return "Caterpillar can not fly";
	}
	
	@Override
	public void walk(){
		System.out.println("Caterpillar can walk");
	}
}
