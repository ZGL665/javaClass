package day9_6;

import java.io.IOException;
import java.util.Properties;

import javax.naming.event.NamespaceChangeListener;

public class Test1 {

	public static void main(String[] args) throws Exception {

		/*
		 * IUserSvevice userSvevice=new UserService1(); userSvevice.show();
		 */

		Properties pro = new Properties();
		pro.load(Test1.class.getResourceAsStream("obj.properties"));

		//IUserSvevice userSvevice = (IUserSvevice)Class.forName(pro.getProperty("userservice"));
		
		//userSvevice.show();

	}

}
