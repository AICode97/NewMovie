/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedvdshop.Util;
import java.sql.*;

/**
 *
 * @author angry
 */
public class DBConnector {
    
    public static Connection getConnector() throws ClassNotFoundException, SQLException{
        Connection connector = null;
        String url = "jdbc:mysql://localhost:3306/movies?";
        url += "serverTimezone=UTC&allowPublicKeyRetrieval=true&";
        url += "useSSl=false";
        String user = "root";
        String password = "klon3903202";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connector = DriverManager.getConnection(url,user,password);
        return connector;
    }
    
}
