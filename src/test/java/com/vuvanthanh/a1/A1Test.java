package com.vuvanthanh.a1;

import org.junit.Before;
import org.junit.Test;


public class A1Test 
{

	private Bird bird;

	@Before
	public void setUp() throws Exception {
		bird = new Bird();
	}
	
	@Test
	public void testFly()
	{
		bird.fly();
	}

	@Test
	public void tesWalk()
	{
		bird.walk();
	}
}
