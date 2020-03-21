package address.data;

import java.sql.*;
import java.util.*;

public class DBConnection
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
        {
            Class.forName ("oracle.jdbc.OracleDriver");

            Connection conn =
                    DriverManager.getConnection("jdbc:oracle:thin:mcs1007/TkmwytAS@adcsdb01.csueastbay.edu:1521/mcspdb.ad.csueastbay.edu");

            // Create a Statement
            Statement stmt = conn.createStatement ();



            // Select the all (*) from the table JAVATEST

            ResultSet rset = stmt.executeQuery("SELECT * FROM ADDRESSENTRYTABLEMOD");

            System.out.println(rset);





            // Iterate through the result and print the employee names

            while (rset.next ()) //get next row of table returned

            {         for(int i=1; i<=rset.getMetaData().getColumnCount(); i++) //visit each column

                System.out.print(rset.getString(i) + " | ");

                System.out.println(" ");

                System.out.println("========================================");

            }

            //Close access to everything...will otherwise happen when disconnect

            // from database.

            rset.close();

            stmt.close();

            conn.close();
        }

}

