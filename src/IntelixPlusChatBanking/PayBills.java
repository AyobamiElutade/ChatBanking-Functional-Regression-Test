package IntelixPlusChatBanking;

import org.testng.annotations.Test;

@Test	
public class PayBills extends TransactionValidation { //Inherit transaction validation class

	public static void main(String[] args) {
	  //Create PayBillsTest Object	
	  PayBills PayBillsTest = new PayBills();
	  
	//OpenBrowser
	  PayBillsTest.setUp();
	  
	//SendMoney after inserting Pin for Validation
	  PayBillsTest.CredentialValidation();
	  
	}

}
