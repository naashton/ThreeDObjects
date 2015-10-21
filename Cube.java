import java.awt.Color;
import java.awt.Point;

class Cube extends ThreeDObject {
	
	double length;	//instance variable for the length of the sides
	
	/*
	*This constructor takes 3 arguments and creates a cube
	*@param len is the length of the sides
	*@param center is the center of the cube using ThreeDPoint
	*@param c is the color of the cube
	*/
	public Cube(double len, ThreeDPoint center, Color c){
		super(center, c);	//calls the superclass ThreeDObject with center and c
		length = len;
	}
	
	/*
	*This constructor takes no arguments and creates an empty cube.
	*/
	public Cube(){
		super();
	}
	
	/*
	*This method returns the length of the sides
	*@return gives the length of the sides
	*/
	public double getLength(){
		return length;
	}
	
	/*
	*This method is used to set the length of the cube
	*@param l takes the length of type double
	*/
	public void setLength(double l){
		length = l;
	}
	
	/*
	*This method returns the volume of the cube
	*@return returns the calculation of the volume
	*/
	public double volume(){
		return Math.pow(length, 3);
	}

	/* 
	 * toString method to put the values of the cube in a readable format
	 @return gives the length, center of mass, and color of the object 
	 */
	@Override
	public String toString() {
		return "Cube [length=" + length + ", getCenterOfMass()="
				+ getCenterOfMass() + ", getColor()=" + getColor() + "]";
	}
	
	
	
}


