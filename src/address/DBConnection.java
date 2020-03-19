package address;

import java.sql.*;
import java.util.*;

public class DBConnection
{
    String url = "jdbc:oracle:thin:@adcsdb01.csueastbay.edu:1521:mcspdb.ad.csueastbay.edu";
    String user = "mcs1007";
    String password = "TkmwytAS";
    Connection conn;
    {
        try
        {
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            boolean results = stmt.execute("SELECT * FROM EMP");
            ResultSet rset = null;
            if(results) rset = stmt.getResultSet();

            while(rset.next())
            {
                System.out.println(rset.getString(1) + rset.getString(2));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
