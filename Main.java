import java.sql.*;

public class Main
{
    public static void main(String[] args) throws ClassNotFoundException,SQLException
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/mydatabase";
        Connection conn = DriverManager.getConnection(url,"root", "root");
        System.out.println("Connection success!");

        //to create the query
       Statement stm = conn.createStatement();
       ResultSet rs = stm.executeQuery("SELECT * FROM new_table");
       while(rs.next())
       {
           String name = rs.getString("name");
           System.out.println(name);
       }

    }
}
