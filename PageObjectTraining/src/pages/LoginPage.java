package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	@FindBy(id="formLogin:username")
	private WebElement usernameInput;
	
	@FindBy(id="formLogin:pass")
	private WebElement passwordInput;
	
	@FindBy(id="formLogin:ingresar")
	private WebElement loginButton;
	
	public WebDriver driver; 
	
	/*Constructor*/
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void doLogin(String username, String password){
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(loginButton));
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginButton.click();
	}
	
	public boolean pageLoads(){
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(loginButton));
		return (ExpectedConditions.visibilityOf(loginButton) != null);
	}
	
}
