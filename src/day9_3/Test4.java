package day9_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/java14";
		String user = "root";
		String password = "root";

		List<Connection> list = new ArrayList<Connection>();

		System.out.println(list);

		for (int i = 0; i < 102; i++) {

			Connection conn = DriverManager.getConnection(url, user, password);
			
	       //用完就关掉
			if(i==50) {
				
				conn.close();
			}

			list.add(conn);
		}

		System.out.println(list.size());

	}

}
