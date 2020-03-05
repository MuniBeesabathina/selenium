package NewBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver dr=new InternetExplorerDriver();
		dr.get("https://www,facebook.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
		/*public static void loginpage() throws Exception
		{
		WebElement txtFirstName=dr.findElement(arg0)
				
		
	}*/

}
