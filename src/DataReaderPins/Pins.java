package DataReaderPins;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pins {
	
	
@Test(dataProvider = "getData")
public void Pin(String FirstDigitPin, String SecondDigitPin, String ThirdDigitPin, String FourthDigitPin) {
System.out.println(FirstDigitPin + SecondDigitPin + ThirdDigitPin + FourthDigitPin );	
	
}
	
@DataProvider

public String[][] getData() {
	
	return Utilities.Excel.get("C:\\Users\\Ayobami\\Documents\\tess.xls");
}

	
}
