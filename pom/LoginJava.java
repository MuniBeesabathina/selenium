package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginJava {
	public static WebDriver dr;

	@FindBy(name="Email")
	public WebElement emailtextbox;
	@FindBy(id="Password")
	public WebElement passwordtextbox;
	@FindBy(name="RememberMe")
	public WebElement remembermecheckbox;
	@FindBy(linkText="Forgot password?")
	public WebElement forgotpassword;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	public WebElement loginbutton;
	
	public void validLogIn(String username,String password)
	{
		 emailtextbox.clear();
		 emailtextbox.sendKeys(username);
		 passwordtextbox.clear();
		 passwordtextbox.sendKeys(password);
		 loginbutton.click();
		 
	}

}
