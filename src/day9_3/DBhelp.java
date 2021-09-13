package day9_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBhelp {

	private static String url = null;
	private static String user = null;
	private static String password = null;

	static {
		Properties pro = new Properties();

		try {
			pro.load(DBhelp.class.getResourceAsStream("dbconfig.properties"));

			url = pro.getProperty("url");
			password = pro.getProperty("password");
			user = pro.getProperty("user");

			Class.forName(pro.getProperty("driverClass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// �õ�����
	public static Connection getConn() {

		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("���Ӳ���");
			e.printStackTrace();
		}

		return conn;

	}

	// �ر���Դ

	public static void closeConn(Connection conn) {

		try {
			if (conn != null && !conn.isClosed()) {

				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			System.out.println("�ر���Դʧ��");
			e.printStackTrace();
		}

	}

}