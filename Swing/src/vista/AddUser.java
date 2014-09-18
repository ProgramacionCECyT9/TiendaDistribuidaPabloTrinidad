package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Pablo Trinidad
 */

public class AddUser extends JFrame implements ActionListener
{
    JButton btnAdd;
    JTextField txtName;
    JLabel lbPrincipal;
    JLabel lbName;
    JLabel lbSupCategory;
    JButton btnReturn;
    JComboBox cbSupCategoryList;
    
    public AddUser()
    {
        this.setSize(500,300);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container contenedor = this.getContentPane();
        contenedor.setBackground(new Color(0,153,204));

        lbPrincipal = new JLabel("Enter data");
        lbPrincipal.setBounds(180,50,160,30);
        contenedor.add(lbPrincipal);

        lbName = new JLabel("Name:");
        lbName.setBounds(105,100,100,30);
        contenedor.add(lbName);
        
        lbSupCategory = new JLabel("Root category");
        lbSupCategory.setBounds(105,130,100,30);
        contenedor.add(lbSupCategory);
        
        txtName = new JTextField();
        txtName.setBounds(190,105,200,20);
        contenedor.add(txtName);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(300,180,100,30);
        contenedor.add(btnAdd);
        btnAdd.addActionListener(this);
        
        String[] listas = {"Hola", "Adios", "Bien", "Gracias"};
        cbSupCategoryList = new JComboBox(listas);
        cbSupCategoryList.setBounds(190,135,100,20);
        contenedor.add(cbSupCategoryList);
        
        btnReturn = new JButton("Return");
        btnReturn.setBounds(100,180,100,30);
        btnReturn.addActionListener(this);
        contenedor.add(btnReturn);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnAdd)
        {
            this.dispose();
            Stuff nwStuff = new Stuff();
        }
        else if(e.getSource()==btnReturn)
        {
            this.dispose();
            Stuff nwStuff = new Stuff();
        }
    }
}
