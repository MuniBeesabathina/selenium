package DDFW_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerdemo {
  String register(int r)
{
	 user u=new user();
	 Readandwrite rnw=new Readandwrite();
	 u=rnw.Read(r);
	 System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
WebDriver g=new ChromeDriver();
g.get("http://demowebshop.tricentis.com/register");
List wb=g.findElements(By.name("Gender"));
if(u.gender.equals("Male"))
{
	((WebElement) wb.get(0)).click();
}
else if(u.gender.equals("Female"))
	((WebElement) wb.get(1)).click();
	
g.findElement(By.id("FirstName")).sendKeys(u.first);
g.findElement(By.id("LastName")).sendKeys(u.last);
g.findElement(By.id("Email")).sendKeys(u.mail);
g.findElement(By.id("Password")).sendKeys(u.passward);
g.findElement(By.id("ConfirmPassword")).sendKeys(u.passward);
g.findElement(By.xpath("//*[@id='register-button']")).click();
String	ck=g.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
g.close();
return ck;
}
}
