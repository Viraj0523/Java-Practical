package Inheritance;
import java.util.Scanner;
public class Employee {
    String name,address,mailid; int id;
    long mobileno;
public void getdata() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name,address,id,mailid and mobileno of the employee:"); name=sc.next();
    address=sc.next();
    mailid=sc.next();
    id=sc.nextInt();
    mobileno=sc.nextLong();

}
public void display() 
{ 
    System.out.println("Employee details:");
    System.out.println("Name:"+name +"\nId:"+id +"\nAddress:"+address +"\nMailid:"+mailid +"\nMobileno:"+mobileno);
    }
}