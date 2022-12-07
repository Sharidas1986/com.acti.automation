package come.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Class: LoginPage
 * Description: Login page elements and actions
 * Developed by: Shiju Haridas
 * Date: 24/11/2022
 * Reviewed by: Shiju Haridas
 */

import come.acti.base.DriverManager;

public class LoginPage extends DriverManager{
	
	
	//******************************************************* Page Elements ************************************************//
	
	@FindBy(id="username") WebElement usernameTextbox;
	@FindBy(name="pwd") WebElement passwordTextbox;
	@FindBy(xpath = "//div[text()='Login ']") WebElement loginButton;
	@FindBy(linkText = "Forgot your password?") WebElement forgotPasswordLink;
	@FindBy(className = "atLogoImg") WebElement actiImage;
	
	//******************************************************* Page Initialization ************************************************//
	
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//******************************************************* Page Methods ************************************************//
	
	
	public void username(String username)
	{
		usernameTextbox.sendKeys(username);
	}
	
	public void password(String password)
	{
		passwordTextbox.sendKeys(password);
	}
	
	public void clickLogin() 
	{
		loginButton.click();
	}
	
	public boolean ForgotPassword()
	{
		return forgotPasswordLink.isDisplayed();
	}
	
	public boolean actiImageLogo()
	{
		return actiImage.isDisplayed();
	}
	
	public String getActiTitle()
	{
		return driver.getTitle();
	}
	

}
