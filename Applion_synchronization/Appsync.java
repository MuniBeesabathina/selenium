package Applion_synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Appsync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
	      WebDriver dr=new ChromeDriver();
	      dr.get("http://demowebshop.tricentis.com");
	     /* dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);*/   //for implicit wait
	      WebDriverWait wt=new WebDriverWait(dr,20);    // for explicit wait
	      wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ico-login']")));
	      dr.findElement(By.xpath("//a[@class='ico-login//']")).click();
	      

	}

}
