import java.sql.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GLAE21", "root","");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from stu");// hold the value

        try(con;s;rs){
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+ " "+rs.getString(2) + " " + rs.getInt(3));
        }
        }
    }
}
