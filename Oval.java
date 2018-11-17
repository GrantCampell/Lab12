import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This class maintains information for drawing an Oval, and extends Shape.
 * 
 * @author Stephen
 * @version 2018-04-02 Lab 11
 */
public class Oval extends Shape
{
    // Diameter from left to right
    private int diameter1;
    // Diameter from top to bottom
    private int diameter2;

    /**
     * Constructor for an Oval
     * 
     * You should store the center point in the point array "location". In a
     * polygon, this array defines the corners. There are no corners here, but we
     * need to store the center point of the oval. We can simply use the location
     * array and rely on this knowledge to draw the oval.
     * 
     * @param pointCenter
     *            Center point of the oval
     * @param diameter1
     *            Diameter from left to right
     * @param diameter2
     *            Diameter from top to bottom
     * @param color
     *            Desired color of the oval
     * @param filled
     *            Whether or not the oval should be filled
     */
    public Oval(Point pointCenter, int diameter1, int diameter2, Color color, boolean filled)
    {
        super(color, filled);

        // TODO: complete implementation.

        this.diameter1 = diameter1;

        this.diameter2 = diameter2;

        location = new Point[1];

        location[0] = new Point(pointCenter.x, pointCenter.y);
    }

    /**
     * Get the first diameter
     * 
     * @return diameter1 The diameter from left to right
     */
    public int getDiameter1()
    {
        return diameter1;
    }

    /**
     * Get the second diameter
     * 
     * @return diameter2 The diameter from top to bottom
     */
    public int getDiameter2()
    {
        return diameter2;
    }

    /**
     * This method takes a graphics object to perform the drawing, places the points
     * of the oval and fills it with the color if filled is true.
     * 
     * Remember that graphics generally draws shapes starting with the top-left
     * corner. For an oval, this is determined by the bounding box. You can
     * visualize the bounding box of an oval as a rectangle which inscribes the
     * oval. You will need to do a small amuont of math to determine the top-left
     * corner of the bounding box given the center point that you should have
     * stored.
     * 
     * @param graphics
     *            A Graphics object for drawing the shape
     */
    @Override
    public void draw(Graphics graphics)
    {
        graphics.setColor(this.getColor());

        // TODO: define how to draw an oval. Remember that the point stored is the
        // center point.

        // Render depending on whether it is filled or not.
        if (this.isFilled())
        {
            graphics.fillOval(location[0].x, location[0].y, diameter1, diameter2);
        }
        else
        {
            graphics.drawOval(location[0].x, location[0].y, diameter1, diameter2);
        }
    }
}
