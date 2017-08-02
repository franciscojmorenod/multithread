
public class office {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		customer newcustomer = new customer("Phone","CreditCard");
		order neworder = new order();
		
		if (!newcustomer.getapproval(newcustomer.paymentmethod)) 
		{
			System.out.println("CUSTOMER CC PAYMENT DENIED - ABORT PROCESS");
		}
		else
		{
			System.out.println("CUSTOMER CC PAYMENT APPROVED - continue with order");
		}
				
		
		neworder.pizzacount = 1;
		
		neworder.star(15,3,1); //SIZE , NUMBEROF OPTIONALINGREDIENTS , TYPEOF
		while(!neworder.ordercomplete)
		{
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("ORDER COMPLETED");
	//	double ordertotal = neworder.calculatetotal(0);
		
		//System.out.print("ORDER $$ TOTAL= " + ordertotal);
		
		
	}

}
