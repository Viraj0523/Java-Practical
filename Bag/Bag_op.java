import java.util.Scanner;

public class Bag_op {

	public static void main(String[] args) {
		int w,n=0;
		String c;
		int ch1,ch2;
		//Bag[] obj =new Bag[];
		Scanner sc=new Scanner(System.in);
		Bag[] obj=new Bag[10];
		do {
			System.out.println("1.Add ball");
			System.out.println("2.Display");
			System.out.println("3.Delete");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice:");
			ch1=sc.nextInt();
			switch(ch1) {
			case 1: 
				do {
					System.out.println("1.Both Default");
					System.out.println("2.Both from user");
					System.out.println("3.colour from user, wt default");
					System.out.println("4.wt from user,col default");
					System.out.println("5.Exit");
					
					System.out.println("enter your choice:");
					ch2=sc.nextInt();
					switch(ch2) {
					case 1:
						obj[n]=new Bag();
						n=n+1;
						System.out.println("Ball is added.....");
						break;
						
					case 2:
						System.out.println("Enter col of ball:");
						c=sc.next();
						System.out.println("Enter weight of ball:");
						w=sc.nextInt();
						obj[n]=new Bag(c,w);
						n=n+1;
						System.out.println("Ball is added.....");
						break;
						
					case 3:
						System.out.println("Enter col of ball:");
						c=sc.next();
						obj[n]=new Bag(c);
						n=n+1;
						System.out.println("Ball is added.....");
						break;
					
					case 4:
						System.out.println("Enter weight of ball:");
						w=sc.nextInt();
						obj[n]=new Bag(w);
						n=n+1;
						System.out.println("Ball is added.....");
						break;
					
					case 5:
						System.out.println("Exit");
						break;
						
					}
				}while(ch2!=5);
				break;
				
			case 2:
				for(int i=0;i<n;i++) {
					obj[i].display(i);
				}
				Bag.output();
				break;
				
			case 3:
				Bag.delete(obj,n);
				break;
			}
		}while(ch1!=4);

	}

}
