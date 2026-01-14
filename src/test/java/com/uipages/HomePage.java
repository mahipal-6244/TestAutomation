package com.uipages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HomePage {

	protected WebDriver driver;
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	
	
	
		@FindBy(how = How.XPATH ,using = "(//div[contains(text(), 'Bharat Coking Coal Ltd.')])[2]")
		 private WebElement  BCCLBtn;
		
		
		
		
		@FindBy(how = How.XPATH ,using = "(//button[@type=\"button\"])[1]")
		 private WebElement Menu;
		
		
		@FindBy(how = How.XPATH ,using = "//h6[contains(text(), 'Mainboard IPO')]")
		 private WebElement MainBoardIPO;
		
		@FindBy(how = How.XPATH ,using = "(//div[contains(text(), 'Meesho Ltd.')])[2]")
		 private WebElement MeeshoIPO;
		
		
		
		 @FindBy(how = How.XPATH, using = "//a[@title = 'Bharat Coking Coal Ltd. GMP']")
		 private WebElement GMP ;
		 
		
		
		
		 @FindBy(how = How.XPATH, using = "//img[@title= 'Todays Movement - GMP Up']")
		 private WebElement GMPTable;
		 
		 
		 public void ClickonMenu() {
			 Menu.click();
		 }
		 public void ClickonMainBoardIPO() {
			 MainBoardIPO.click();
		 }
		 public void ClickonMeeshoIPO() {
			 MeeshoIPO.click();
		 }
		 
		 public void ClickonGMPlink() {
			GMP.click();
		 }
		 
		 public void clickonBCCLLBtn() {
			 
			BCCLBtn.click();
		 }

		public void ScrollToTable() {
			Actions actions = new Actions(driver);
			actions.scrollToElement(GMPTable);
			
			
		}
		  
		public void Tabledata() {
			
			/*
			 * JavascriptExecutor je = (JavascriptExecutor)driver;
			 * 
			 * je.executeScript("arguments[0].scrollIntoView(true);", GMPTable);
			 */
			
			GMPTable.click();
			
			
		}
	
}




