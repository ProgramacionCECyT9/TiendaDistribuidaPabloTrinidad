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
  
class Users extends JFrame implements ActionListener
{
    JButton btnViewUsers;
    JButton btnAddUser;
    JButton btnReturn;
    JLabel lbPrincipal;
    
    public Users()
    {
        this.setSize(500,300);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container contenedor = this.getContentPane();
        contenedor.setBackground(new Color(0,153,204));
        
        lbPrincipal = new JLabel("What do you want to do?");
        lbPrincipal.setBounds(180,50,160,30);
        contenedor.add(lbPrincipal);
        
        btnViewUsers = new JButton("View all Users");
        btnViewUsers.setBounds(80,100,150,30);
        btnViewUsers.addActionListener(this);
        contenedor.add(btnViewUsers);
        
        btnAddUser = new JButton("Add new user");
        btnAddUser.setBounds(270,100,150,30);
        btnAddUser.addActionListener(this);
        contenedor.add(btnAddUser);
        
        btnReturn = new JButton("Return");
        btnReturn.setBounds(200,180,100,30);
        btnReturn.addActionListener(this);
        contenedor.add(btnReturn);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnReturn)
        {
            this.dispose();
            MainPage nwMainPage = new MainPage();
        }
    }
    
}
