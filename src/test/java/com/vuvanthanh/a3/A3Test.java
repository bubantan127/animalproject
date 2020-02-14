package com.vuvanthanh.a3;

import org.junit.Test;
import junit.framework.Assert;

public class A3Test {

	@Test
	public void test(){
		
		//Rooster
		Rooster rooster = new Rooster();
		rooster.setSound(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo",rooster.getSound());
	}
}
