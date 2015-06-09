import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MyOtherCanvas extends Canvas
{
    ArrayList<OrderedQuad> lineList = new ArrayList<OrderedQuad>();

    public MyOtherCanvas()
    {
        setSize(600,500);
        repaint();
    }
    
    public void addLine()
    {
        int startX = (int)(Math.random()*600);
        int startY = (int)(Math.random()*500);
        int endX = (int)(Math.random()*600);
        int endY = (int)(Math.random()*500);
        lineList.add(new OrderedQuad(startX, startY, endX, endY));
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawString("Here is a sample String.", 10, 50);
        g.drawString("Here is a second String.", 10, 150);
        
        g.setColor(Color.BLUE);
        g.drawString("Here is a blue String.", 10, 250);
        
        for(int i=0; i<lineList.size(); i++)
        {
            OrderedQuad oq = lineList.get(i);
            g.drawLine(oq.t1, oq.t2, oq.t3, oq.t4);
        }
    }
}