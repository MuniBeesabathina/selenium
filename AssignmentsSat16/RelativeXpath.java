package AssignmentsSat16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
			WebDriver dr=new ChromeDriver();
	        dr.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
	      //table[@class='Record']
	      //table[@class='Record']//child::tbody
	        //table[@class='Record']//child::tbody/tr[3]/td[2]   
	     //for firstname textbox in codecharge  
	        dr.findElement(By.xpath("//table[@class='Record']//child::tbody/tr[3]/td[2]"));
	}

}
