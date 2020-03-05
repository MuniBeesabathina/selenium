package com.test.MyFirstTestNGProject1;

import org.testng.annotations.Test;

public class TimeOutTest {
	@Test(timeOut=5000)
	public void testTimeOut()
	{
		System.out.println("iam in  testTimeOut");
	}

}
