package sel_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {
	static WebDriver mr;
	void search(String ssr)
	{
	int i,j;
	for(i=2;i<=7;i++)
	{
	if(mr.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[3]")).getText().equals(ssr))
	{
	for(j=1;j<=3;j++)
	{
	System.out.print(mr.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText()+"\t");
	}
	}
	System.out.println();
	}
	}
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		gr= new ChromeDriver();
		gr.get("https://www.w3schools.com/css/css_table.asp");
		TablePrinting_Ass2 obj=new TablePrinting_Ass2();

		String[] str={"Sweden","UK","Austria"};
		for(int i=0;i<=str.length;i++)
		obj.search(str[i]);

	}

}
