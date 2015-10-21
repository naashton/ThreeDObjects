import java.awt.Color;
import java.awt.Point;
import java.lang.Math;


class Sphere extends ThreeDObject {
	
	double radius;
	/*
	 * @param r is the radius
	 * @param center is the center of the point from the ThreeDPoint class
	 * @param color is the color of the object
	 */
	public Sphere(double r, ThreeDPoint center, Color c){
		super(center, c);
		radius = r;
	}
	
	public Sphere(){
		super();
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double r){
		radius = r;
	}
	
	public double volume(){
		double r = radius;
		return (4.0/3.0)*(Math.PI)*(Math.pow(r, 3));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sphere [radius=" + radius + ", center of mass = "
				+ getCenterOfMass() + " , color = " + getColor() + "]";
	}
		
}
