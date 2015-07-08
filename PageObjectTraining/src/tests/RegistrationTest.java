package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.RegistrationPage;
import baseConfig.BaseConfigs;

public class RegistrationTest {

	WebDriver driver;
	RegistrationPage registrationPage;
	LoginPage loginPage;

	@BeforeMethod
	public void setup() {
		driver = BaseConfigs.createDriver("firefox");
		// driver = BaseConfigs.createDriver("ie");
		// driver = BaseConfigs.createDriver("chrome");
		registrationPage = new RegistrationPage(driver);
		loginPage = new LoginPage(driver);	
	}
	
	@Test
	public void TC_01_Registration(){
		registrationPage.driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
		String username = "ironman";
		String name = "Tony";
		String lastname = "Stark";
		String phone = "88888888";
		String email1 = "ironman@avantica.net";
		String email2 = "ironman@avantica.net";
		String pass1 = "jarvis";
		String pass2 = "jarvis";
		int country = 40;
		int question = 15;
		String answer = "Old Clock";
		
		registrationPage.doRegistration(username, name, lastname, phone, email1, email2, pass1, pass2, country, question, answer);
		Assert.assertTrue(loginPage.pageLoads(), "La pagina de inicio no cargo, el usuario no se creo correctamente");
	}
	
	@Test
	public void TC_02_Registration(){
		registrationPage.driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
		String username = "ironman";
		String name = "Tony";
		String lastname = "Stark";
		String phone = "88888888";
		String email1 = "ironman@avantica.net";
		String email2 = "ironman@avantica.net";
		String pass1 = "jarvis";
		String pass2 = "jarvis";
		int country = 40;
		int question = 15;
		String answer = "";
		
		registrationPage.doRegistration(username, name, lastname, phone, email1, email2, pass1, pass2, country, question, answer);
		Assert.assertTrue(loginPage.pageLoads(), "La pagina de inicio no cargo, el usuario no se creo correctamente");
	}
	
	@Test
	public void TC_03_Registration(){
		registrationPage.driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
		String username = "superman";
		String name = "Clark";
		String lastname = "Kent";
		String phone = "88888888";
		String email1 = "ironman@avantica.net";
		String email2 = "ironman@gmail.net";
		String pass1 = "lois";
		String pass2 = "lois";
		int country = 40;
		int question = 15;
		String answer = "Kriptonite";
		
		registrationPage.doRegistration(username, name, lastname, phone, email1, email2, pass1, pass2, country, question, answer);
		Assert.assertTrue(loginPage.pageLoads(), "La pagina de inicio no cargo, el usuario no se creo correctamente");
	}
	
	@Test
	public void TC_04_Registration(){
		registrationPage.driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
		String username = "greenlantern";
		String name = "John";
		String lastname = "Stewart";
		String phone = "88888888";
		String email1 = "greenlantern@avantica.net";
		String email2 = "greenlantern@avantica.net";
		String pass1 = "green";
		String pass2 = "ring";
		int country = 40;
		int question = 5;
		String answer = "Linterna";
		
		registrationPage.doRegistration(username, name, lastname, phone, email1, email2, pass1, pass2, country, question, answer);
		Assert.assertTrue(loginPage.pageLoads(), "La pagina de inicio no cargo, el usuario no se creo correctamente");
	}
	
	
	@AfterMethod
	public void closeup(){
		driver.quit();
	}

}
