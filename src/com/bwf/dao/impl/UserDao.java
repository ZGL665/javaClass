package com.bwf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.bwf.dao.IUserdao;
import com.bwf.entity.User;
import com.bwf.util.DBhelp;

public class UserDao implements IUserdao {

	private Connection conn = null;
	private String sql;
	private PreparedStatement pcmd;
	private ResultSet rs;
	private List<User> list;

	@Override
	public int save(User user) {

		// ��ȡ����
		conn = DBhelp.getConn();
		sql = "insert into user(id,name,sex,birthday) values(?,?,?,?)";
		try {
			pcmd = conn.prepareStatement(sql);
			pcmd.setInt(1, user.getId());
			pcmd.setString(2, user.getName());
			pcmd.setString(3, user.getSex());
			pcmd.setDate(4, new java.sql.Date(new Date().getTime()));

			return pcmd.executeUpdate();

		} catch (SQLException e) {
			System.out.println("�����û�ʱ��������");
			e.printStackTrace();
			return 0;
		} finally {
			// �ر���Դ
			DBhelp.closeConn(conn);
		}

	}

	@Override
	public int del(int id) {
		// ��ȡ����
		conn = DBhelp.getConn();

		sql = "delete from user where id=?";

		try {
			pcmd = conn.prepareStatement(sql);
			pcmd.setInt(1, id);
			return pcmd.executeUpdate();

		} catch (SQLException e) {
			System.out.println("ɾ���û�ʱ��������");
			e.printStackTrace();

		} finally {

			// �ر���Դ
			DBhelp.closeConn(conn);

		}
		return 0;

	}

	@Override
	public int update(User user) {
		conn = DBhelp.getConn();
		sql = "update user set name=?,sex=?,birthday=? where id=?";
		try {
			pcmd = conn.prepareStatement(sql);

			pcmd.setString(2, user.getSex());
			pcmd.setString(1, user.getName());
			pcmd.setDate(3, new java.sql.Date(user.getBirthday().getTime()));
			pcmd.setInt(4, user.getId());

			return pcmd.executeUpdate();

		} catch (SQLException e) {
			System.out.println("�����û���Ϣʱ��������");
			e.printStackTrace();
		} finally {
			DBhelp.closeConn(conn);
		}

		return 0;
	}

	@Override
	public User findById(int id) {

		conn = DBhelp.getConn();
		sql = "select * from user where id=?";
		try {
			pcmd = conn.prepareStatement(sql);
			pcmd.setInt(1, id);
			rs = pcmd.executeQuery();
			// ���·�װһ��user
			if (rs.next()) {
				User user = new User();
				user.setId(id);
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setBirthday(rs.getDate("birthday"));

				return user;
			}

		} catch (SQLException e) {
			System.out.println("����id��ѯ�û���Ϣʱ��������");
			e.printStackTrace();
		} finally {
			DBhelp.closeConn(conn);
		}

		return null;
	}

	@Override
	public List<User> findByName(String name) {
		conn = DBhelp.getConn();
		list = new ArrayList<User>();
		sql = "select * from user where name like ?";
		// sql="select * from user where name concat('%',?,'%')"; ʹ�ú���

		try {
			pcmd = conn.prepareStatement(sql);
			pcmd.setString(1, '%' + name + '%');
			rs = pcmd.executeQuery();

			while (rs.next()) {

				User user2 = new User();
				user2.setName(rs.getString("name"));
				user2.setId(rs.getInt("id"));
				user2.setSex(rs.getString("sex"));
				user2.setBirthday(rs.getDate("birthday"));

				list.add(user2);

			}
			return list;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// �ͷ���Դ
			DBhelp.closeConn(conn);
		}

		return null;
	}

	@Override
	public List<User> findAll() {

		sql = "select * from user where 1=1";
		conn = DBhelp.getConn();
		list = new ArrayList<>();
		try {
			pcmd = conn.prepareStatement(sql);
			rs = pcmd.executeQuery();

			while (rs.next()) {

				User user3 = new User();
				user3.setId(rs.getInt("id"));
				user3.setName(rs.getString("name"));
				user3.setSex(rs.getString("sex"));
				user3.setBirthday(rs.getDate("birthday"));

				list.add(user3);

			}

			return list;

		} catch (SQLException e) {

			System.out.println("��ѯ�����û���Ϣʱ��������");
			e.printStackTrace();
		} finally {
			// �ر���Դ
			DBhelp.closeConn(conn);
		}

		return null;
	}

	@Override
	public List<User> findAll(int pageNum) {

		int start = (pageNum - 1) * 2;
		sql = "select * from user where 1=1 limit " + start + ",2";
		conn = DBhelp.getConn();
		list = new ArrayList<>();
		try {
			pcmd = conn.prepareStatement(sql);
			rs = pcmd.executeQuery();

			while (rs.next()) {

				User user3 = new User();
				user3.setId(rs.getInt("id"));
				user3.setName(rs.getString("name"));
				user3.setSex(rs.getString("sex"));
				user3.setBirthday(rs.getDate("birthday"));

				list.add(user3);

			}

			return list;

		} catch (SQLException e) {

			System.out.println("��ѯ�����û���Ϣʱ��������");
			e.printStackTrace();
		} finally {
			// �ر���Դ
			DBhelp.closeConn(conn);
		}

		return null;
	}

	@Override
	public List<User> findBy(User user) {
		conn = DBhelp.getConn();
		sql = "select * from user where 1=1";

		List params = new ArrayList();
		list = new ArrayList<>();

		if (user.getName() != null) {

			sql += "and name like concat('%',/,'%') ";

			params.add(user.getName());
		}

		if (user.getSex() != null) {

			sql += "and sex=?";
			params.add(user.getSex());
		}
		try {
			pcmd = conn.prepareStatement(sql);

			for (int i = 1; i < params.size(); i++) {

				pcmd.setObject(i, params.get(i - 1));

			}

			rs = pcmd.executeQuery();

			while (rs.next()) {

				User user4 = new User();
				user4.setId(rs.getInt("id"));
				user4.setName(rs.getString("name"));
				user4.setSex(rs.getString("sex"));
				user4.setBirthday(rs.getDate("birthday"));

				list.add(user4);

			}

			return list;

		} catch (SQLException e) {
			System.out.println("����������ѯʱ��������");
			e.printStackTrace();
		} finally {
			// �ύ����
			DBhelp.closeConn(conn);
		}

		return null;

	}
}