package sel_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		 WebDriver dr=new ChromeDriver();
		 dr.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		 
		 List kr=dr.findElements(By.name("gender"));
		 ((WebElement)kr.get(0)).click();
		 
		 List kr1=dr.findElements(By.name("age group"));
		 ((WebElement)kr.get(1)).click();
		 String xp="//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/button";
		 dr.findElement(By.xpath(xp)).click();
		 
		 String a="//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]";
		 String o=dr.findElement(By.xpath(xp)).getText();
		System.out.println(o);
	}

}
