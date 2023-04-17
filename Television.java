// Group 2
// Munshi Abrar & Ashutosh Sharma
// Television Class

import java.text.DecimalFormat;

public class Television
{
	// Data - variables (private)
	private String brand;
	private int price;

	// Default Constructor
	public Television()
	{
	    brand = "";
	    price = 0;
	}

	// Overloaded Constructor
    public Television( String startBrand,
                       int startPrice )
	{
	    setBrand(startBrand);
	    setPrice(startPrice);
	}

	// Accessor Methods
    public String getBrand( )
    {
        return brand;
    }

    public int getPrice( )
    {
        return price;
    }

     // Mutator Methods
    public void setBrand( String newBrand )
    {
        brand = newBrand;
    }

    public void setPrice( int newPrice )
    {
        if ( newPrice >= 0 )
            price = newPrice;
        else
        {
           price = 0;
        }
    }

	// toString()
    public String toString( )
    {
    	DecimalFormat priceFormat = new DecimalFormat( "0.00" );
    	return "Brand: " + brand + ", Price: $" + priceFormat.format( price );
    }

	// equals()
    public boolean equals( Television right )
    {
        if ( this.brand.equals( right.brand ) && this.price == right.price )
            return true;
        else
            return false;
    }
}




















