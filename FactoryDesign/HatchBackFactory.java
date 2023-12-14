public class HatchBackFactory implements CarFactory 
{
	 public Car createCar() 
	 	{
	        return new HatchBack();
	    }

}
