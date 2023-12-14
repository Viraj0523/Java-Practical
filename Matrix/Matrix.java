package Matrix;
//package practical.Matrix;
import java.util.Scanner;

public class Matrix {
  private int Mat[][]=new int[5][5];
  private int row,col;
  
  public void getdata() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter row:");
	  row=sc.nextInt();
	  System.out.println("Enter col:");
	  col=sc.nextInt();

	  
	  for(int i=0;i<row;i++) {
		  for(int j=0;j<col;j++) {
			  System.out.println("Enter element:");
			  Mat[i][j]=sc.nextInt();
		  }
	  }
  }
  
  public void add(Matrix a,Matrix b) {
	  row=a.row;
	  col=a.col;
	  for(int i=0;i<row;i++) {
		  for(int j=0;j<col;j++) {
			  Mat[i][j]=a.Mat[i][j]+b.Mat[i][j];  
		  }
  }
  }
  
  public void sub(Matrix a,Matrix b) {
	  row=a.row;
	  col=a.col;
	  for(int i=0;i<row;i++) {
		  for(int j=0;j<col;j++) {
			  Mat[i][j]=a.Mat[i][j]-b.Mat[i][j];  
         }
	  }
  }
  
  public void mult(Matrix a,Matrix b) {
		if (a.col != b.row) {
			System.out.println("Matrix multiplication not possible: Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
			return;
		}
		row=a.row;
		col=a.col;
		for(int i=0;i<a.col;i++) {
			for(int j=0;j<b.row;j++) {
				Mat[i][j]=0;
				for(int k=0;k<a.col;k++) {
				Mat[i][j] +=a.Mat[i][k]*b.Mat[k][j];	
			}
		  }
	  }
  }
  
  public void trans(Matrix a,Matrix b) {
	  row=a.row;
	  col=a.col;
	  for(int i=0;i<a.row;i++) {
		  for(int j=0;j<b.col;j++) {
			  
			  Mat[i][j]=a.Mat[j][i];
		  }
  }
  }
  
  public void display() {
	  for(int i=0;i<row;i++) {
		  for(int j=0;j<col;j++) {
			  System.out.print(Mat[i][j]+" "); 
		  }
		  System.out.println();
  }
  }
}

