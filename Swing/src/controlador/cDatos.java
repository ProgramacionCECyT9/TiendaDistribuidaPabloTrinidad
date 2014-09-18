package controlador;

/**
 *
 * @author Pablo Trinidad
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class cDatos
{
    private String DBusername;
    private String DBpassword;
    private String DBURL;
    private Connection conn = null;
    private Statement estancia;
    
    public cDatos()
    {
        this.DBusername = "kztazccbknqulj";
        this.DBpassword = "fxt4n_fw1Dq3vUXyObuUNcJgXj";
        this.DBURL = "jdbc:postgresql://ec2-54-243-42-236.compute-1.amazonaws.com:5432/dbl4qujfbs8c52";
    }
    
    public void conectar() throws SQLException
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection(this.DBURL, this.DBusername, this.DBpassword);
        }
        catch(Exception err)
        {
            System.out.println("Error " + err.getMessage());
        }
    }
}
