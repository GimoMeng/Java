package jdbc_test_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String pass = null;
		String url = "jdbc:mysql://localhost:3306/test1";
		String user = "root";
		String password = "1234";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, password);
		String username = "zhangsan";
		String sql = "select password from user where username = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			pass = rs.getString(1);
			System.out.println(pass);
		}
		ps.close();
		conn.close();
		//String sql = "select * from user";		
		//Statement st = conn.createStatement();
		//ResultSet rs = st.executeQuery(sql);
		//while(rs.next()){
			//用下标
			//System.out.println(rs.getInt(1));
			//用列名
			//System.out.println(rs.getInt("id"));
			//System.out.println(rs.getString(2));
			//System.out.println(rs.getString(3));
		//}
		//st.close();
		//conn.close();
	}

}
