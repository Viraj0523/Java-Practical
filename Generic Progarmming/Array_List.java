import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
  private ArrayList<Integer> list=new ArrayList<Integer>();
  private ArrayList<Integer> even=new ArrayList<Integer>();
  private ArrayList<Integer> odd=new ArrayList<Integer>();
  private ArrayList<Integer> prime=new ArrayList<Integer>();
  private ArrayList<String> string=new ArrayList<String>();
  private ArrayList<String> palindrome=new ArrayList<String>();
  
  
  public void getdata() {
	  int element,num;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Element:");
	  element=sc.nextInt();
	  for(int i=0;i<element;i++) {
		  System.out.println("Enter Num:");
		  num=sc.nextInt();

		  list.add(num);
		  
	  }
  }
  
  public void evenodd() {
	  for(int i=0;i<list.size();i++) {
		  if((list.get(i))%2==0) {
			  even.add(list.get(i));
		  }
		  else {
			  odd.add(list.get(i));
		  }
	  }
  }
  public void prime() {
	  int i,j,flag=0;
	  for(i=0;i<list.size();i++) {
		  flag=0;
		for(j=2;j<list.get(i);j++) {
			if((list.get(i)%j==0)) {
				flag=1;
				break;
			}
			
		}
		
	if(flag==0) {
		prime.add(list.get(i));
	}
	  }
  }
  public void display() {
	  System.out.println("List:"+list);
	  System.out.println("Even:"+even);
	  System.out.println("Odd:"+odd);
	  System.out.println("Prime:"+prime);
  }
  
  public void setString() {
	  int num;
	  String s;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter no of Strings do you want to enter:");
	  num=sc.nextInt();

	  
	  for(int i=0;i<num;i++) {
		  System.out.println("Enter String:");
		  s=sc.next();
		  string.add(s);
	  }
	  System.out.println("String:"+string);
  }
  
  public void get_palindrom() {
	  for(int i=0;i<string.size();i++) {
		  String s=string.get(i);
		  boolean ispalindrom=checkPalindrom(s);
		 if(ispalindrom) {
			 palindrome.add(s);
			 
		 }
	  }
	  System.out.println("Palindrome:"+palindrome);
  }

private boolean checkPalindrom(String s) {
	StringBuilder reversed=new StringBuilder(s).reverse();
	
	return s.equals(reversed.toString());
	
}
}

