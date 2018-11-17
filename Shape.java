import java.awt.Color;
import java.awt.Point;

public abstract class Shape implements Drawable
{
    protected Point[] location;
    
    private Color color;
    
    private boolean filled;
    
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public boolean isFilled()
    {
        return filled;
    }
    
    public Point[] getLocation()
    {
        return location;
    }
}
