package tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import baseConfig.BaseConfigs;

public class LoginTest {

	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	
@BeforeMethod
public void setup(){
	driver = BaseConfigs.createDriver("firefox");
//	driver = BaseConfigs.createDriver("ie");
//	driver = BaseConfigs.createDriver("chrome");
	loginPage = new LoginPage(driver);	
	homePage = new HomePage(driver);
}

@Test
public void TC_01_Login(){
	loginPage.driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
	String username = "ccolon";
	String password = "123456"; 
	String name = "Cristobal";
	
	loginPage.doLogin(username, password);
	Assert.assertTrue(homePage.pageLoads(), "La pagina no cargo");
	Assert.assertTrue(homePage.verifyCorrectUser(name), "El nombre es incorrecto");
}

@Test
public void TC_02_Login(){
	loginPage.driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
	String username = "ccolon";
	String password = "12"; 
	String name = "Cristobal";
	
	loginPage.doLogin(username, password);
	Assert.assertTrue(homePage.pageLoads(), "La pagina no cargo");
	Assert.assertTrue(homePage.verifyCorrectUser(name), "El nombre es incorrecto");
}

@Test
public void TC_03_Login(){
	loginPage.driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
	String username = "ccolon";
	String password = "9999"; 
	String name = "Cristobal";
	
	loginPage.doLogin(username, password);
	Assert.assertTrue(homePage.pageLoads(), "La pagina no cargo");
	Assert.assertTrue(homePage.verifyCorrectUser(name), "El nombre es incorrecto");
}

@Test
public void TC_04_Login(){
	loginPage.driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
	String username = "paco";
	String password = "123456"; 
	String name = "Cristobal";
	
	loginPage.doLogin(username, password);
	Assert.assertTrue(homePage.pageLoads(), "La pagina no cargo");
	Assert.assertTrue(homePage.verifyCorrectUser(name), "El nombre es incorrecto");
}


@AfterMethod
public void closeup(){
	driver.quit();
}


}
