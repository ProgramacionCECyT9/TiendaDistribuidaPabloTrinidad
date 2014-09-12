package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Pablo Trinidad
 */
      
class MainPage extends JFrame implements ActionListener
{

    JButton btnStuff;
    JButton btnUsers;
    JLabel lbPrincipal;
    
    public MainPage()
    {
        this.setSize(500,300);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container contenedor = this.getContentPane();
        contenedor.setBackground(new Color(0,153,204));
        
        lbPrincipal = new JLabel("Where do you want to go?");
        lbPrincipal.setBounds(180,50,160,30);
        contenedor.add(lbPrincipal);
        
        btnStuff = new JButton("Stuff");
        btnStuff.setBounds(120,100,100,30);
        btnStuff.addActionListener(this);
        contenedor.add(btnStuff);
        
        btnUsers = new JButton("Users");
        btnUsers.setBounds(270,100,100,30);
        btnUsers.addActionListener(this);
        contenedor.add(btnUsers);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnStuff)
        {
            this.dispose();
            Stuff nwStuff = new Stuff();
        }
        else if(e.getSource()==btnUsers)
        {
            this.dispose();
            Users nwStuff = new Users();
        }
    }
    
}
