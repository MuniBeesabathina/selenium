package sel_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		 WebDriver dr=new ChromeDriver();
		 dr.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		 List a1=dr.findElements(By.name("optradio"));
		 ((WebElement)a1.get(1)).click();
		 String s1="Radio button 'Female' is checked";
		 dr.findElement(By.id("buttoncheck")).click();
		  String xp="//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[3]";
		  String xp1="//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]";
		  String s=dr.findElement(By.xpath(xp)).getText();
		 		if(s1.equals(s))
		 			System.out.println("pass");
		 		else
		 			System.out.println("fail");

	}

}
