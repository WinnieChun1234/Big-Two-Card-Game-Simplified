
/**
 * The Square class is a subclass of the Shape class, used to model squares. It
 * inherits all the instance variables and methods of the Shape class. The
 * Square class overrides the setVertices() method for setting the local
 * coordinates of the 4 vertices of a standard square. Below is a detailed
 * description for the Square class.
 * 
 * @author Winnie Chun
 *
 */
public class Square extends Shape {

	/**
	 * A method for setting the local coordinates of the 4 vertices of a standard
	 * square. Here, a standard square has its center located at (0, 0) and its
	 * sides being parallel to the x- and y-axes of its local coordinate system.
	 * 
	 * @param d specifies half-the-length of a side of the square.
	 */
	@Override
	public void setVertices(double d) {
		this.xLocal = new double[] { d, d, -d, -d };
		this.yLocal = new double[] { d, -d, -d, d };
	}
}
