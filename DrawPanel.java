import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * This a type of component, that holds and draws the drawable objects
 * 
 * @author Stephen
 * @version 2018-04-02 Lab 11
 */
public class DrawPanel extends JPanel
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;

    /** The list holding all the shapes being drawn */
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    /**
     * This method adds shapes to the set of shapes.
     * 
     * @param shape
     *            The shape to be added to the set of shapes.
     */
    public void addShape(Shape shape)
    {
        shapeList.add(shape);
    }

    /**
     * Draw the shapes in the component, based on their defined draw method
     * 
     * @param graphics
     *            A Graphics object for drawing the shapes
     */
    @Override
    protected void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);

        // TODO: for all shapes in the list, draw the shape.
        
        for(int i = 0; i < shapeList.size(); ++i)
        {
            shapeList.get(i).draw(graphics);
        }

    }
}
