package com.lbg.coh2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("enter a key:" );
		//system.in: return askii number
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String dataRead=br.readLine();
		
		System.out.println("=>"+dataRead);
	}
	
}
//stataic:it's not an object 
//void: not put anything, no return value 
