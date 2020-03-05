package Demoweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		String er="muniyogith@gmail.com";
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/login");
		dr.findElement(By.id("Email")).sendKeys("muniyogith@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("muni42812345");
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String s= dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		if(er.equals(s))
		System.out.println("pass");
		else
		System.out.println("Fail");


	}

}
