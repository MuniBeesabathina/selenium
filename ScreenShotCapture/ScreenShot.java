package ScreenShotCapture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.steadystate.css.util.Output;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShot {
	public static WebDriver dr;
	
	
	public static void screenshot1(){
		
		
		File screenshot1=((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		try
		{
			String screenshotLocation="C:\\Users\\BLTuser.BLT172\\Desktop\\Muni\\exp.jpg";
			FileUtils.copyFile(screenshot1, new File(screenshotLocation));
		}
		catch(IOException e)
		{
		e.printStackTrace();	
		}
	
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
	      dr=new ChromeDriver();
	      dr.get("http://demowebshop.tricentis.com/login");
	      WebDriverWait wt=new WebDriverWait(dr,15);
	      wt.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")));
        dr.findElement(By.name("Email")).sendKeys("muniyogith@gmail.com");
	      dr.findElement(By.id("Password")).sendKeys("muni42812345");
	     dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	     System.out.println("element is present");
	     ScreenShot.screenshot1();
	     
	     
	   /*  File screenshot1=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			try
			{
				String screenshotLocation="C:\\Users\\BLTuser.BLT172\\Desktop\\Muni\\exp.jpg";
				FileUtils.copyFile(screenshot1, new File(screenshotLocation));
			}
			catch(IOException e)
			{
			e.printStackTrace();	
			}
			
	     screenshot1=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)). takeScreenshot(dr);
	     ImageIO.write(screenshot.getImage(),"jpg",new File("C:\\Users\\BLTuser.BLT172\\Desktop\\Muni\\exp.jpg"));*/
	}
	

}
