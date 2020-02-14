package com.vuvanthanh.b2;

import org.junit.Test;
import junit.framework.Assert;

public class B2Test {

	@Test
	public void test(){
		
		Fishes shark1 = new Shark();
		Assert.assertEquals("Sharks don't sing", shark1.sing());
		Assert.assertEquals("Sharks can swim", shark1.swim());
		Assert.assertEquals("Sharks don't walk", shark1.walk());
		
		Fishes clownfish1 = new Clownfish();
		Assert.assertEquals("Clownfish don't sing", clownfish1.sing());
		Assert.assertEquals("Clownfish can swim", clownfish1.swim());
		Assert.assertEquals("Clownfish don't walk", clownfish1.walk());

		Shark shark2 = new Shark();
		shark2.setNature(new SharkNature());
		Assert.assertEquals("Sharks eat other fish", shark2.getAction());
		Assert.assertEquals("Sharks are large and grey", shark2.getColor());

		Clownfish clownfish2 = new Clownfish();
		clownfish2.setNature(new ClownfishNature());
		Assert.assertEquals("Clownfish make jokes", clownfish2.getAction());
		Assert.assertEquals("Clownfish are small and colourful (orange)", clownfish2.getColor());
	}
}
