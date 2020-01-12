package os.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import os.PageElements.OSLoginElements;
import os.utilities.SetupDrivers;

public class OSLoginActions {
	
	OSLoginElements loginElements;
	
	public OSLoginActions() {
		loginElements=new OSLoginElements();
		PageFactory.initElements(SetupDrivers.driver,loginElements);	
	}
	
	public void launchOSLoginPage(){
		
		SetupDrivers.driver.get("https://demo.oscommerce.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void inputMyAccount() {
		loginElements.MyAccount.click();
	}
	
	public void inputEmailAddress(String EmailAddress) {
		loginElements.EmailAddress.sendKeys(EmailAddress);
	}
	
	public void inputPassword(String Password) {
		loginElements.Password.sendKeys(Password);
	}
	
	public void signin() {
		loginElements.Signin.click();
	}

}
