package com.vuvanthanh.a4;

public class Solution {
	
	public static void main(String args[]){
		
		Parrot parrot = new Parrot();
		
		//4abc
		parrot.setSound(new DogSound());
		parrot.getSound();
		parrot.setSound(new CatSound());
		parrot.getSound();
		parrot.setSound(new RoosterSound());
		parrot.getSound();
		
		//4cd
		parrot.setSound(new DuckSound());
		parrot.getSound();		
		parrot.setSound(new PhoneSound());
		parrot.getSound();
	}

}
