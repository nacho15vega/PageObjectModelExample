package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
/*
	@FindBy(id="home:MainToolbar")
	private WebElement menuBar;
	
	@FindBy(name="home:j_idt12")
	private WebElement logoutInput;
	
	@FindBy(id="home:j_idt18")
	private WebElement shoppingCartLink;
	
	@FindBy(id="home:j_idt20")
	private WebElement homeLink;
*/	
	@FindBy(id="listaProductos:TablaProductos")
	private WebElement productTable;
	
	@FindBy(id="home:NameProfileOrange")
	private WebElement profileName;
	
	public WebDriver driver; 
	
	/*Constructor*/
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public boolean pageLoads(){
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(productTable));
		return (ExpectedConditions.visibilityOf(productTable) != null);
	}
	
	public boolean verifyCorrectUser(String name){
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(productTable));
		return (name.equals(profileName.getText()));		
	}
	
	

	
}
