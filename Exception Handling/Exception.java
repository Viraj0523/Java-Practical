import java.util.InputMismatchException;
		import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		int num1,num2; 
		Scanner input=new Scanner(System.in);
	try {
		
		System.out.println("Enter num1:");
		num1=input.nextInt();
		System.out.println("Enter num2:");
		num2=input.nextInt();
		int res=num1 / num2;
		input.close();
		System.out.println("Division:"+res);
		
		
	}
	catch(ArithmeticException e) {
		System.out.println("ArithmeticException:You have Entered num2=0");
        e.printStackTrace();

	}
	catch(InputMismatchException e) {
		System.out.println("InputMismatchException:Enter int data type");
        e.printStackTrace();
	}
			  
		  
	}
}