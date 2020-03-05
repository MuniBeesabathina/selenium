package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver dr=new ChromeDriver();
		 dr.get("http://demowebshop.tricentis.com/");
		 dr.findElement(By.partialLinkText("log")).click();

	}

}
