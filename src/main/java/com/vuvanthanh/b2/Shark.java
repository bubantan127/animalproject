package com.vuvanthanh.b2;

public class Shark extends Fishes{
	
	private IfFishesNature ifFishNature;
	
	public void setNature(IfFishesNature ifFishNature) {
		this.ifFishNature = ifFishNature;
	}
	
	public String getColor(){
		return ifFishNature.color();
	}
	
	public String getAction(){
		return ifFishNature.action();
	}

	@Override
	public String sing() {
		System.out.println("Sharks don't sing");
		return "Sharks don't sing";
	}

	@Override
	public String walk() {
		System.out.println("Sharks don't walk");
		return "Sharks don't walk";
	}
	
	@Override
	public String swim() {
		System.out.println("Sharks can swim");
		return "Sharks can swim";
	}
}
