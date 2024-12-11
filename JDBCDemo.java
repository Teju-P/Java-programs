import java.io.*;
import java.sql.*;

class JDBCDemo{
    public static void main(String args[]) throws Exception{
        String url = "http://localhost/phpmyadmin/index.php?route=/sql&pos=0&db=jdbcdemo&table=customers";
        String username = "Teju";
        String password = "30052001";
        String query = "select * from customers";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString("name");
        System.out.println(name);
        st.close();
        conn.close();
        System.out.println("Connection closed");

    }
}