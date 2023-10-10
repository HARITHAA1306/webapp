import java.sql.*;
public class Insert {
	public static void insertdata()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/sys";
		String username="root";
		String password="harithaa@13";
		String Query="insert into user values(?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(2,1);
		pst.setString(1, "Harithaa");
		pst.setString(3, "harithaa@gmail.com");
		pst.executeUpdate();
		con.close();
		
		
	}
	public static void main(String[]args)throws Exception {
		insertdata();
	}

}
