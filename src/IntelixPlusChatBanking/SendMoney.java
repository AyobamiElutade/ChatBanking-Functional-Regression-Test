package IntelixPlusChatBanking;

import org.testng.annotations.Test;

@Test	
public class SendMoney extends TransactionValidation { //Inherit transaction validation class

	public static void main(String[] args) {
	  //Create SnedMoneyTest Object	
	  SendMoney SendMoneyTest = new SendMoney();
	  
	//OpenBrowser
	  SendMoneyTest.setUp();
	  
	//SendMoney after inserting Pin for Validation
	  SendMoneyTest.CredentialValidation();
	  
	}

}
