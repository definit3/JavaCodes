import java.sql.*;
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:/home/definite/Downloads/trgdb/empdb");
		System.out.println("Connection successfully created");
		Statement st=con.createStatement();
		String sql="select * from employee";
		ResultSet rs=st.executeQuery(sql);
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
		String sql1;
//		sql1="Insert into employee values(201,'Personx',33000,'1988-12-31')";
//		st.executeUpdate(sql1);
		sql1="Update employee set salary=330000.50 where empid=201";
		st.executeUpdate(sql1);
		
		int eid[]= {301,302,303,304};
		String nm[]= {"Sudhir","John","Abcd","Kumar"};
		float sl[]= {15000,20000,30000,40000};
		String dob[]= {"1994-01-01","1995-01-01","1996-01-01","1997-01-01"};
		
		sql= "Insert into employee values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		for(int i=0;i<eid.length;i++)
		{
			pst.setInt(1,eid[i]);
			pst.setString(2,nm[i]);
			pst.setFloat(3, sl[i]);
			pst.setString(4,dob[i]);
			pst.executeUpdate();
		}
		
		sql="select * from employee";
		rs=st.executeQuery(sql);
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
