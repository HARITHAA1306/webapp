import java.sql.*;
public class Dr {
		public static void drop()throws Exception {
			String url="jdbc:mysql://127.0.0.1:3306/sys";
			String username="root";
			String password="harithaa@13";
			String Query="Select *from user";
			Connection con=DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement();
			String sql="drop table user";
			st=con.prepareStatement(Query);
			st.executeUpdate(sql);
			System.out.println("Table droped");
			con.close();
			
		}
		public static void main(String[]args)throws Exception {
			drop();
			
		}

	}


