package os.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OSLoginElements {
	
	@FindBy(className="ui-button-text")
	public WebElement MyAccount;
	
	@FindBy(name="email_address")
	public WebElement EmailAddress;
	
	@FindBy(name="password")
	public WebElement Password;
	
	@FindBy(className="ui-button-text")
	public WebElement Signin;

}
