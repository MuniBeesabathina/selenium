package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterJava {
public static WebDriver dr;

@FindBy(id="gender-male")
public WebElement gendermaleradiobutton;
@FindBy(id="gender-female")
public WebElement genderfemaleradiobutton;
@FindBy(name="FirstName")
public WebElement firstnametextbox;
@FindBy(name="LastName")
public WebElement lastnametextbox;
@FindBy(name="Email")
public WebElement emailtextbox;
@FindBy(id="Password")
public WebElement passwordtextbox;
@FindBy(name="ConfirmPassword")
public WebElement confirmpasswordtextbox;
@FindBy(xpath="//*[@id='register-button']")
public WebElement registerbutton;
public void validRegistrationMale(String firstname,String lastname,String email,String password,String confirmpassword)
{
	/*if(gender.equals("male"))
	gendermaleradiobutton.click();
	else*/
		gendermaleradiobutton.click();
	 firstnametextbox.clear();
	 firstnametextbox.sendKeys(firstname);
	 lastnametextbox.clear();
	 lastnametextbox.sendKeys( lastname);
	 passwordtextbox.clear();
	 emailtextbox.clear();
	 emailtextbox.sendKeys(email);
	 passwordtextbox.sendKeys(password);
	 confirmpasswordtextbox.clear();
	 confirmpasswordtextbox.sendKeys(confirmpassword);
	 registerbutton.click();
}
public void validRegistrationFemale(String firstname,String lastname,String email,String password,String confirmpassword)
{
	genderfemaleradiobutton.click();
	 firstnametextbox.clear();
	 firstnametextbox.sendKeys(firstname);
	 lastnametextbox.clear();
	 lastnametextbox.sendKeys( lastname);
	 passwordtextbox.clear();
	 emailtextbox.clear();
	 emailtextbox.sendKeys(email);
	 passwordtextbox.sendKeys(password);
	 confirmpasswordtextbox.clear();
	 confirmpasswordtextbox.sendKeys(confirmpassword);
	 registerbutton.click();
}

}
