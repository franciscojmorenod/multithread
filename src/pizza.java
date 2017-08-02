
public class pizza extends Thread{
int size;
int optionalingredients ;
int type ;
String status ;
	
public pizza(int p_size, int p_numberofoptionalingred, int p_type) {
	// TODO Auto-generated constructor stub
	this.size = p_size;
	this.optionalingredients = p_numberofoptionalingred;
	this.type = p_type;;
	this.status = "CREATED_NOT_STARTED1";
}

	public void buildpizza(int p_size, int p_numberofoptionalingred, int p_type) {
		// TODO Auto-generated constructor stub
		this.size = p_size;
		this.optionalingredients = p_numberofoptionalingred;
		this.type = p_type;;
		this.status = "CREATED_NOT_STARTED2";	
	}

	public void makepie() {
		// TODO Auto-generated method stub
	    start();
	}

	
	public void run()
	{
		this.status = "PIZZA_STARTED";
		try {
			Thread.sleep(10);
			this.status = "PIZZA_BAKING";
			Thread.sleep(2000);
			this.status = "PIZZA_OUTOFOVEN";
			Thread.sleep(20);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.status = "FINISHED";
	}
	
	
}


