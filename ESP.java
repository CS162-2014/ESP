/* Alec Snyder
 * cs162
 * ESP GUI program
 * Do you have ESP? find out! */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ESP implements ActionListener
{
    JFrame frame;
    JButton right, left, quit;
    
    public ESP()
    {
        ImageIcon curtain= new ImageIcon("/home/alecsnyder/Documents/cs162/curtains.gif");
        frame=new JFrame("Esp");
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(1,2));
        right=new JButton("", curtain);
        left=new JButton("Emtpy");
        right.setBackground(Color.WHITE);
        panel.add(right);
        panel.add(left);
        left.addActionListener(this);
        right.addActionListener(this);
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        quit=new JButton("quit");
        quit.addActionListener(this);
        frame.add(quit, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==(Object)(quit))
        {
            frame.dispose();
            System.exit(0);
        }
        else if(e.getSource()==(Object)(right))
        {
            right.setIcon(new ImageIcon(""));
        }
        else if(e.getSource()==(Object)(left))
        {
            left.setText("NO");
        }
    }
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ESP(); 
            }
        });
    }
}
