package com.vuvanthanh.a4;

import org.junit.Test;
import junit.framework.Assert;

public class A4Test {

	@Test
	public void test(){
		
		//Parrot
		Parrot parrot = new Parrot();
		parrot.setSound(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo", parrot.getSound());
		parrot.setSound(new CatSound());
		Assert.assertEquals("Meow", parrot.getSound());
		parrot.setSound(new DogSound());
		Assert.assertEquals("Woof, woof", parrot.getSound());
		parrot.setSound(new DuckSound());
		Assert.assertEquals("Quack, quack", parrot.getSound());	
		parrot.setSound(new PhoneSound());
		Assert.assertEquals("Reng, reng", parrot.getSound());	
	}
}
