package com.lbg.coh2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	App app = new App();
    	double total=0;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the VAT percentage: ");
    	double vat = sc.nextDouble();
    	String lineRead = "x";
    	boolean whileContinue = true;
    	
    	while ( whileContinue && lineRead != null) {
    		System.out.println("Enter the cost of the item or type 'quit' to EXIT");
    	
    		lineRead = sc.next(); 
    		
    		if (lineRead.equalsIgnoreCase("quit")) {
    			whileContinue = false;
    		}
    		else {
    			total += app.calculateVAT(Double.parseDouble(lineRead), vat);
    			System.out.println("Total is: " + total);
    		}
    		
    	}
    }
    
    double calculateVAT (double cost, double vat) {
    	return (cost * (1 + vat / 100));
    }
}
