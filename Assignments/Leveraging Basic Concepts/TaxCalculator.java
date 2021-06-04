import java.util.Scanner; // Importing Scanner class

public class TaxCalculator
{
	// Method for TAX Calculation
	public static void calculateTax(String name, long income)
	{
		long taxAmount;
		long taxPercentage = 0L; // `L` for long type declarartion
		
		// Deciding `taxpercentage` based on income
		if (income >= 300000)
		{
			taxPercentage = 20L;
		}
		else if (income >= 100000 && income < 300000)
		{
			taxPercentage = 10L;
		}
		else if (income < 100000)
		{
			taxPercentage = 0L;
		}
        // Calculating `taxAmount`
		taxAmount = (taxPercentage)*(income)/(100);
		
		System.out.println(name+ " : ₹ " +taxAmount);
	}

	public static void main(String[] args)
	{
	    int personCount;
	
	    System.out.println("Tax Calculator App");
	    System.out.println("----- WELCOME -----");
	
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Enter total person count: ");
	    personCount = reader.nextInt();
	
	    String[] namesArray = new String[personCount]; // Array of string to store 'names'
	    long[] incomesArray = new long[personCount]; // Array of long to store 'incomes'
	
        // Reading user's input
	    for (int i=0; i < personCount; i++)
	    {
		    System.out.println("Enter Name " +(i+1)+ " : ");
		    namesArray[i] = reader.next();
		    System.out.println("Enter " +namesArray[i]+ "'s Annual Income : ");
		    incomesArray[i] = reader.nextLong();
	    }	
	    for (int i=0; i < personCount; i++)
	    {
		    calculateTax(namesArray[i], incomesArray[i]); // Calling method with required parameters
	    }
    }
}
