package Alert;

import java.io.FileNotFoundException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertprog {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demo.guru99.com/test/delete_customer.php");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("asdf");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		try{
			Thread.sleep(3000);
		}
	 catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Alert a=dr.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		//a.dismiss();
		try{
			Thread.sleep(3000);
		}
	 catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Alert a1=dr.switchTo().alert();
		String s1=a.getText();
		a1.accept();
		System.out.println(s1);
			
}
}
