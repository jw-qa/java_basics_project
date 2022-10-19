package com.lbg.coh2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int x;		// declaration
        x = 3; 		// assignment
        int y = 4;	// decl with assignment 
        
        
        System.out.println( x );
        
        App theApp = new App();
        theApp.fooBar();
        
        double result = theApp.sum(3.6,  5);
        	
        int rx = 1 + 3;
        double ry = 4.5 + 5.6;
        String rs = "Hello " + "World";
    }
    
    void fooBar()
    {
    	System.out.print("Selvyn says, ");
    	System.out.println("howdy folks");
    }
    
    int sum( int lh, int rh )
    {
    	return lh + rh;
    }
    
    double sum( double lh, double rh )
    {
    	return lh + rh;
    }
    
    int sum( double lh, double rh )
    {
    	return (int)(lh + rh);
    }
}
