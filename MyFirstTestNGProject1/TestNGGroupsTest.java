package com.test.MyFirstTestNGProject1;

import org.testng.annotations.Test;

public class TestNGGroupsTest {
	@Test(groups={"RegressionTesting"})
	public void m1()
	{
		System.out.println("iam in m1");
	}
	@Test(groups={"RegressionTesting"})
	public void m2()
	{
		System.out.println("iam in m2");
	}
	@Test(groups={"RegressionTesting"})
	public void m3()
	{
		System.out.println("iam in m3");
	}

}
