import java.util.Scanner;
public class Rectangle extends Shape{ 
    
    double b,area;
    public void getdata() {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter lenghth:"); 
    a=sc.nextDouble(); 
    System.out.println("Enter breadth:"); 
    b=sc.nextDouble();
    }
public void compute_area() { 
    
    area=a*b;
}
public void display() { 
    System.out.println("Area of Rectangle:"+area);
        }
        
}