package com.vuvanthanh.e;

public class Frog extends Animal{

	@Override
	public boolean swim() {
		return true;
	}

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean fly() {
		return false;
	}

	@Override
	public boolean sing() {
		return true;
	}

}
