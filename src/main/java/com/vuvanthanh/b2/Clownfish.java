package com.vuvanthanh.b2;

public class Clownfish extends Fishes {

	private IfFishesNature fishBehaviour;
	
	public void setNature(IfFishesNature fishBehaviour) {
		this.fishBehaviour = fishBehaviour;
	}

	@Override
	public String sing() {
		System.out.println("Clownfish don't sing");
		return "Clownfish don't sing";
	}
	
	@Override
	public String walk() {
		System.out.println("Clownfish don't walk");
		return "Clownfish don't walk";
	}

	@Override
	public String swim() {
		System.out.println("Clownfish can swim");
		return "Clownfish can swim";
	}

	
	
	public String getColor(){
		return fishBehaviour.color();
	}
	
	public String getAction(){
		return fishBehaviour.action();
	}

	

}
