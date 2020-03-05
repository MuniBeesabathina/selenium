package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("https://www.w3schools.com/html/html_tables.asp");
        String xp;
        int r=2,c=3;
        for(r=2;r<=7;r++)
        {
        	for(c=1;c<=3;c++)
        	{
        
        xp="//*[@id='customers']/tbody/tr["+r+"]/td["+c+"]";
        String s1=dr.findElement(By.xpath(xp)).getText();
        System.out.print(s1 +" ");
        	}
        	System.out.println();		
	}

}
}
