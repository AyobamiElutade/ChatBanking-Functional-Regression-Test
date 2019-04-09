package DataDrivenTestTemplate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BuyAirtimeWithCorrectPin {
	WebDriver driver;
	String baseURL = "https://chatbanking.firstbanknigeria.com/whatsappWebApp/payment/airtime/fa5d0386-1f52-4aab-bf66-908fdeb591e9";
	//String browserType = "Chrome";

	
@Test(dataProvider = "getData")
public void AirtimepurchaseTest(String FirstDigitPin, String SecondDigitPin, String ThirdDigitPin, String FourthDigitPin) {
//System.out.println(FirstDigitPin + SecondDigitPin + ThirdDigitPin + FourthDigitPin );

//1. Enter First digit pin.
		WebElement firstpin = driver.findElement(By.xpath("//body//div//input[1]"));
		firstpin.sendKeys(FirstDigitPin);
		
//2. Enter second digit pin.
	 WebElement secondpin = driver.findElement(By.xpath("//body//input[2]"));
	 secondpin.sendKeys(SecondDigitPin);
	 
//3. Enter third digit pin.
	 WebElement thirdpin = driver.findElement(By.xpath("//body//input[3]"));
	 thirdpin.sendKeys(ThirdDigitPin);
	 
// 4. Enter fourth digit pin.
	 WebElement fourthpin = driver.findElement(By.xpath("//body//input[4]"));
	 fourthpin.sendKeys(FourthDigitPin);
	 
//5 .Click submit button.
	 WebElement submitbutton = driver.findElement(By.xpath("//button[@class='btn custom_btn']"));
	submitbutton.click();
	
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
