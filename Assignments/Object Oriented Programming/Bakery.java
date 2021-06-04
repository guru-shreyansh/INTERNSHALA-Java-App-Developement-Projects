import java.util.*;

class Cake // Parent Class
{
	String name;
	float price;
	// GETTER
	public String getName()
	{	return name;	}
	public float getPrice()
	{	return price;	}

	// SETTER
	public void setName(String newName)
	{	this.name = newName;	}
	public void setPrice(float newPrice)
	{	this.price = newPrice;	}
	void display()
	{
		System.out.println(name +" : " +'\u20B9'+ " " +price+ " per pound");
	}
}

class Pastry extends Cake // Child Class
{
	@Override
	void display()
	{
		System.out.println(name +" : " +'\u20B9'+ " " +price+ " per piece");
	}
}

public class Bakery // Bakery Class
{
	public static void main(String[] args)
	{
		/* `Cake` & `Pastry` Object creation */
		Cake cake1 = new Cake();
		Cake cake2 = new Cake();
		Pastry pastry1 = new Pastry();
		Pastry pastry2 = new Pastry();
	
		// Getter & Setter
		cake1.setName("Chocolate Brownie");
		cake1.setPrice(250f);
		cake2.setName("Chocolate Maple");
		cake2.setPrice(300f);
		pastry1.setName("Black Forest");
		pastry1.setPrice(35f);
		pastry2.setName("Choco Truffle");
		pastry2.setPrice(40f);
	
		/* ArrayList for `Cakes` & `Pastries` */
		List<Cake> cakesList = new ArrayList<Cake>();
		cakesList.add(cake1);
		cakesList.add(cake2);
		List<Pastry> pastriesList = new ArrayList<Pastry>();
		pastriesList.add(pastry1);
		pastriesList.add(pastry2);
	
		System.out.println("        Today's Special Menu        ");
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println("Special Cakes                       ");
		System.out.println("------------------------------------");
		/*cake1.display();
		cake2.display();*/
		for (Cake object : cakesList)
		{
			object.display();
		}
	
		System.out.println();
		System.out.println("Special Pastries                    ");
		System.out.println("------------------------------------");
		/*pastry1.display();
		pastry2.display();*/
	
		for (Pastry object : pastriesList)
		{
			object.display();
		}
	}
}
