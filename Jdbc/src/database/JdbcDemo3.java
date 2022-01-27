package database;
import java.sql.*;
public class JdbcDemo3 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql:///batch_6260";
        String userName = "root";
        String pwd = "12345";
        
        Connection con = DriverManager.getConnection(url,userName,pwd);
        //String sql = "select * from student_details;";
        String sql = "show tables;";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        /*
         * if(i>0) { System.out.println("inserted"); }else
         * System.out.println("not inserted");
         */
        
          while(rs.next()) { System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
          rs.getString(3)); }
         
    }

}
