package come.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import come.acti.base.DriverManager;

public class TaskListPage extends DriverManager{
	
	
	//************************************ Page Elements *************************************
	
	@FindBy(xpath = "//div[text()='Add New']") WebElement AddNewButton;
	@FindBy(xpath = "//div[text()='+ New Customer']") WebElement AddNewCustomer;
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement AddCustomerName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement AddCustomerDescription;
	
	
	
	//********************************* Page Initialization **********************************
	
	public TaskListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//************************************ Page Methods **************************************
	
	public void clickAddNew()
	{
		AddNewButton.click();
	}
	
	public void click_Create_NewCustomer()
	{
		AddNewCustomer.click();
	}
	
	public void Add_Customername(String cust_name)
	{
		AddCustomerName.sendKeys(cust_name);
	}
	
	public void Add_Customerdescription(String cust_desc)
	{
		AddCustomerDescription.sendKeys(cust_desc);
	}
	

}
