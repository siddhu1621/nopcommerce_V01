package StepDefination;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObject.AddNewCustomer;
import pageObject.LogInPage;
import pageObject.SearchCustomer;

public class BaseClass {

	public static  WebDriver driver;
	public LogInPage loginPg;
	public SearchCustomer SearchCustPg;
	public AddNewCustomer addNewCustPg;
	public static Logger log;
	public Properties Configprop;
	
	
	//generate unique email id
	public String generateEmailId()
	{
		return(RandomStringUtils.randomAlphabetic(5));
	}
	
}
