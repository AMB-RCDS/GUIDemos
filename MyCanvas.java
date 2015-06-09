import java.awt.*;
import java.awt.event.*;

public class MyCanvas extends Canvas
{
    public MyCanvas()
    {
        setSize(600,500);
        repaint();
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawString("Here is a sample String.", 10, 50);
        g.drawString("Here is a second String.", 10, 150);
        
        g.setColor(Color.BLUE);
        g.drawString("Here is a blue String.", 10, 250);
    }
}