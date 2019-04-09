package IntelixPlusChatBanking;

import org.testng.annotations.Test;

@Test	
public class BuyData extends TransactionValidation { //Inherit transaction validation class

	public static void main(String[] args) {
	  //Create BuyDataTest Object	
	  BuyData BuyDataTest = new BuyData();
	  
	//OpenBrowser
	  BuyDataTest.setUp();
	  
	//SendMoney after inserting Pin for Validation
	  BuyDataTest.CredentialValidation();
	  
	}

}
