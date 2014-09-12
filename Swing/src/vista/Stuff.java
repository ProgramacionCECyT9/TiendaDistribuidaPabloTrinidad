package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Pablo Trinidad
 */
    
class Stuff extends JFrame implements ActionListener
{
    JButton btnNewCategory;
    JButton btnViewCategory;
    JButton btnReturn;
    JComboBox cbCategoryList;
    JLabel lbPrincipal;
    
    public Stuff()
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
        
        String[] listas = {"Hola", "Adios", "Bien", "Gracias"};
        cbCategoryList = new JComboBox(listas);
        cbCategoryList.setBounds(50,100,100,30);
        contenedor.add(cbCategoryList);
        
        btnViewCategory = new JButton("ViewCategory");
        btnViewCategory.setBounds(150,100,150,30);
        btnViewCategory.addActionListener(this);
        contenedor.add(btnViewCategory);

        btnNewCategory = new JButton("Add category");
        btnNewCategory.setBounds(320,100,150,30);
        btnNewCategory.addActionListener(this);
        contenedor.add(btnNewCategory);
        
        btnReturn = new JButton("Return");
        btnReturn.setBounds(200,180,100,30);
        btnReturn.addActionListener(this);
        contenedor.add(btnReturn);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnViewCategory)
        {
            System.out.println("Hola");
        }
        else if(e.getSource()==btnNewCategory)
        {
            this.dispose();
            AddCategory nwAddCategory = new AddCategory();
        }
        else if(e.getSource()==btnReturn)
        {
            this.dispose();
            MainPage nwMainPage = new MainPage();
        }
    }
    
}
