import java.awt.Color;
import java.awt.Point;

/**
 * Class that represents a line with a thickness as a polygon.
 * 
 * @author Stephen
 * @version 2018-04-02
 */
public class PolyLine extends Polygon
{
    /**
     * PolyLine constructor. A polyline is comprised of 4 points. It is effectively
     * a parallelogram. A parellelogram can be thought of as being defined by two
     * parallel lines. It is defined here by a line given as two points and a
     * thickness defining the relative location of the parallel line. It has the
     * following points: 0: The "upper-left" (UL) point. 1: The "upper-right" (UR)
     * point. 2: The "lower-right" point. This has the same x value as the
     * upper-right but has a y value such that: lr.y = ur.y + thickness. 3: The
     * "lower-left" point. This has the same x value as the upper-left but has a y
     * value such that: ll.y = ul.y + thickness.
     * 
     * @param pointUL
     *            The start point of the first line defining the PolyLine
     *            (parallelogram).
     * @param pointUR
     *            The end point of the first line defining the PolyLine
     *            (parallelogram).
     * @param thickness
     *            The number of pixels below the first line that the second line
     *            appears. Note that if a negative value is given, the second line
     *            will be above the first line.
     * @param color
     *            The color of the PolyLine.
     * @param filled
     *            Whether or not the PolyLine is filled.
     */
    public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean filled)
    {
        super(color, filled);

        location = new Point[4];

        // Assemble the 4 points
        location[0] = new Point(pointUL.x, pointUL.y);
        location[3] = new Point(pointUR.x, pointUR.y);
        location[1] = new Point(pointUL.x, pointUL.y + thickness);
        location[2] = new Point(pointUR.x, pointUR.y + thickness);

    }
}
