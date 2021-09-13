package day9_7;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.bwf.dao.impl.UserDao;
import com.bwf.entity.User;

public class UserDaoTest {
	private UserDao userDao;
	private User user;

	@Before
	public void setUp() {

		userDao = new UserDao();
		user = new User();

		user.setId(14);
		user.setName("ee");

	}

	// ¹¹Ôìº¯Êý
	public UserDaoTest() {

		userDao = new UserDao();
		user = new User();

		user.setId(13);
		user.setName("dd");
		user.setSex("1");
		user.setBirthday(new Timestamp(new Date().getTime()));

	}

	// @Test
	public void testSave() {

		int count = userDao.save(user);

		assertEquals(1, count);

	}

	// @Test
	public void testUpdate() {

		user.setName("ee2");
		int count = userDao.update(user);

		assertEquals(1, count);

	}

	@Test
	public void testFindById() {

		User u1 = userDao.findById(2);

		assertNotNull(u1);

		String name = u1.getName();

		assertEquals("lisi", name);

	}
	
	public void testFindAll() {
		
		
		List<User> userList=userDao.findAll();
		
		
		assertNotNull(userList);
		
		
		assertEquals(12, userList.size());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
