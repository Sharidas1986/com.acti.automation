package come.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import come.acti.base.DriverManager;

/*
 * Class: HomePage
 * Description: Home page elements and actions
 * Developed by: Shiju Haridas
 * Date: 24/11/2022
 * Reviewed by: Shiju Haridas
 */

public class HomePage extends DriverManager{
	
	
	//******************************************************* Page Elements ************************************************//
	
	@FindBy(xpath = "//a[@class='userProfileLink username ']") WebElement usernameLabel;
	@FindBy(id="logoutLink") WebElement logoutLink;
	@FindBy(id="container_tasks") WebElement Headertaskicon;
	
	//******************************************************* Page Initialization ************************************************//
	
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//******************************************************* Page Methods ************************************************//
	
	
	public String verifyUserLoggedIn()
	{
		return usernameLabel.getText();
	}
	
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public void logout()
	{
		logoutLink.click();
	}
	

}
