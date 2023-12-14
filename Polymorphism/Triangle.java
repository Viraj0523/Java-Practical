import java.util.Scanner;
public class Triangle extends Shape{ 
    double b,area;
    public void getdata() {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter height:"); 
    a=sc.nextDouble(); 
    System.out.println("Enter base:");
    b=sc.nextDouble();
        }
public void compute_area() { 
    area=0.5*a*b;
}
public void display() { 
    System.out.println("Area of Triangle:"+area);
        }
 }