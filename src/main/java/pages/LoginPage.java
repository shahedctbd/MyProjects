package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON;
	
	
	
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
		
	}
	
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON.click();
		
	}
	
	public String getPageTitel() {
		
		return driver.getTitle();
	}
	

}
