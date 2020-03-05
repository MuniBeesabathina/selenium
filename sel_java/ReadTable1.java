package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		 dr.get("https://www.w3schools.com/css/css_table.asp");
		 int r,c;
		
		 for(r=2;r<=7;r++)
		 {
		 if((dr.findElement(By.xpath("//*[@id='customers']/tbody/tr["+r+"]/td["+3+"]")).getText()).equals("Mexico"))

		 {
		 for(c=1;c<=3;c++)
		 {
		 System.out.print(dr.findElement(By.xpath("//*[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText()+"\t");
		 }
		 }
		  }
		}
		}
//*[@id="customers"]/tbody/tr[5]/td[3]