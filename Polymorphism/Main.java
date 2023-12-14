import java.util.Scanner; 
    public class Main {
    public static void main(String[] args) { int ch;
        Shape s;
        Scanner sc=new Scanner(System.in); 
        do {
            System.out.println("1.Area of Circle");
            System.out.println("2.Area of Rectangle");
            System.out.println("3.Triangle");
            System.out.println("4.Exit");

        System.out.println("Enter your choice:");

        ch=sc.nextInt(); 
        switch(ch) {
        case 1:
            Circle c=new Circle(); 
            s=c;
            c.getdata(); 
            s.compute_area(); 
            c.display();
            break; 
        case 2:
            Rectangle r=new Rectangle(); 
            s=r;
            r.getdata();
            s.compute_area();
            r.display(); 
            break;
        case 3:
            Triangle t=new Triangle(); 
            s=t;
            t.getdata(); 
            s.compute_area(); 
            t.display();
            break; 
        }
        }while(ch!=4);
        } }