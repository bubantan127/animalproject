package com.vuvanthanh.b2;

public class SharkNature implements IfFishesNature{

	@Override
	public String color() {
		System.out.println("Sharks are large and grey");
		return "Sharks are large and grey";
	}

	@Override
	public String action() {
		System.out.println("Sharks eat other fish");
		return "Sharks eat other fish";
	}

}
