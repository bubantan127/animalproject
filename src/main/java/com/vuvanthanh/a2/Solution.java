package com.vuvanthanh.a2;

public class Solution {
	
	public static void main(String args[]){
		
		//2ab
		Duck duck = new Duck();
		duck.setSound(new DuckSound());
		duck.getSound();
		duck.setSwim(new DuckSwim());
		duck.getSwim();
		duck.setFly(new FlyYes());
		duck.getFly();
		
		//2cd
		Chicken chicken = new Chicken();		
		chicken.setSound(new ChickenSound());
		chicken.getSound();		
		chicken.setSwim(new ChickenSwim());
		chicken.getSwim();		
		duck.setFly(new FlyNo());
		duck.getFly();
	}

}
