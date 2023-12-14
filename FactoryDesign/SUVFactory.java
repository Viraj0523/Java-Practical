public class SUVFactory implements CarFactory 
{
	public Car createCar() 
	{
        return new SUV();
    }

}
