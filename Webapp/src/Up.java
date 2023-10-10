import java.sql.*;
public class Up {
	public static void up()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/sys";
		String username="root";
		String password="harithaa@13";
		String Query="Select *from user";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		String sql="update user set name='Monika' where id=1";
		st=con.prepareStatement(Query);
		st.executeUpdate(sql);
		System.out.println("insertion complete");
		con.close();
		
	}
	public static void main(String[]args)throws Exception {
		up();
		
	}

}
