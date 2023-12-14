package Matrix;

import java.util.Scanner;
public class Matrix_op {

	public static void main(String[] args) {
		Matrix m1=new Matrix();
		Matrix m2=new Matrix();
		Matrix m3=new Matrix();
		
		m1.getdata();
		m1.display();
		m2.getdata();
		m2.display();
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Transpose");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice:");
			ch=sc.nextInt();

			
			switch(ch) {
			case 1:
				m3.add(m1,m2);
				m3.display();
				break;
				
			case 2:
				m3.sub(m1,m2);
				m3.display();
				break;
				
			case 3:
				m3.mult(m1,m2);
				m3.display();
				break;
				
			case 4:
				m3.trans(m1,m2);
				m3.display();
				break;
				
				
			case 5:
				System.out.println("Exit");
				break;
				
				
			}
		}while(ch!=5);

	}

}

