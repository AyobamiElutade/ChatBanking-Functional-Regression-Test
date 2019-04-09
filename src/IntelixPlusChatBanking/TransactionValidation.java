package IntelixPlusChatBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TransactionValidation { //Class for Validating Pin Correctness

	WebDriver driver; //Webdriver Method
	
	String baseURL = "https://chatbanking.firstbanknigeria.com/whatsappWebApp/account/balance/43ba7abf-de18-4ef4-b1df-0898f6c2d30f";
	String FirstDigitPin=  "2";
	String SecondDigitPin= "9";
	String ThirdDigitPin=  "1";
	String FourthDigitPin= "7";
	
    
	@Test
	public void CredentialValidation () {
		System.out.println("Start execution");
		
		//Enter First Pin
		WebElement Pin1 = driver.findElement(By.xpath("//body//div//input[1]"));
		Pin1.sendKeys(FirstDigitPin);
		
		//Enter SecondPin
		WebElement Pin2 = driver.findElement(By.xpath("//body//input[2]"));
		Pin2.sendKeys(SecondDigitPin);
		
		//Enter ThirdPin
		WebElement Pin3 = driver.findElement(By.xpath("//body//input[3]"));
		Pin3.sendKeys(ThirdDigitPin);
		
		//Enter FourthPin
		WebElement Pin4 = driver.findElement(By.xpath("//body//input[4]"));
		Pin4.sendKeys(FourthDigitPin);
		
		//Click Submit
		WebElement sub = driver.findElement(By.xpath("//button[@class='btn custom_btn']"));
		sub.click();		
		}
	
	@Test
	public void SettingsValidation () {
	
	//Enter FirstPin
	WebElement OldPin1 = driver.findElement(By.xpath("//div[@class='main_div']//div[1]//div[1]//div[2]//div[1]//input[1]"));
	OldPin1.sendKeys(FirstDigitPin);
		
	//Enter SecondPin
	WebElement OldPin2 = driver.findElement(By.xpath("//div[@class='main_div']//div[1]//div[1]//div[2]//div[1]//input[2]"));
	OldPin2.sendKeys(SecondDigitPin);
	
	//Enter ThirdPin
	WebElement OldPin3 = driver.findElement(By.xpath("//div[@class='main_div']//div[1]//div[1]//div[2]//div[1]//input[3]"));
	OldPin3.sendKeys(ThirdDigitPin);
	
	//Enter FourthPin
	WebElement OldPin4 = driver.findElement(By.xpath("//div[@class='main_div']//div[1]//div[1]//div[2]//div[1]//input[4]"));
	OldPin4.sendKeys(FourthDigitPin);
		
    //Enter FirstNewPin
	WebElement NewPin1 = driver.findElement(By.xpath("//div[2]//div[1]//div[2]//div[1]//input[1]"));
	NewPin1.sendKeys(FirstDigitPin);
	
	//Enter SecondNewPin
	WebElement NewPin2 = driver.findElement(By.xpath("//div[2]//div[1]//div[2]//div[1]//input[2]"));
	NewPin2.sendKeys(SecondDigitPin);
	
	//Enter ThirdNewPin
	WebElement NewPin3 = driver.findElement(By.xpath("//div[2]//div[1]//div[2]//div[1]//input[3]"));
	NewPin3.sendKeys(ThirdDigitPin);
	
	//Enter FourthNewPin
	WebElement NewPin4 = driver.findElement(By.xpath("//div[2]//div[1]//div[2]//div[1]//input[4]"));
	NewPin4.sendKeys(FourthDigitPin);
	
	//Enter VerifyPin1
	WebElement VerifyPin1 = driver.findElement(By.xpath("//div[@class='MainForm']//div[3]//div[1]//div[2]//div[1]//input[1]"));
	VerifyPin1.sendKeys(FirstDigitPin);
	
	//Enter VerifyPin2
	WebElement VerifyPin2 = driver.findElement(By.xpath("//div[@class='MainForm']//div[3]//div[1]//div[2]//div[1]//input[2]"));
	VerifyPin2.sendKeys(SecondDigitPin);
	
	//Enter VerifyPin3
	WebElement VerifyPin3 = driver.findElement(By.xpath("//div[@class='MainForm']//div[3]//div[1]//div[2]//div[1]//input[3]"));
	VerifyPin3.sendKeys(ThirdDigitPin);
	
	//Enter VerifyPin4
	WebElement VerifyPin4 = driver.findElement(By.xpath("//div[@class='MainForm']//div[3]//div[1]//div[2]//div[1]//input[4]"));
	VerifyPin4.sendKeys(FourthDigitPin);
	
	//Click Confirm
	WebElement Confirm = driver.findElement(By.xpath("//button[@class='btn custom_btn']"));
	Confirm.click();
		
	}
	
	
	
	
	@BeforeMethod
	public void setUp () {
		System.out.println("Setting browser");
		driver = Utilities.DriverFactory.open("Chrome"); //Choose Chrome
		driver.get(baseURL);                                //Open Browser
	}


	// @AfterMethod	
	public void closePage () {
		System.out.println("Close Browser");
		driver.quit();
		
	}
	

@DataProvider

public String[][] getData() {
	
	return Utilities.Excel.get("C:\\Users\\Ayobami\\Documents\\tess.xls");
}

	
	
	
}
