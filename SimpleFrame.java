import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFrame extends JFrame
{
    MyCanvas mainCanvas;

    public SimpleFrame()
    {
        super("Example Frame");
        setSize(600,520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainCanvas = new MyCanvas();
        
        JPanel mainPanel = new JPanel();
        mainPanel.add(mainCanvas);       
        
        add(mainPanel);
        
        setVisible(true);
        
        //game logic
        
    }
    
    public void setSize(int w, int h)
    {
        super.setSize(w, h);
        System.out.println("The size is now: "+w+","+h);        
    }
}