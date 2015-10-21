
public class ThreeDPoint {
	
	private double z;
	private double x;
	private double y;
	/**
	 * @param z
	 * @param x
	 * @param y
	 */
	public ThreeDPoint(double z1, double x1, double y1) {
		z = z1;
		x = x1;
		y = y1;
	}
	/**
	 * @return the z
	 */
	public double getZ() {
		return z;
	}
	/**
	 * @param z the z to set
	 */
	public void setZ(double z1) {
		z = z1;
	}
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(double x1) {
		x = x1;
	}
	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(double y1) {
		y = y1;
	}
	/**
	 * @return the values of x, y, and z in a readable string
	 */
	public String toString() {
		return "ThreeDPoint [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
	
}
