package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
	      WebDriver dr=new ChromeDriver();
	      dr.get("http://demowebshop.tricentis.com/login");
	      WebDriverWait wt=new WebDriverWait(dr,15);
	      wt.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")));
          dr.findElement(By.name("Email")).sendKeys("muniyogith@gmail.com");
	      dr.findElement(By.id("Password")).sendKeys("muni42812345");
	     dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	     System.out.println("element is present");
	}

}
