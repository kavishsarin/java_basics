import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class pract {

	public static void main(String[] args)  {
		try {
		String query="create table emp (eid int ,ename varchar(20),dept varhcar(20))";
//      
		Class.forName("com.mysql.jdbc.Driver");// loading the driver 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","");
		Statement stat = con.createStatement();
	    ResultSet rs = stat.executeQuery(query);
	    
	    while(rs.next())  
	    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	    con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		 
	}

}

