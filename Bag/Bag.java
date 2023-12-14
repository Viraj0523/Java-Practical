import java.util.Scanner;

public class Bag {
  private String col;
  private int wt;
  private static int total_object;
  private static int total_weight;
  
  
  public Bag() {
	  wt=10;
	  col="Red";
	  total_object=total_object+1;
	  total_weight=total_weight+wt;
  }
  public Bag(String col, int wt) {
	  this.col=col;
	  this.wt=wt;
	  total_object=total_object+1;
	  total_weight=total_weight+wt;
  }
  public Bag(String col) {
	  this.col=col;
	  wt=10;
	  total_object=total_object+1;
	  total_weight=total_weight+wt;
  }
  public Bag(int wt) {
	  this.wt=wt;
	  col="Red";
	  total_object=total_object+1;
	  total_weight=total_weight+wt;
  }
  
  public void display(int i)
  {
	  i=i+1;
	  System.out.println(i +" "+col +" "+wt);
  }
  
  public static void delete(Bag obj[],int n) 
  {
	  Scanner sc=new Scanner(System.in);
	  int delete;
	  System.out.println("Enter record to be deleted");
	  delete=sc.nextInt();
	  total_weight=total_weight-obj[delete].wt;
	  for(int i=delete;i<n;i++) {
		  obj[i-1]=obj[i];
		  
	  }
	   total_object=total_object-1;
	   System.out.println("Total Objects:"+total_object+"\n Total Weight:"+total_weight);
  }
  public static void output() 
  {
	  System.out.println("Total Objects:"+total_object+"\n Total Weight:"+total_weight);
  }
  
  
}

