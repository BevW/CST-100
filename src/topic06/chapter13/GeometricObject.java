package topic06.chapter13;
// Got this class from the book pg. 496
public abstract class GeometricObject {
	
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	// Construct a default geometric object
	protected GeometricObject(){
		dateCreated = new java.util.Date();
	}
	
	// Construct a geometric object with color adn filled value
	protected GeometricObject (String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	// Return color
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	// Return filled. Since filled is boolean, the get method is named isFilled
	public boolean isFilled(){
		return filled;
	}
	// Set a new filled
	public void setFilled (boolean filled){
		this.filled = filled;
	}
	// Get date created
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	@Override
	public String toString(){
		return "creaend on" + dateCreated + "\ncolor: " + color + "and filled: " + filled;
	}
	// Abstract method getArea
	public abstract double getArea();
	// Abstract method getPerimeter
	public abstract double getPerimeter();
}
