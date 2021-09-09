package day9_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) throws Exception {

		
		
		//最好写在帮助类
		String url = "jdbc:mysql://localhost:3306/java14";

		String user = "root";

		String password = "root";

		Connection conn = DriverManager.getConnection(url, user, password);

		String sql = " select * from user where id=?  ";
		PreparedStatement pcmd = conn.prepareStatement(sql);
		
		pcmd.setInt(1, 5);
		//结果集
		ResultSet rs=pcmd.executeQuery();
		
		rs.next();
		String name=rs.getString("name");
		System.out.println(name);
		

		String score=rs.getString(5);
		System.out.println(score);
		
		sql="select * from  user where 1=1";
		pcmd=conn.prepareStatement(sql);
		rs=pcmd.executeQuery();
		
		//结果集
		rs=pcmd.executeQuery();
		
		
		while(rs.next()) {
			
			String sex=rs.getString("sex");
			String course=rs.getString("course");
			Date birthday=rs.getTimestamp("birthday");
			Date startdate=rs.getTimestamp("startdate");
				
			System.out.println(sex+"-"+course+"-"+birthday+"-"+startdate);
		}
		
		
		
		
		
		
	}

}
