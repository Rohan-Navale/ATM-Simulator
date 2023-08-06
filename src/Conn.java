// 5 Steps to create JDBC connection
// 1. Register Driver   2. Create Connection   3. Create Statement   4. Execute Query   5. Close Connection

import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankManagementSystem", "root", "123456789");
            s= c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
