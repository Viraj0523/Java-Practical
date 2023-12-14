package practical.Interface;
import java.util.*;
class car implements vehicle		
 {
     int gear,speed;
     
     car()
     {
         System.out.println("\tCar started successfully\n ");
         gear=1;			//speed when car started
         speed=10;		//gear when car started
     }
     public void gear_change(int gearex)
     {
         if(gearex<7 && gearex >0)	//maximum gear is 6
         {
             this.gear=gearex;
             System.out.println("\tGear changed Successfully \n\t Current Gear is "+gear);
         }
         else
             System.out.print(" Gear Out Of Range \n");
     }
     
     public void speed_up()
     {
         
         if((speed+20)<150 )			//150 as maximum speed
         {
             speed+=20;
             System.out.println("Cars speed increased \n\t Current speed is "+speed+" Kmhr\n");
         }
         else
             System.out.println("Speed Cannot Be Increased Above 150 Kmhr\n");
             
     }
     
     public void apply_brakes()
     {
         Scanner sc=new Scanner(System.in);
         int x;
         System.out.println("1. TO DECREASE SPEED\n2. TO STOP CAR\n");
         x=sc.nextInt();
         if(x==1)
             if((speed-20)>0)		//checks speed is negative or positive if reduced by 20
             {
                 speed-=20;			//per apply brakes vehicle speed is reduced by 20
                 System.out.println("Speed Reduced Successfully \n\tCurrent Speed Is "+speed+" kmhr\n");
             }
             else {
                 speed=0;
                 gear=0;
                 System.out.println("Car stopped Successfully\n ");}
         if(x==2)
         {
             speed=0;
             gear=0;
             System.out.println("Car stopped Successfully \n");
         }	
     }
     
     public void display()		//displays current status of car
     {
         System.out.println("YOUR  CAR'S SPEED IS "+speed +" Kmhr AND GEAR IS "+gear+"\n");
     }
 
 }
 
