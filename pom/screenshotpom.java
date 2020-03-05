package pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotpom {

WebDriver dr;

void Screenshottaking(int n,WebDriver dr)
{
		
		File screenshot1=((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		try
		{
			String screenshotLocation="C:\\Users\\BLTuser.BLT172\\Desktop\\Muni\\st"+n+".png";
			FileUtils.copyFile(screenshot1, new File(screenshotLocation));
		}
		catch(IOException e)
		{
		e.printStackTrace();	
		}
	
	}
}
