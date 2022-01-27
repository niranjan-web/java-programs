package database;
import java.sql.*;
import java.util.Scanner;

public class JdbcDemo4 
{

    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con  = DriverManager.getConnection("jdbc:mysql:///batch_6260","root","12345");
       
       Statement stmt  = con.createStatement();
       PreparedStatement ptmt = con.prepareStatement("insert into learners(rollNo,name, address, branch)  values(?,?,?,?)");
       /*
        * ResultSet rs = stmt.executeQuery("select distinct * from learners;");
        * 
        * while(rs.next()) { System.out.println(rs.getInt(1)+"\t"
        * +rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)); }
        */
       Scanner scan  = new Scanner(System.in);
       Scanner scan1  = new Scanner(System.in);

       System.out.println("enter the number");
       ptmt.setInt(1, scan.nextInt());
       System.out.println("enter the name ");
       ptmt.setString(2, scan1.nextLine());
       System.out.println("enter the address ");
       ptmt.setString(3, scan1.nextLine());
       System.out.println("enter the branch ");
       ptmt.setString(4, scan1.nextLine());
       
       int i  = ptmt.executeUpdate();
       
       /*
        * if(i>0) { System.out.println("inserted");yy }else {
        * System.out.println("not inserted"); }
        */
       
       String name = i>0? "inserted":"not inserted";
       System.out.println(name);
       scan.close();
       scan1.close();
    }

}
