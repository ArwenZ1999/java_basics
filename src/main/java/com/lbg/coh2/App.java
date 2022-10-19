package com.lbg.coh2;

//import java.io.BufferedReader; //control+shif+o
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 * 
 * 
 * 
 * Write a program that 
 * allows a user to enter a VAT rate, 
 * followed by series of item prices
 *  and it calculates the total cost. 
 *  The calculation should be done in a function.  
 *  After the total amount has been displayed,
 *   the user should be prompted to continue with more calculations, 
 *   or QUIT by typing QUIT.
	
When the app starts it should prompt the user to
 QUIT by type QUIT or PRESS ENTER to continue entering prices
 *
 */
public class App 
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("Enter a cost, its vat or enter quit to exit: ");
		System. out. println();
		String lineRead;
		boolean whileContinue=true;
		Scanner sc=new Scanner(System.in);
		
		while (whileContinue )
		{
			lineRead=sc.next();
			if(lineRead.equalsIgnoreCase("quit"))
				break;
			String cost = lineRead;  
			String vat = sc.next();
			//sc.close();  
			double cost1=Double.parseDouble(cost); 
			double vat1=Double.parseDouble(vat); 
	        App app=new App();
			double result=app.create_vat(cost1,vat1);
			
			System.out.println(result); 
			prompt();
			continue;
		}	 		
		System.out.print("end "); 
	}	
	private static void prompt() {
		// TODO Auto-generated method stub
		System.out.print("continue with more calculation:");
		System. out. println();
	}

	double create_vat(double cost, double vat)
	{
		return cost*vat;
	}
}
