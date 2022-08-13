package database;
import java.sql.*;
public class JdbcDEmo2 
{

    public static void main(String[] args) throws SQLException 
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///batch_6260","root","12345");
            
            Statement st = con.createStatement();
            String query = "insert into music( values (3,'tamil songs')";
            
            int i = st.executeUpdate(query);
            
            if(i>0)
            {
                System.out.println("inserted");
            }else
                System.out.println("not inserted");
            
            /*
             * ResultSet rs = st.executeQuery("select * from music");
             * 
             * while(rs.next()) { System.out.println(rs.getInt(1)+" " + rs.getString(2)); }
             */
            
        } catch (ClassNotFoundException e) 
        {
            
            e.printStackTrace();
        }
        
        
    }

}
