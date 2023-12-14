import java.util.Scanner;
public class Complex_op {
public static void main(String[] args) { 
    float r1,i1,r2,i2;
    Scanner sc=new Scanner(System.in); 
        System.out.println("Enter first:"); 
        r1=sc.nextFloat(); 
        i1=sc.nextFloat(); 
        System.out.println("Enter Second:"); 
        r2=sc.nextFloat(); 
        i2=sc.nextFloat();

            Complex c1=new Complex(r1,i1); 
            Complex c2= new Complex(r2,i2);
            Complex c3=new Complex();
            c3.display(c1,c2);
            c3.add(c1,c2);
            c3.sub(c1, c2);
            c3.mult(c1,c2);
            c3.div(c1, c2);
}

}