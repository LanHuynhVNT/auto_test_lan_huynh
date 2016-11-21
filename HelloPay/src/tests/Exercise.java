package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actions.generalFunc.general;
import data.global.variable;
import intefaces.forgotPass.Form;
import intefaces.register.Register;

public class Exercise {
	public WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
		 System.setProperty("webdriver.firefox.marionette","D:\\geckodriver.exe");
		 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	 
	  @AfterMethod
	  public void afterMethod() {
			driver.quit();
	  }
	
	  @Test
	  public void Creating_new_helloPay_account() {
		  driver.navigate().to(variable.lnk_register);
		  driver.findElement(Register.txt_Name).sendKeys(variable.general_name);
		  driver.findElement(Register.txt_Phone).sendKeys(general.generatePhoneNumber());
		  driver.findElement(Register.txt_Email).sendKeys(general.generateEmail());
		  driver.findElement(Register.txt_Password).sendKeys(variable.general_pass);
		  driver.findElement(Register.btn_Register).click();
		  String current_title = driver.getTitle();
		  
		  Assert.assertEquals(current_title, variable.Register_title, "The actual title is: " + current_title);
	  }
	  
	  @Test
	  public void Forgotten_password() {
		  driver.navigate().to(variable.lnk_forgot_pass);
		  driver.findElement(Form.txt_Email).sendKeys(general.generateEmail());
		  driver.findElement(Form.btn_Reset).click();
		  
		  Assert.assertEquals(driver.findElements(Form.lbl_Message).size(), 0);
	  }

}
