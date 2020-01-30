package milk_and_honey;

public abstract class Hair extends Item {
	
	public abstract String getHairType(); // define methods that are specific to hair class
	
	public abstract String setHairType();

	public Hair(double price, String decription, String name, String[] ingredients, Integer size, String description) {
		super(price, decription, name, ingredients, size, description);
		// TODO Auto-generated constructor stub
	}
	
}
