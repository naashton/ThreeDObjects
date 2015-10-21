import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;




public class Read3D {


	public static void main(String[] args) throws FileNotFoundException {
		
		//File f = new File("3DObjects.txt");
		ArrayList<ThreeDObject> objects = new ArrayList<ThreeDObject>();
		
		Scanner read = new Scanner(new File("3DObjects.txt"));
		while(read.hasNext()){
			double radius = read.nextDouble();
			double x = read.nextDouble();
			double y = read.nextDouble();
			double z = read.nextDouble();
			ThreeDPoint p = new ThreeDPoint(x, y, z);
			int r = read.nextInt();
			int g = read.nextInt();
			int b = read.nextInt();
			java.awt.Color c = new java.awt.Color(r, g, b);
			Sphere shape = new Sphere(radius, p, c);
			objects.add(shape);
		}
		read.close();
		System.out.println(objects);
	}


}

