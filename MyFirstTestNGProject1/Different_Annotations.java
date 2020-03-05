package com.test.MyFirstTestNGProject1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Different_Annotations {
	

@BeforeTest
public void beforeTest()
{
	System.out.println("iam in BeforeTest");
}
@Test
public void test()
{
	System.out.println("iam in main method");
}
@AfterTest
public void afterTest()
{
	System.out.println("iam in AfterTest");
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("iam in beforemethod");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("iam in aftermethod");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("iam in beforeclass");
}
@AfterClass
public void afterclass()
{
	System.out.println("iam in afterclass");
}
@Test
public void m2()
{
	System.out.println("iam in m2 method");
}



}
