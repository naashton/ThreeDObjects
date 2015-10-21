# ThreeDObjects
##@Nick Ashton

This repo contains 6 java classes that create three dimensional objects in memory by implementing methods from a super class. This project currently supports creating spheres and cubes.

#####ThreeDObject.java
ThreeDObject has 2 protected variables; one for the center of mass of the object and the other for the color. This class has two constructors. One constructor takes two arguments; center which is of type double and is a point in three dimensional space, and a color for the object. The second constructor takes no arguments and creates a 3D object with a point of(0,0,0) and a color value of(0,0,0). There is also an abstract method to calculate volume which the Cube.java and Sphere.java class can use.

#####ThreeDPoint.java
This class has one constructor with three parameters for x, y, and z. The class has accessors and mutators for each of the values as well as a toString method.

#####Sphere.java
This is a subclass of the ThreeDObject class and has one instance variable of type double for the radius. There are two constructors. The first has three parameters; first for the radius of the object, second for the center of the object, and the third for the color. The second constructor takes no arguments and creates an empty sphere. It also calculates the the volume of the sphere.

#####Cube.java
Similar to Sphere.java, this subclass has two constructors. The first has three arguments; first for the length of the sides, second for the three dimensional center, and third for the color of the object. The second constructor takes no arguments and creates an empty cube.
