import java.awt.Color;


/**
 * This is a tester class for Spheres and Cubes.
 * @author guinnc
 *
 */
public class CreateSome3DObjects {

	/**
	 * Create some Spheres and Cubes.
	 * @param args Command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		System.out.println("The number of dimensions is " + ThreeDObject.DIMENSIONS);
		System.out.println();
		Sphere s1 = new Sphere();
		System.out.println(s1);
		s1.setRadius(14.5);
		double testRadius = s1.getRadius();
		System.out.println("The radius of s1 is now " + testRadius);
		s1.setColor(new Color(100, 100, 15));
		System.out.println("The color of s1 is now " + s1.getColor());
		s1.setCenterOfMass(new ThreeDPoint(10, 10, 0));
		System.out.println("The center of mass of s1 is now " + s1.getCenterOfMass());
		System.out.println("The volume of s1 is " + s1.volume());
		System.out.println();
		
		Cube c1 = new Cube(10, new ThreeDPoint(1,2,3), Color.RED);
		System.out.println(c1);
		c1.setLength(10.0);
		double testLength = c1.getLength();
		System.out.println("The radius of c1 is now " + testLength);
		c1.setColor(new Color(0, 0, 255));
		System.out.println("The color of c1 is now " + c1.getColor());
		c1.setCenterOfMass(new ThreeDPoint(0, 0, 0));
		System.out.println("The center of mass of c1 is now " + c1.getCenterOfMass());
		System.out.println("The volume of c1 is " + c1.volume());
		System.out.println();
		
		Sphere s2 = new Sphere();
		System.out.println("\n" + s2 + "\n");
		Cube c2 = new Cube();
		System.out.println(c2);

	}

}
