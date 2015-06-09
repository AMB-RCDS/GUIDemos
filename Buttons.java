import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends JFrame implements ActionListener
{
    MyOtherCanvas mainCanvas;
    JButton addButton = new JButton("Add Line");

    public Buttons()
    {
        super("Example Frame");
        setSize(600,520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainCanvas = new MyOtherCanvas();
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(mainCanvas, BorderLayout.CENTER);       
        mainPanel.add(addButton, BorderLayout.SOUTH);
        addButton.addActionListener(this);
        
        add(mainPanel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == addButton)
        {
            mainCanvas.addLine();
            mainCanvas.repaint();
        }
    }
}