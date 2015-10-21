import java.awt.Color;
import java.awt.Point;

class Cube extends ThreeDObject {

	double length;
	
	public Cube(double len, ThreeDPoint center, Color c){
		super(center, c);
		length = len;
	}
	
	public Cube(){
		super();
	}
	
	public double getLength(){
		return length;
	}
	
	public void setLength(double l){
		length = l;
	}
	
	public double volume(){
		return Math.pow(length, 3);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cube [length=" + length + ", getCenterOfMass()="
				+ getCenterOfMass() + ", getColor()=" + getColor() + "]";
	}
	
	
	
}


