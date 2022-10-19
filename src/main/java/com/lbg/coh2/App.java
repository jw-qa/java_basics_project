package com.lbg.coh2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("Enter the cost of the item: ");
    	Scanner console = new Scanner(System.in);
    	double cost = console.nextDouble();
    	System.out.println("Enter the VAT: ");
    	double vat = console.nextDouble();
    	App app = new App();
    	
    	System.out.println("The total is: " + app.VAT(cost, vat));
    }
    
    double VAT (double cost, double vat) {
    	return (cost * (1 + vat / 100));
    }
}
