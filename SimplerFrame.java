import javax.swing.*;
import java.awt.*;

public class SimplerFrame extends JFrame
{
    public SimplerFrame()
    {
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //master loop
        //while  there are pieces on the boar
        while(redpieces > 0 && blackpieces > 0)
        {
            //get input
            //update the array
            //make sure the new state is legal
            repaint();
        }
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 400, 400);
        //if(board[i][j] == 1)
        //  set color to red
        //  draw a circle
        g.setColor(Color.BLACK);
    }
}