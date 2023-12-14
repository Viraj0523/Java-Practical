package Inheritance;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
        int ch;
Scanner sc=new Scanner(System.in); System.out.println("1.Programmer Salary");
    System.out.println("2.Team_Lead Salary"); 
    System.out.println("3.Assistant_Project_Manager Salary"); 
    System.out.println("4.Project_Manager Salary"); 
    System.out.println("5.Exit");
    System.out.println("Enter your choice:"); 
    ch=sc.nextInt();

switch(ch) {
case 1: 
    Programmer p=new Programmer();
    p.getdata(); 
    p.display(); 
    p.accept(); 
    p.calculate(); 
    p.output(); 
    break;
case 2: 
    Team_Lead t= new Team_Lead(); 
    t.getdata();
    t.display();
    t.accept();
    t.calculate(); 
    t.output();
break;
case 3: 
    Assistant_Project_Manager a=new Assistant_Project_Manager(); 
    a.getdata();
    a.display();
    a.accept();
    a.calculate();
    a.output();
    break;
case 4: 
    Project_Manager m=new Project_Manager(); 
    m.getdata();
    m.display();
    m.accept();
    m.calculate(); m.output();
default: System.out.println("Invalid choice");
}}}