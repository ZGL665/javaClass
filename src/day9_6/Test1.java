package day9_6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.bwf.dao.IUserdao;
import com.bwf.dao.impl.UserDao;
import com.bwf.entity.User;

public class Test1 {

	public static void main(String[] args) {

		IUserdao userDao = new UserDao();

		User user = new User();

		//�����û�
		/*user.setId(6);
		user.setName("51testing");
		user.setSex("Ů");
		user.setBirthday(new Date());*/

		/*
		 * int count=userDao.save(user); if(count==1) {
		 * 
		 * System.out.println("�û����ݱ���ɹ�"); }
		 */

		// ɾ���û���Ϣ
		// userDao.del(6);



		// �����û���Ϣ
		/*user.setId(5);
		user.setName("aaaa");
		user.setSex("��");
		user.setBirthday(new Date());
		
		userDao.update(user);*/


		//��ѯ�û�
		/*User u1=userDao.findById(1);
		u1=userDao.findById(5);
		System.out.println(u1.getName());*/


		//����name��ѯ����û�

		/*List<User> userList1=userDao.findByName("zhang");
		
		System.out.println(userList1);*/


		//��ѯ�����û�

/*		List<User> userlist2=userDao.findAll(1);
		System.out.println(userlist2.size());*/



	}
}