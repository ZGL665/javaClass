package day9_7;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bwf.util.DBhelp;


public class Test1 {

	public static void main(String[] args)   {

		Connection conn = DBhelp.getConn();
		String sql="insert into user(id,name,sex,birthday,startdate) values (?,?,?,?,?)";
	
		
		try {
			PreparedStatement pcmd=conn.prepareStatement(sql);
			pcmd.setInt(1, 10);
			pcmd.setString(2, "bb");
			pcmd.setString(3,"1");
			pcmd.setDate(4, new Date(new java.util.Date().getTime()));
			pcmd.setDate(5, new Date(new java.util.Date().getTime()));
			
			pcmd.executeUpdate();
			
			
			//设置事务提交时方式，默认是自动提交
			conn.setAutoCommit(false);
			
			System.out.println(conn.getAutoCommit());
			
			
		} catch (SQLException e) {
			System.out.println("数据库保存遇到异常");
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.println("回滚遇到异常");
				e1.printStackTrace();
			}
		}finally {
			DBhelp.closeConn(conn);
		}

		
		
		
	}

}
