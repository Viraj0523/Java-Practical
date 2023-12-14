public class Complex {
private float real,img; 
public Complex() 
{
	//default constructor
	real=img=0;
}
public Complex(float real,float img) 
{
	//parameterised constructor
	this.real=real;
	this.img=img; 
}

public void display(Complex x, Complex y)
{
	System.out.println("First complex no : (" + x.real+ ")+(" + x.img+ ")i");
	System.out.println("Second complex no : (" + y.real+ ")+(" + y.img+ ")i");

}



public void add(Complex x,Complex y) { 
	real=x.real+y.real; 
	img=x.img+y.img;
	System.out.println("Addition:"+real + "+" +img + "i");

}

public void sub(Complex x,Complex y) { 
	real=x.real-y.real; 
	img=x.img-y.img;

	System.out.println("Substraction:"+real + "+" +img + "i" );
}



public void mult(Complex x,Complex y) {
        real=(x.real*y.real)-(x.img*y.img);
        img=(x.real*y.img)+(x.img*y.real);
		System.out.println("Multiplication:"+real + "+" +img + "i");
}


public void div(Complex x,Complex y) {
	   	real=((x.real*y.real)+(x.img*y.real))/((y.real*y.real)+(y.img*y.img));
		img=((x.real*y.img)+(x.img*y.img))/((y.real*y.real)+(y.img*y.img));
		System.out.println("Division:"+real+ "-" +img + "i");

	
	}

}




























