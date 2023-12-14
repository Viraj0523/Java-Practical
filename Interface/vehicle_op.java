package practical.Interface;
import java.util.*;
public class vehicle_op {
 
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);		
         
         vehicle v=null;			// vehicle interface reference created
         System.out.println("======================================================================");
         int y;			//variable to choose vehicle
         bb:		//label for do while loop
         do {
             System.out.print("  SELECT VEHICLE  \n\t1.BICYCLE \n\t2.CAR  \n\t3.BIKE \n\t4.Exit \nChoice::");
              y=sc.nextInt();
              
              System.out.println("======================================================================");
              
             if(y==1)		
                 v=new bicycle();	//object of bicycle class
             else if(y==2)
                 v= new car();		//object of car class
             else if(y==3)
                 v=new bike();		//object of bike class
             else if(y==4)
                 break bb;			//label break
             else
                 System.out.println("INVALID INPUT");
                 System.out.println("======================================================================");
             
             if(0<y&&y<4) {
             aa:		//label for inner do while loop
                 do {
                     System.out.print(" \tPress 1. Speed Up \n\tPress 2. Change gear \n\tPress 3. Apply Brakes  "
                         + "\n\tPress 4. Display Vehicle Status \n\tPress 5. change Vehicle /Exit \nChoice::");
                     int z=sc.nextInt();  		
                     System.out.println("======================================================================");
                 switch(z)
                 {
                 case 1:
                     v.speed_up();
                     System.out.println("======================================================================");
                     break;
                 case 2:
                     System.out.print("which gear you want?   ");
                     int a=sc.nextInt();
                     v.gear_change(a);
                     System.out.println("======================================================================");
                     break;
                     
                 case 3:
                     v.apply_brakes();
                     System.out.println("======================================================================");
                     break;
                 case 4:
                     v.display();
                     System.out.println("======================================================================");
                     break;
                 case 5:
                     break aa;		//label break
                 default:
                         System.out.println("Invalid Input");
                     
                 }
                 }while(true);
             }
                 
             
             
         }while(y!=4); //loop break when input y=4
     }
 
 }