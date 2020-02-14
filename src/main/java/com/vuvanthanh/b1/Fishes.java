package com.vuvanthanh.b1;

public class Fishes extends Animal {
	
	@Override
	public void walk(){
		System.out.println("Fishes don’t walk");
	}
	
	public void sing(){
		System.out.println("Fishes don’t sing");
	}	
	
	public void swim(){
		System.out.println("Fishes can swim");
	}
	
}
