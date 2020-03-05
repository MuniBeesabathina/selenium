package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
	      WebDriver dr=new ChromeDriver();
	      dr.get("http://demowebshop.tricentis.com/login");
	      dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	      dr.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	      dr.findElement(By.name("Email")).sendKeys("muniyogith@gmail.com");
	      dr.findElement(By.id("Password")).sendKeys("muni42812345");
	     dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	      

	}
}