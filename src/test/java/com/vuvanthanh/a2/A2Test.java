package com.vuvanthanh.a2;

import org.junit.Test;
import junit.framework.Assert;

public class A2Test {

	@Test
	public void test(){
		
		//Duck
		Duck duck = new Duck();
		duck.setSound(new DuckSound());
		duck.setFly(new FlyYes());
		duck.setSwim(new DuckSwim());
		Assert.assertEquals("Quack, quack", duck.getSound());
		Assert.assertEquals("I can fly", duck.getFly());		
		Assert.assertEquals("Duck can swim", duck.getSwim());

		//Chicken
		Chicken chicken = new Chicken();
		chicken.setSound(new ChickenSound());
		chicken.setFly(new FlyNo());
		chicken.setSwim(new ChickenSwim());
		Assert.assertEquals("Cluck, cluck",chicken.getSound());
		Assert.assertEquals("I can't fly",chicken.getFly());
		Assert.assertEquals("Chicken can't swim",chicken.getSwim());
	}
}
