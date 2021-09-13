package day9_7;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.bwf.util.DBhelp;

public class Test1 {

	public static void main(String[] args) {

		Connection conn = DBhelp.getConn();
		String sql = "insert into user(id,name,sex,birthday,startdate) values (?,?,?,?,?)";

		try {
			PreparedStatement pcmd = conn.prepareStatement(sql);
			pcmd.setInt(1, 11);
			pcmd.setString(2, "cc");
			pcmd.setString(3, "0");
			pcmd.setTimestamp(4, new Timestamp(new java.util.Date().getTime()));
			pcmd.setDate(5, new Date(new java.util.Date().getTime()));

			pcmd.executeUpdate();

			// ���������ύʱ��ʽ��Ĭ�����Զ��ύ
			conn.setAutoCommit(false);

			System.out.println(conn.getAutoCommit());

		} catch (SQLException e) {
			System.out.println("���ݿⱣ�������쳣");
			e.printStackTrace();

			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.println("�ع������쳣");
				e1.printStackTrace();
			}
		} finally {
			DBhelp.closeConn(conn);
		}

	}

}
