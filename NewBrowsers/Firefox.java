package NewBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
public static WebDriver dr;
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		dr=new FirefoxDriver();
		dr.get("http://demowebshop.tricentis.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//WebElement linkdownload=dr.findElement(arg0)
		
		
	}

}
