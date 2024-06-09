package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
    Connection c;
    java.sql.Statement s;

    public Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "Password");
            s =  c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
