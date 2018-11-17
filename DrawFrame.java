
import java.awt.Color;
import java.awt.Point;
import java.io.IOException;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02 Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;

    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the
     * panel.
     * 
     * @param title
     *            String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);

        int width = 800;
        int height = 600;

        // Base head:
        Circle base = new Circle(new Point(200, 100), 400, Color.ORANGE, true);

        // Ears:
        RightTriangle leftEarBig = new RightTriangle(new Point(250, 175), 40, 100, Color.ORANGE, true);
        RightTriangle leftEarSmall = new RightTriangle(new Point(255, 170), 25, 75, Color.PINK, true);

        RightTriangle rightEarBig = new RightTriangle(new Point(550, 175), -40, 100, Color.ORANGE, true);
        RightTriangle rightEarSmall = new RightTriangle(new Point(545, 170), -25, 75, Color.PINK, true);

        // Eyes:
        Oval leftEye = new Oval(new Point(266, 200), 35, 65, Color.WHITE, true);
        Oval rightEye = new Oval(new Point(532, 200), 35, 65, Color.WHITE, true);
        Oval leftPupil = new Oval(new Point(270, 205), 25, 50, Color.BLACK, true);
        Oval rightPupil = new Oval(new Point(536, 205), 25, 50, Color.BLACK, true);

        // Mouth and Tongue
        Oval tongue = new Oval(new Point(405, 420), 50, 70, Color.RED, true);
        PolyLine mouthLeft = new PolyLine(new Point(266, 350), new Point(400, 400), 50, Color.BLACK, true);
        PolyLine mouthRight = new PolyLine(new Point(400, 400), new Point(532, 350), 50, Color.BLACK, true);

        // Nose and Whiskers:
        Circle nose = new Circle(new Point(400, 300), 25, Color.BLACK, true);

        // Collar:
        Oval colarBase = new Oval(new Point(200, 490), 400, 60, Color.BLUE, true);
        Circle redButton = new Circle(new Point(365, 485), 70, Color.RED, true);
        Circle greenButton = new Circle(new Point(372, 493), 55, Color.GREEN, false);

        // Square around the dog:
        Square squareOutline = new Square(new Point(400, 300), 400, Color.MAGENTA, false);

        // Circle outline:
        Circle circOut = new Circle(new Point(120, 20), 560, Color.BLACK, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();

        drawPanel.addShape(base);
        drawPanel.addShape(leftEarBig);
        drawPanel.addShape(leftEarSmall);
        drawPanel.addShape(rightEarBig);
        drawPanel.addShape(rightEarSmall);
        drawPanel.addShape(nose);
        drawPanel.addShape(mouthLeft);
        drawPanel.addShape(mouthRight);
        drawPanel.addShape(tongue);
        drawPanel.addShape(leftEye);
        drawPanel.addShape(rightEye);
        drawPanel.addShape(leftPupil);
        drawPanel.addShape(rightPupil);
        drawPanel.addShape(colarBase);
        drawPanel.addShape(redButton);
        drawPanel.addShape(greenButton);
        drawPanel.addShape(squareOutline);
        drawPanel.addShape(circOut);

        // set background color
        drawPanel.setBackground(Color.YELLOW);

        // add panel to frame
        this.add(drawPanel);

        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args
     *            Command line arguments.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        PanelToImage.makePanelPNGImage(drawPanel, "Lab12Output");
    }
}
