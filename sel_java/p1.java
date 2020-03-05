package sel_java;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
 WebDriver dr=new ChromeDriver();
dr.get("http://demowebshop.tricentis.com/login");
dr.findElement(By.id("email")).sendKeys("likhithasingh211@gmail.com");
dr.findElement(By.name("password")).sendKeys("SELENIUM");
dr.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
