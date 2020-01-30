package milk_and_honey;


	public abstract class Item{ //super class 
	   	
	protected double price;
	
	protected String description;  
	
	protected String name;
	
	protected String[] ingredients;   
	
	protected int size;   

	public abstract void display();
	
	public abstract String getType();
	
	public abstract double getPrice();
	
	public abstract String getDescription();
	
	public abstract String[] getIngredients();
	
	public abstract int getSize(); //ml or grams based on product
	
	public abstract void setIngredients(String[] ingredients);
	
	public abstract void setSize(int size);
	
	public abstract void setPrice(int price);
	
	//constructor for new products
	public Item(double price, String decription, String name, String[] ingredients, Integer size, String description) {
	        this.price = price;
	        this.description = description;
	        this.name = name;
	        this.ingredients = ingredients;
	        this.size = size;
	    }
	
	}



