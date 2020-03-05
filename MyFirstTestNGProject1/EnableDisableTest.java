package com.test.MyFirstTestNGProject1;

import org.testng.annotations.Test;

public class EnableDisableTest {
	@Test(enabled=true)
	public void enableTest()
	{
		System.out.println("iam in enableTest");
	}
	@Test(enabled=false)
	public void disableTest()
	{
		System.out.println("iam ind disableTest");
	}

}
