import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=DriverManager.getConnection("jdbc:derby:/home/definite/Downloads/trgdb/empdb");
		
		
		Statement st=con.createStatement();
		String sql="select * from employee";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print("  ");
			System.out.print(rs.getString(2));
			System.out.print("  ");
			System.out.print(rs.getBigDecimal(3));
			System.out.print("  ");
			System.out.println(rs.getDate(4));
		}
		
	
		sql= "Insert into employee values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		while(true)
		{
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter employee ID: ");
			int empi=myObj.nextInt();
			if(empi==0)break;
			pst.setInt(1,empi);
			myObj.nextLine();
			System.out.println("Enter employee Name: ");
			String name=myObj.nextLine();
			pst.setString(2,name);
			System.out.println("Enter Salary: ");
			float sal=myObj.nextFloat();
			pst.setFloat(3, sal);
			String dob;
			myObj.nextLine();
			System.out.println("Enter DOB: ");
			dob=myObj.nextLine();
			pst.setString(4,dob);
			pst.executeUpdate();
		}
		
		
		sql="select * from employee";
		rs = st.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print("  ");
			System.out.print(rs.getString(2));
			System.out.print("  ");
			System.out.print(rs.getBigDecimal(3));
			System.out.print("  ");
			System.out.println(rs.getDate(4));
		}
		

		con.close();
	}

}
