import java.util.Date;

public class customer {
Date timein;
Date timeout;
String contactvia;
String paymentmethod;
	
	public customer(String cvia, String pmethod) {
	// TODO Auto-generated constructor stub
		String cv = cvia;
		String pm = pmethod;
	
		this.contactvia = cv;
		this.paymentmethod = pm;	
}

	public boolean getapproval(String pmethod) {
		// TODO Auto-generated method stub
		//return "true" for approved 
		//return "false" for Not Approved;
		if(pmethod == "CreditCar")
		{
			//if credit ok then return true else false
			return true;
		}
		else  
		{// CASH
		return true;
		}
	}

	
	
	
}
