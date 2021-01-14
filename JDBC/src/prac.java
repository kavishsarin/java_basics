
import java.sql.*;
public class prac  {

	

 public static void forName() throws ClassNotFoundException{
	 // load the driver it belongs to the class [Class]
 }
public static Connection getConnection(String url) throws SQLException {
	 return con;
 }
 
 public static Connection getConnection(String url, String name, String password) throws SQLException {
	 return con;
 }
 public Statement createStatement() throws SQLException{
	 return stat;
 }
 //Statement stat = con.createStatement();
 
 public ResultSet executeQuery(String sql) throws SQLException {
	 return res_set;
 }
 
 
	public static void main(String[] args) {
		

	}


}




interface A{
	public void read();
}
class B implements A {
	public static void main(String args[]) {
		
	}
}
