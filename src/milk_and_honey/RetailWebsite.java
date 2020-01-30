
package milk_and_honey;

import java.util.ArrayList; 



public static void main(String[] args) {}

public class RetailWebsite {
	
	// Function to compute discount based on user cart
	double discountComputer(Cart userCart) {
	// if the cart total is greater than $100 and at least one shampoo 
	//is in cart then a 10% discount is awarded. 
	double totalCartValue = userCart.getTotalCartValue();  
	int numOfShampoos = 0;
	for(Item item : userCart.getItems())
	{
		//Use of polymorphism is shown here
		if(item.getType().equals("Shampoo"))
		{
			numOfShampoos++;
	break;
		}
	}
	if(totalCartValue >= 100 && numOfShampoos >= 1)
	{
		return 0.1 * totalCartValue;
	}
	else 
	{
		return 0;
	}
	}

	 
	 public ArrayList<Item> getShampoosThatThicken(Arraylist<Item> itemList) {
			ArrayList<Item> thickShampoos = new ArrayList<Item>();
	 
	      	for(Item currentItem :itemList) {
	              	if (currentItem instanceof Shampoo) {
	                    	if(((Shampoo)currentItem).thickeningShampoo())
					{	
						thickShampoos.add(currentItem);
					}
	              	}
	              	        	
	      	}
	      	return thickShampoos; 
	  	} 
}

