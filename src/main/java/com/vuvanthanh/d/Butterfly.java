package com.vuvanthanh.d;

public class Butterfly implements IfFly, IfSound{

	@Override
	public String fly() {
		System.out.println("Butterfly can fly");
		return "Butterfly can fly";
	}

	@Override
	public String sound() {
		System.out.println("Butterfly does not make a sound");
		return "Butterfly does not make a sound";
	}

}
