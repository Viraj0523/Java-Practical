import java.util.Scanner;
public class Circle extends Shape{ 
        double area;
    public void getdata() {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter radius:"); 
        a=sc.nextDouble();
        }
public void compute_area() { 
    area=3.14*a*a;
}
public void display() {
System.out.println("Area of Circle:" + area);
}
}