package Feb29;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PremWebDriverCommands
{
public static String homePageTitle;
public static void main(String args[])throws InterruptedException
{
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com");
driver.navigate().to("http://demowebshop.tricentis.com/login");

driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
String currentUrl=driver.getCurrentUrl();
System.out.println("Current Url is:\t "+currentUrl );
Thread.sleep(2000);
String Title=driver.getTitle();
System.out.println("Title is:\t "+Title);
String tag=driver.findElement(By.id("Email")).getTagName();
System.out.println("Current Tag is: \t"+tag);
String attribute=driver.findElement(By.id("Email")).getAttribute("name");
System.out.println("Current Attribute is:\t"+attribute);
Point Location=driver.findElement(By.id("Email")).getLocation();
System.out.println("Current Location is:\t"+Location);
Dimension size=driver.findElement(By.id("Password")).getSize();
System.out.println("Size of attribute is:\t"+size);

}
}
