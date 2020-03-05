package com.test.MyFirstTestNGProject1;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=3)
	public void m1()
	{
		System.out.println("iam in m1");
	}
	@Test(priority=2)
	public void m2()
	{
		System.out.println("iam in m2");
	}
	@Test(priority=1)
	public void m3()
	{
		System.out.println("iam in m3");
	}

}
