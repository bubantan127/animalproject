package com.vuvanthanh.b2;

public class Solution {

	public static void main(String[] args) {
		
		//2ad
		Fishes shark1 = new Shark();
		shark1.sing();
		shark1.swim();
		shark1.walk();
		Shark shark2 = new Shark();
		shark2.setNature(new SharkNature());
		shark2.getAction();
		shark2.getColor();
		
		//2bc
		Fishes clownfish1 = new Clownfish();
		clownfish1.sing();
		clownfish1.swim();
		clownfish1.walk();		
		Clownfish clownfish2 = new Clownfish();
		clownfish2.setNature(new ClownfishNature());
		clownfish2.getAction();
		clownfish2.getColor();
	}

}
