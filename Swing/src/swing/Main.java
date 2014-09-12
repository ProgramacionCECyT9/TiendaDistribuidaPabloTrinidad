package swing;

/**
 *
 * @author Pablo Trinidad
 */

import java.awt.EventQueue;

public class Main
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                vista.login ventana = new vista.login();
            }
        });
    }
    
}
