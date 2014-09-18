package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Pablo Trinidad
 */
        
public class login extends JFrame implements ActionListener
{

    JButton btnEnter;
    JTextField txtUsr;
    JPasswordField txtPsw;
    JLabel lbPrincipal;
    JLabel lbUsr;
    JLabel lbPsw;
    
    public login()
    {
        this.setSize(500,300);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container contenedor = this.getContentPane();
        contenedor.setBackground(new Color(0,153,204));
        
        lbPrincipal = new JLabel("Welcome back admin");
        lbPrincipal.setBounds(180,50,160,30);
        contenedor.add(lbPrincipal);
        
        lbUsr = new JLabel("Username:");
        lbUsr.setBounds(110,100,100,30);
        contenedor.add(lbUsr);
        
        lbPsw = new JLabel("Password:");
        lbPsw.setBounds(110,130,100,30);
        contenedor.add(lbPsw);
        
        txtUsr = new JTextField();
        txtUsr.setBounds(190,105,200,20);
        contenedor.add(txtUsr);

        txtPsw = new JPasswordField();
        txtPsw.setBounds(190,135,200,20);
        contenedor.add(txtPsw);
        
        btnEnter = new JButton("Enter");
        btnEnter.setBounds(200,180,100,30);
        contenedor.add(btnEnter);
        btnEnter.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnEnter)
        {
            String username = txtUsr.getText();
            char password[] = txtPsw.getPassword();
            String passwordEsperada = "admin";
            String passwordCalculada = "";
            for(int i=0; i<password.length; i++)
            {
                passwordCalculada += password[i];
            }
            if(passwordCalculada.equals("admin") && username.equals("admin"))
            {
                this.dispose();
                MainPage nwMainPage = new MainPage();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Ups, this is not a valid user");
            }
        }
    }
    
}
