package milk_and_honey;

public abstract class Face extends Item {
	
	public abstract String getSkinType(); // define methods that are specific to face class
	
	public abstract String setSkinType();

	public Face(double price, String decription, String name, String[] ingredients, Integer size, String description) {
		super(price, decription, name, ingredients, size, description);
		// TODO Auto-generated constructor stub
	}

}
