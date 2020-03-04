package test.MyFirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launchbrowser {
	public static void main(String[] args) {
		{
			
			System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
			WebDriver dr=new ChromeDriver();
			
		dr.get("http://demowebshop.tricentis.com/register");

}
	}
}
