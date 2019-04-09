package IntelixPlusChatBanking;

import org.testng.annotations.Test;

@Test	
public class ChangePin extends TransactionValidation { //Inherit transaction validation class

	public static void main(String[] args) {
	  //Create SnedMoneyTest Object	
	  ChangePin ChangePinTest = new ChangePin();
	  
	//OpenBrowser
	  ChangePinTest.setUp();
	  
	//ChangePin
	  ChangePinTest.SettingsValidation();
	  
	}

}
