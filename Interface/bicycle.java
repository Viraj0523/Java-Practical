package practical.Interface;

import java.util.*;
class bicycle implements vehicle
{
	int gear,speed;
	
	bicycle()			//default constructor for bicycle
	{
		System.out.println("\tBicycle started successfully\n ");
		gear=1;			//gear is 1 when Cycle starts
		speed=10;		//speed is 10 when Cycle Starts
	}
	
	public void gear_change(int gearex)
	{
		if(gearex<7 && gearex>0)		//maximum gear for vehicle is 6
		{
			gear=gearex;
			System.out.println("\tGear changed Successfully \n\t Current Gear Is "+gear);
		}
		else
			System.out.println("Gear is Out Of Range \n");
	}
	
	public void speed_up()			
	{
		if((speed+5)<50 ) {		//50 as maximum speed
			speed+=5;
			System.out.println("\n\tBicycles speed increased \n\t current speed is "+speed);
		}
		else
			System.out.println("Speed Cannot Be Increased Above 50 Kmhr\n");
	}
	
	public void apply_brakes()		//function to apply brakes
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("1. DECREASE SPEED\n2. STOP BICYCLE\n");
		x=sc.nextInt();
		
		if(x==1)
			if((speed-5)>0)			// speed never be negative
			{
				speed-=5;			//per apply brakes bicycles speed is reduced by 5
				System.out.println("Speed Reduced Successfull \n\tCurrent speed is "+speed+" Kmhr \n");
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Bicycle stopped Successfully\n ");}
				
		if(x==2)			//to stop bicycle 
		{
			speed=0;
			gear=0;
			System.out.println("Bicycle stopped Successfully\n ");
		}
		
	}
	
	public void display()		//displays current status of bicycle
	{
		System.out.println("YOUR  BICYCLE'S SPEED IS "+speed +" Kmhr AND GEAR IS "+gear);
	}
}


