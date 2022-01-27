package database;
import java.sql.*;


public class JdbcDemo 
{
        public static void main(String[] args) throws Exception 
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql:///batch_6260","root","12345");
           
           Statement st = con.createStatement();
           
           //int num = st.executeUpdate("select (6,'melody songs')");
           int num1 = st.executeUpdate("insert into music values(8,'emotional songs')");
           /*
            * ResultSet rs = st.executeQuery("select * from music"); while(rs.next()) {
            * System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)); }
            */

           
           String name = num1>0? "inserted":"not inserted";
           System.out.println(name);

        }

    }


