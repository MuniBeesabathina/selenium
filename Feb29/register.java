package Feb29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class register
{
public static WebDriver driver;
@FindBy(name="FirstName")
public static WebElement firstnameTextField;
@FindBy(name="LastName")
public static WebElement lastnameTextField;
@FindBy(id="Email")
public static WebElement emailTextField;
@FindBy(id="Password")
public static WebElement passwordTextField;
@FindBy(name="ConfirmPassword")
public static WebElement confirmpasswordTextField;
@FindBy(id="gender-male")
public static WebElement maleRadioButton;
@FindBy(id="gender-female")
public WebElement femaleRadioButton;
@FindBy(name="register-button")
public static WebElement registerRadioButton;
public static void validregistration()
{
maleRadioButton.click();
firstnameTextField.sendKeys("prem");
lastnameTextField.sendKeys("sai");
emailTextField.sendKeys("premsaisanju123@gmail.com");
passwordTextField.sendKeys("premsai");
confirmpasswordTextField.sendKeys("premsai");
registerRadioButton.click();

}
}

