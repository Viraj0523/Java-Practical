public class TestFactoryPattern 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 CarFactory hatchbackFactory = new HatchBackFactory();
	        Car hatchback = hatchbackFactory.createCar();
	        hatchback.allocateAccessories();
	        hatchback.performMakeup();

	        // Creating a Sedan using the SedanFactory
	        CarFactory sedanFactory = new SedanFactory();
	        Car sedan = sedanFactory.createCar();
	        sedan.allocateAccessories();
	        sedan.performMakeup();

	        // Creating an SUV using the SUVFactory
	        CarFactory suvFactory = new SUVFactory();
	        Car suv = suvFactory.createCar();
	        suv.allocateAccessories();
	        suv.performMakeup();
	    }

	}