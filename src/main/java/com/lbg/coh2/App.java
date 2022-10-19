package com.lbg.coh2;

//import java.io.BufferedReader; //control+shif+o
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws IOException
	{
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a cost and vat: ");   
		double cost = sc.nextDouble();  
		double vat = sc.nextDouble();
		sc.close();  
        App app=new App();
		double result=app.create_vat(cost,vat);
		//prints the number  
		System.out.println(result); 
	}
	
	
	//Write a program that allows a user to input the cost of an item, 
	//the vat rate and prints out the
	//total price. The functionality that calculates the VAT should be in function.
	
	//Use the Scanner class to read data from the keyboard.
	double create_vat(double cost, double vat)
	{
		return cost*vat;
	}
	
}
//stataic:it's not an object 
//void: not put anything, no return value 
