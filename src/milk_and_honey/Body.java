package milk_and_honey;

public abstract class Body extends Item{ //body inherits from super class item 
	
	public abstract String getBodyConcern(); // define methods that are specific to body class
	
	public abstract String setBodyConcern();

	public Body(double price, String decription, String name, String[] ingredients, Integer size, String description) {
		super(price, decription, name, ingredients, size, description);
		// TODO Auto-generated constructor stub
	}

}
