package com.vuvanthanh.b2;

public class ClownfishNature implements IfFishesNature{
	
	@Override
	public String color() {
		System.out.println("Clownfish are small and colourful (orange)");
		return "Clownfish are small and colourful (orange)";
	}

	@Override
	public String action() {
		System.out.println("Clownfish make jokes");
		return "Clownfish make jokes";
	}

}
