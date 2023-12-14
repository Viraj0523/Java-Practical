package practical.Interface;
import java.util.*;
class bike implements vehicle
 {
     int gear,speed;		//data members of bike class
     
     bike()
     {
         System.out.println("\tBike started successfully \n");
         gear=1;		//initial gear when bike starts
         speed=10;	//initial speed of bike when starts
     }
     public void gear_change(int gearex)
     {
         if(gearex<6 && gearex>0)		//maximum gears is 5
         {
             gear=gearex;
             System.out.println("\tGear changed Successfully \n\t Current Gear IS "+gear);
         }
         else
             System.out.println("Gear out of range \n");
     }
     
     public void speed_up()
     {
         if((speed+20)<100 )		//maximum speed is 100 for bike
         {
             speed+=20;
             System.out.println("Bike's speed increased \n\t Current speed is "+speed+" Kmhr.\n");
         }
             else
                 System.out.println("Speed Cannot Be Increased Above 100 Kmhr \n");
             
     }
     
     public void apply_brakes()			//method to reduce bike speed or stop bike
     {
         Scanner sc=new Scanner(System.in);
         int x;
         System.out.println("1. TO DECREASE SPEED\n2. TO STOP bike\n");
         x=sc.nextInt();
         if(x==1)
             if((speed-20)>0)	//checks speed is negative or positive if reduced by 20
             {
                 speed-=20;			//per apply brakes vehicle speed is reduced by 20
                 System.out.println("Speed Reduced Successfull   \n\tCurrent speed is "+speed+ "kmhr\n" );
             }
             else {
                 speed=0;
                 gear=0;
                 System.out.println("Bike stopped Successfully \n");}
         if(x==2)
         {
             speed=0;
             gear=0;
             System.out.println("Bike stopped Successfully \n");
         }
         
     }
     
     public void display()		//displays current bike status
     {
         System.out.println("YOUR  BIKE'S SPEED IS "+speed +" Kmhr AND GEAR IS "+gear+"\n");
     }
 }
