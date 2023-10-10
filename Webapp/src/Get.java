import java.sql.*;
public class Get {
	public static void get()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/hari";
		String username="root";
		String password="harithaa@13";
		String Query="select * from user";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rt=st.executeQuery(Query);
		while(rt.next()){
			System.out.println("userrname:"+rt.getString(1));
			System.out.println("userid:"+rt.getInt(2));
			System.out.println("userEmail:"+rt.getString(3));
		}
	}
	
	public static void main(String[]args)throws Exception {
		get();
	}

}
