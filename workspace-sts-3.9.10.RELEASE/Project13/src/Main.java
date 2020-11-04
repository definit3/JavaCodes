import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:derby:/home/definite/Downloads/trgdb/empdb");
		ArrayList<Employee> emp= new ArrayList<Employee>();
		
		Statement st=con.createStatement();
		String sql="select * from employee";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next())
		{
			emp.add(new Employee(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getString(4)));
		}
		for(Employee e:emp)
		{
			e.show();
			System.out.println("\n");
		}
	}

}
