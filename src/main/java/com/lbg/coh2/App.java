package com.lbg.coh2;

/**
 * Hello world!
 *
 */
public class App 
{
	//static means you don't need to crate an object 
    public static void main( String[] args ) //belong to class. static can only call static 
    {
        System.out.println( "Hello World!" );
        int x; //declaration 
        x=3;  // assignment
        int y=4; // decl with assinment 
        //local: scope in a function 
        System.out.println(x);
        App theApp=new App(); //App is a type, or class// this is how to create an object 
        theApp.foobar();
        double result=theApp.sum(3.6, 5);
        System.out.print(result);
      //  fooBar();
    }
    
    static void foobar()//create method belong to object, objext can evoke both, class can only evoke class
    {
    	
    	System.out.print("selv:, ");
    	System.out.println("hi ");     	
    }
    int sum(int lh, int rh)
    {
       return lh+rh;
    }
    
    double sum(double lh, double rh)
    {
       return (int)(lh+rh);
    }
   
}
//stataic:it's not an object 
//void: not put anything, no return value 
