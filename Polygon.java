import java.awt.Color;
import java.awt.Graphics;

/**
 * This class maintains information for drawing a Polygon and extends Shape.
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public abstract class Polygon extends Shape
{

    /**
     * Constructor for a Polygon
     * 
     * @param color Desired color of the oval
     * @param filled Whether or not the oval should be filled
     */
    public Polygon(Color color, boolean filled)
    {
        super(color, filled);
    }

    /**
     * This method defines how to draw a polygon, by constructing a convex
     * shape with the location of the points as vertices, and fills in the
     * space with the color if filed is true
     * 
     * @param graphics A Graphics object for drawing the shapes
     */
    @Override
    public void draw(Graphics graphics)
    {
        int numOfPoints = location.length;
        // Arrays of x/y coordinates
        int[] xPoints = new int[numOfPoints];
        int[] yPoints = new int[numOfPoints];
        
        // Copy from location structure
        for (int i = 0; i < numOfPoints; i++)
        {
            xPoints[i] = location[i].x;
            yPoints[i] = location[i].y;
        }
        
        // Set the color
        graphics.setColor(this.getColor());
        
        // Render depending on whether it is filled or not.
        if (this.isFilled())
        {
            graphics.fillPolygon(xPoints, yPoints, numOfPoints);
        } 
        else
        {
            graphics.drawPolygon(xPoints, yPoints, numOfPoints);
        }
    }
}
