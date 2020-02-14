package com.vuvanthanh.b3;

import org.junit.Test;
import junit.framework.Assert;

public class B3Test {

	@Test
	public void test(){
		
		IfSwim d = new Dolphin();
		Assert.assertEquals("Dolphins, they are good swimmers", d.swim());
	}
}
