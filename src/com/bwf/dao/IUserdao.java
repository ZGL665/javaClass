package com.bwf.dao;

import java.util.List;

import com.bwf.entity.User;

/**
 * �����û������ݲ���
 * 
 * @author zhangL
 *
 */
public interface IUserdao {
	/**
	 * @param save���� �����û�
	 * @return �ɹ��������������
	 */
	public int save(User user);

	/**
	 * @param ����idɾ��ĳ���û�
	 * @return �ɹ�ɾ���õĵĸ���
	 */
	public int del(int id);

	/**
	 * @param user ���û���Ϣ
	 * @return �޸ĳɹ� �ļ�¼��
	 */
	public int update(User user);

	/**
	 * �û���ѯ id ���ز�ѯ�����û�����
	 */
	public User findById(int id);

	/**
	 * @param name����������ѯ�����û�
	 * @return ����û�����
	 */
	public List<User> findByName(String name);

	/**
	 * ��ѯȫ��
	 * 
	 * @return ����û�����
	 */
	public List<User> findAll();

	/**
	 * ��ҳ��ѯ pageNum ҳ��
	 * 
	 * @return ����û�����
	 */
	public List<User> findAll(int pageNum);

	/**
	 * ���ݲ�ͬ������ѯ
	 * 
	 * @param user
	 * @return ����û�����
	 */
	public List<User> findBy(User user);

}