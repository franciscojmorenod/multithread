
public class order {
static int pizzacount 		= 0;
final double diameterrate 	= 10.00;
final double ingredientrate = 2.00;
final double typerate 		= 4.00;
boolean ordercomplete ;

pizza newpizza[] ;


String status ;

	public order()
	{
		System.out.println("ORDER: Constructor");
		pizzacount++;
		this.status = "CREATED_NOT_STARTED";
		ordercomplete = false;
	}

	public void startpizza(pizza newpizza) {
		// TODO Auto-generated method stub
		newpizza.makepie();
		long ty			= 0;
		int stcount 	= 0;
		int  bkcount 	= 0;
		int   pdcount =0;
		while (newpizza.status != "FINISHED")
		{
			if(newpizza.status == "PIZZA_STARTED" && stcount ==0)
			{
				System.out.println(newpizza.status + " " + ty );
				stcount++;
			}
			if(newpizza.status == "PIZZA_BAKING" && bkcount ==0)
			{
				System.out.println(newpizza.status + " " + ty );
				bkcount++;
			}
			
			if(newpizza.status == "PIZZA_OUTOFOVEN"  && pdcount ==0)
			{
				System.out.println(newpizza.status + " " + ty );	
				pdcount++;
			}		

			ty++;
			if(ty>1000000000) 
				{
				System.out.println("ERROR: PIZZA MAKING TIMED OUT " + ty);
				return ;
				}

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("PIZZA SUCCESSFULLY " + newpizza.status + " " + ty);

		ordercomplete = true;
	}

	public void star(int size, int numberofoptionalingred, int type) {
		// TODO Auto-generated method stub
		
		newpizza[pizzacount++] =  new pizza( size, numberofoptionalingred, type);
	//	//newpizza[pizzacount].buildpizza(size, numberofoptionalingred, type);
		startpizza(newpizza[pizzacount]);
		
	}

	double calculatetotal(int t) {
		
		
		
		double a = newpizza[t].size * diameterrate;
		double b = newpizza[t].type * typerate;
		double c = newpizza[t].optionalingredients * ingredientrate;
		
		double totalamount = a + b +c;
		
		return totalamount;
		
	}
}
