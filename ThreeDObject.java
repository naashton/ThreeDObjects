import java.awt.Color;
import java.awt.Point;


public abstract class ThreeDObject {
	protected ThreeDPoint centerOfMass;
	protected java.awt.Color color;
	static final int DIMENSIONS = 3;
	
	public ThreeDObject(ThreeDPoint center, Color c){
		centerOfMass = center;
		color = c;
	}
	
	public ThreeDObject(){
		
	}
	
	public ThreeDPoint getCenterOfMass(){
		return centerOfMass;
	}
	
	public void setCenterOfMass(ThreeDPoint p){
		centerOfMass = p;
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setColor(Color c){
		color = c;
	}
	
	public abstract double volume();
}
