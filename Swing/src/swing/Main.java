package swing;

/**
 *
 * @author Pablo Trinidad
 */

import java.awt.EventQueue;
import java.sql.SQLException;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                vista.login ventana = new vista.login();
            }
        });
        controlador.cDatos bd = new controlador.cDatos();
        bd.conectar();
    }
    
}
