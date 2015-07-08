package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

	@FindBy(id="j_idt7:username")
	private WebElement usernameInput;
	
	@FindBy(id="j_idt7:nombre")
	private WebElement nameInput;
	
	@FindBy(id="j_idt7:apellidos")
	private WebElement lastnameInput;
	
	@FindBy(id="j_idt7:telefono")
	private WebElement phoneInput;
	
	@FindBy(id="j_idt7:correo1")
	private WebElement email1Input;
	
	@FindBy(id="j_idt7:correo2")
	private WebElement email2Input;
	
	@FindBy(id="j_idt7:pass1")
	private WebElement pass1Input;
	
	@FindBy(id="j_idt7:pass2")
	private WebElement pass2Input;
	
	@FindBy(xpath=".//*[@id='j_idt7:paises_panel']/div/ul/li")
	private List<WebElement> countryMenu;
	
	@FindBy(id="j_idt7:paises_label")
	private WebElement countryDropdown;
	
	@FindBy(xpath=".//*[@id='j_idt7:preguntas_panel']/div/ul/li")
	private List<WebElement> questionMenu;
	
	@FindBy(id="j_idt7:preguntas_label")
	private WebElement questionDropdown;
	
	@FindBy(id="j_idt7:respuesta")
	private WebElement answerInput;
	
	@FindBy(id="j_idt7:registrarUsuario")
	private WebElement registrationButton;
	
	public WebDriver driver; 
	
	
	/*CONSTRUCTOR*/
	public RegistrationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	
	/*METHODS*/
	public void doRegistration(String username, String name, String lastname, String phone, String email1, String email2, String pass1, String pass2, int country, int question, String answer){
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id("avatarImag")));
		usernameInput.sendKeys(username);
		nameInput.sendKeys(name);
		lastnameInput.sendKeys(lastname);
		phoneInput.sendKeys(phone);
		email1Input.sendKeys(email1);
		email2Input.sendKeys(email2);
		pass1Input.sendKeys(pass1);
		pass2Input.sendKeys(pass2);
		
		countryDropdown.click();
		new WebDriverWait(driver, 30);
		countryMenu.get(country).click();
		
		questionDropdown.click();
		new WebDriverWait(driver, 30);
		questionMenu.get(question).click();
		
		answerInput.sendKeys(answer);
		
		registrationButton.click();
	}
	
}
