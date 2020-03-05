package Feb29;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login
{
public static WebDriver driver;
@FindBy(id="Email")
public static WebElement EmailTextField;
@FindBy(id="Password")
public static WebElement PasswordTextField;
@FindBy(xpath="html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
public static WebElement LoginButtonField;

public static void validlogin()
{
EmailTextField.clear();
EmailTextField.sendKeys("premsaisanju@gmail.com");
PasswordTextField.clear();
PasswordTextField.sendKeys("premsai");
LoginButtonField.click();
}
}


