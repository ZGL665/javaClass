package day9_3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws Exception {

		// ��̬ʵ����
		User u1 = (User) Class.forName("day9_3.User").newInstance();
		System.out.println(u1);

		// ��̬ʵ����
		User u2 = new User();
		System.out.println(u2);

		System.out.println("===========ע������============");

		// ������������򣬼������еľ�̬�Ĵ���飬������ע�ᵽ�����������У��Ա�������
		// ��services�ļ����Զ�����
		// Class.forName("com.mysql.jdbc.Driver");

		System.out.println("===========��������============");

		String url = "jdbc:mysql://localhost:3306/java14";

		String user = "root";

		String password = "root";

		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);

		System.out.println("===========����statement============");

		Statement cmd = conn.createStatement();
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("����������"); String
		 * name=sc.nextLine();
		 * 
		 * String sql="insert into user(name) values('"+name+"')";
		 */

		String sql = "delete from user where id>=10";

		sql = "update user set name='��Ϊ��' where id=5";

		/*
		 * Boolean flag =cmd.execute(sql); System.out.println(flag);
		 */

		int count = cmd.executeUpdate(sql);
		System.out.println(count);

		System.out.println("========prepareStatement=========");
		// sql="insert into user(id,name) values(?,?)";
		PreparedStatement pcmd = conn.prepareStatement(sql);

		/*
		 * pcmd.setInt(1,8); 
		 * pcmd.setString(2, "��Ϊ��");
		 * 
		 * pcmd.execute();
		 */
		sql = "insert into user(id,name,birthday,startdate) values(?,?,?,?)";
		pcmd = conn.prepareStatement(sql);
		

		pcmd.setInt(1, 9);
		pcmd.setString(2, "51testing");
		/*pcmd.setDate(3, new Date(new java.util.Date().getTime()));
		pcmd.setTimestamp(4, new Timestamp(new java.util.Date().getTime()));*/

		
		
		pcmd.setString(3, "2021-9-6 15:21:30");
		pcmd.setString(4, "2021-9-6 15:21:30");
		
		//pcmd.executeUpdate();
		
		System.out.println(new Date(2021-1900,1,4));
		
		System.out.println(new java.util.Date());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
