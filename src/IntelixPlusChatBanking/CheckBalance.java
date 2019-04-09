package IntelixPlusChatBanking;

import org.testng.annotations.Test;

@Test	
public class CheckBalance extends TransactionValidation { //Inherit transaction validation class

	public static void main(String[] args) {
	  //Create CheckBalanceTest Object	
	  CheckBalance CheckBalanceTest = new CheckBalance();
	  
	//OpenBrowser
	  CheckBalanceTest.setUp();
	  
	//Check Balance after inserting Pin for Validation
	  CheckBalanceTest.CredentialValidation();
	  
	}

}
