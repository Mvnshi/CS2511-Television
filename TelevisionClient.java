// Group 2
// Munshi Abrar & Ashutosh Sharma
// Television Client

import java.text.DecimalFormat;

public class TelevisionClient
{
	public static void main(String [] args)
	{
    	DecimalFormat priceFormat = new DecimalFormat( "0.00" );
    	
		Television t1, t2;		// declare 2 Television reference

		// Instantiate t1 & t2
		t1 = new Television( );
		t2 = new Television( "Roku", 250 );

		// test brand accessor
		String x = t1.getBrand();

		System.out.println("T1 brand is " + x);
		System.out.println("T2 brand is " + t2.getBrand());
		System.out.println();

		// test price accessor
		int y = t1.getPrice();

		System.out.println("T1 price is $" + priceFormat.format(y));
		System.out.println("T2 price is $" + priceFormat.format(t2.getPrice()));
		System.out.println();

		// test brand mutator
		t1.setBrand("Samsung");
		System.out.println("T1 brand is now " + t1.getBrand());

		// test price mutator
		t1.setPrice(500);
		System.out.println("T1 price is now $" + priceFormat.format(t1.getPrice()));
		System.out.println();

		// test toString()
		System.out.println( t1.toString());	// explicit call
		System.out.println( t1 );	// implicit call
		System.out.println( t2.toString());
		System.out.println( t2 );
		System.out.println();

		// test equals()
		if (t1.equals(t2))
			System.out.println("T1 is the same as T2");
		else
			System.out.println("T1 is not the same as T2");

	}
}